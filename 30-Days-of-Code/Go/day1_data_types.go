package main


import (
  "fmt"
  "os"
  "bufio"
  "strconv"
)

func main() {
  	var _ = strconv.Itoa // Ignore this comment. You can still use the package "strconv".

    var i uint64 = 4
    var d float64 = 4.0
    var s string = "HackerRank "

    scanner := bufio.NewScanner(os.Stdin)

    // Declare second integer, double, and String variables.

    var i2 uint64
    var d2 float64
    var s2 string

    // Read and save an integer, double, and String to your variables.

    for scanner.Scan() {
        line := scanner.Text()

        if _, err := strconv.ParseUint(line, 10, 64); err == nil {

            i2, _ = strconv.ParseUint(line, 10, 64)

        } else if _, err := strconv.ParseFloat(line, 64); err == nil {

            d2, _ = strconv.ParseFloat(line, 64)

        } else {

            s2 = line
        }

    }

    // Print the sum of both integer variables on a new line.
        fmt.Println(i + i2)

    // Print the sum of the double variables on a new line.
        fmt.Printf("%.1f\n", d + d2)

    // Concatenate and print the String variables on a new line
       fmt.Println(s + s2)

    // The 's' variable above should be printed first.
}
