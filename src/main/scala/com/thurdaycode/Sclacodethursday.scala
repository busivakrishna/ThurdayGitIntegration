package com.thurdaycode
import org.apache.spark.sql.SparkSession
object Sclacodethursday {
  def main(args:Array[String]): Unit= {
    //creating spark session
    val spark: SparkSession = SparkSession
      .builder().master("local[*]")
      .appName("DATA FROM AWS S3")
      .getOrCreate()

    //Only Comments in this code
    //ctrl + shift + /
    val name = "spark"
    val age = 12
    val Lang = "Scala"
  }

}
