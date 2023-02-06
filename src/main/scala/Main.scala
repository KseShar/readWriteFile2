import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.io.StdIn.readLine
import java.io.PrintWriter

object Main {

  def main(args: Array[String]): Unit = {
    println("Enter the file name!")
    val fileName = readLine()

    val source = Source.fromFile(fileName, "UTF-8")
    /*var masWord = new ArrayBuffer[String]()
    for (lineIterator <- source.getLines()) masWord ++= lineIterator.split(" ")
    masWord.filter(_.length > 11).map(println(_))*/
    //or
    source.mkString.split(" ").filter(_.length > 11).map(println(_))
    source.close()
}
}