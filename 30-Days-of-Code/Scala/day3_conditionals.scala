import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val N = stdin.readLine.trim.toInt

        if ((N != 0) && ((N % 2) != 0) && (N <= 100)) {
            println("Weird")
        } else if ((N % 2 == 0) && (N != 0) && (N > 1) && (N <= 5)) {
            println("Not Weird")
        } else if ((N % 2 == 0) && (N > 5) && (N <= 20)) {
            println("Weird")
        } else if ((N % 2 == 0) && (N > 20) && (N <= 100)) {
            println("Not Weird")
        } else {
            println("Weird")
        }
    }
}
