/*
 * Copyright 2021 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.utils

import org.mongodb.scala.MongoClient
import org.mongodb.scala.bson.collection.immutable.Document
import play.api.libs.iteratee.Done
import scala.concurrent.ExecutionContext.Implicits.global

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

object MongoConnection {

  private val timeout: FiniteDuration = 10.seconds

  private val mongoClient: MongoClient = MongoClient()

  sys.addShutdownHook {
    mongoClient.close()
  }

  def dropMongoCollection(db: String, collection: String): Unit =
    try Await.result(
      mongoClient
        .getDatabase(db)
        .getCollection(collection)
        .drop()
        .head(),
      timeout
    )
    catch {
      case e: Exception => println("Error: " + e)
    }

  def insert(source: List[String], database: String, collection: String): Unit = {

    dropMongoCollection(database, collection)

    try {
      val db  = mongoClient.getDatabase(database)
      val col = db.getCollection(collection)
      source.map { e =>
        val doc = Document(e)
        Await.result(
          col.insertOne(doc).toFutureOption().map { _ =>
            Done
          },
          timeout
        )
      }
    } catch {
      case ex: Exception => println(s"Error inserting data into MongoDB: $ex")
    }
  }
}
