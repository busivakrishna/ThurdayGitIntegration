package com.thurdaycode
import Array._

object ArrayPractice {
  // Main method
  def main(args:Array[String]): Unit = {

    /*Array is a special kind of collection in scala. it is a fixed size data structure that stores elements of the same data type.
    The index of the first element of an array is zero and the last element is the total number of elements minus one.
      It is a collection of mutable values.*/  //ctrl + shift  + /

    // allocating memory of 1D Array of string.
    var days = Array("Sunday", "Monday", "Tuesday",
      "Wednesday", "Thursday", "Friday",
      "Saturday" )

    println("Array elements are : ")
    for ( m1 <-days )
    {
      println(m1 )
    }

    // Scala program to accessing an array
    // allocating memory of 1D Array of string.
    var name1 = Array("gfg", "geeks", "GeeksQuize",
      "geeksforgeeks" )

    println("second element of an array is: ")

    // Accessing an array element
    println(name1(1) )

    // Scala program to updating an array
    // allocating memory of 1D Array of string.
    var name2 = Array("gfg", "geeks", "GeeksQuize",
      "geeksforgeeks" )

    // Updating anelement in an array
    name2(1)="employee"
    println("After updation array elements are: ")

    for ( m1 <-name2 )
    {
      println(m1 )
    }

    // Scala program to adding elements in an array
    var namen = new Array[String](4)

    // Adding element in an array
    namen(0)="gfg"
    namen(1)="geeks"
    namen(2)="GeeksQuize"
    namen(3)="geeksforgeeks"
    println("After adding array elements : ")

    for ( m1 <-namen )
    {
      println(m1 )
    }

    // Scala program to concatenate two array
    var arr1 = Array(1, 2, 3, 4)
    var arr2 = Array(5, 6, 7, 8)

    var arr3 = concat( arr1, arr2)

    // Print all the array elements
    for ( x <- arr3 )
    {
      println( x )
    }

    //Append and Prepend elements to an Array in Scala
    // Declaring an array
    val a = Array(45, 52, 61)
    println("Array a ")
    for ( x <- a )
    {
      println( x )
    }

    // Appending 1 item
    val b = a :+ 27
    println("Array b ")
    for ( x <- b )
    {
      println( x )
    }

    // Appending 2 item
    val c = b ++ Array(1, 2)
    println("Array c ")
    for ( x <- c )
    {
      println( x )
    }

    // Prepending 1 item
    val d = 3 +: c
    println("Array d ")
    for ( x <- d )
    {
      println( x )
    }

    // Prepending 2 item
    println("Array e ")
    val e = Array(10, 25) ++: d
    for ( x <- e )
    {
      println( x )
    }

  }

}
