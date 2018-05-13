object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

        // Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val var_int = scala.io.StdIn.readInt()
        val var_double = scala.io.StdIn.readDouble()
        val var_string = scala.io.StdIn.readLine()

        // Print the sum of both the integer variables
        println(i + var_int)

        // Print the sum of both the double variables
        println(d + var_double)

        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s + var_string)
      }
}
