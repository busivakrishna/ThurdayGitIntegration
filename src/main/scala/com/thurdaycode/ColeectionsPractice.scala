package com.thurdaycode

import scala.collection.immutable.List

object ColeectionsPractice {
  // Main method
  def main(args:Array[String]) {
    /*A list is a collection which contains immutable data.
Lists are immutable whereas arrays are mutable in Scala.
In a Scala list, each element must be of the same type.*/
    // Scala program to print immutable lists
    // Creating and initializing immutable lists
    val mylist1: List[String] = List("Geeks", "GFG",
      "GeeksforGeeks", "Geek123")
    val mylist2 = List("C", "C#", "Java", "Scala",
      "PHP", "Ruby")

    // Display the value of mylist1
    println("List 1:")
    println(mylist1)

    // Display the value of mylist2 using for loop
    println("\nList 2:")
    for(mylist<-mylist2)
    {
      println(mylist)
    }

    //HEAD Operation
    // Creating a List.
    val mylist = List("C", "C#", "Java", "Scala",
      "PHP", "Ruby")
    println("The head of the list is:")
    println(mylist.head)

    //tail: This method returns a list consisting of all elements except the first.
    println("The tail of the list is:")
    println(mylist.tail)

    //isEmpty: This method returns true if the list is empty otherwise false.
    println("List is empty or not:")
    println(mylist.isEmpty)

    /*Uniform List can be created in Scala using List.fill() method.
List.fill() method creates a list and fills it with zero or more copies of an element.*/

    // Repeats Scala three times.
    val programminglanguage = List.fill(3)("Scala")
    println( "Programming Language : " + programminglanguage )

    // Repeats 2, 10 times.
    val number= List.fill(8)(4)
    println("number : " + number)

    /*The list order can be reversed in Scala using List.reverse method.
List.reverse method can be used to reverse all elements of the list.*/

    // reversing a list
    println("Reverse list:" + mylist.reverse)


  }

}
//intersect, diff, union