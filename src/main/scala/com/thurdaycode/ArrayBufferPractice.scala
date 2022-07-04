package com.thurdaycode
import scala.collection.mutable.ArrayBuffer

object ArrayBufferPractice {
  // Main method
  def main(args:Array[String]): Unit = {
    // Instance of ArrayBuffer is created
    var name = ArrayBuffer[String]()
    name += "GeeksForGeeks"
    name += "gfg"
    name += "Chandan"
    println(name)

    //Access element from ArrayBuffer:
    println(name(1))

    //Adding elements in ArrayBuffer:
    // Instance of ArrayBuffer is created
    var name1 = ArrayBuffer[String]()

    // adding one element
    name1 += "GeeksForGeeks"

    // add two or more elements
    name1 += ("gfg", "chandan")

    // adding one or more element using append method
    name1.append("S-series", "Ritesh")

    // printing arraybuffer
    println(name1)

    //Deleting ArrayBuffer Elements:
    // Instance of ArrayBuffer is created
    var named = ArrayBuffer( "GeeksForGeeks","gfg",
      "chandan","S-series",
      "Ritesh" )

    // deletes one element
    named -= "GeeksForGeeks"

    // deletes two or more elements
    named -= ("gfg", "chandan")

    // printing resultant arraybuffer
    println(named)

    //Deleting ArrayBuffer Elements using ArrayBuffer.remove()
    // Instance of ArrayBuffer is created
    var namer = ArrayBuffer( "GeeksForGeeks",
      "gfg", "chandan",
      "S-series", "Ritesh" )

    // removing 0th index element
    namer.remove(0)

    // printing resultant arraybuffer
    println(name)
    namer.remove(1, 3)

    // printing resultant arraybuffer
    println(namer)

  }

}
