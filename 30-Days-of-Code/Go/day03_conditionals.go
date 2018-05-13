package main

import (
    "fmt"
    "os"
    "bufio"
    "strconv"
)


func main() {

    var n int

    scanner := bufio.NewScanner(os.Stdin)

    for scanner.Scan() {
        line := scanner.Text()

        n, _ = strconv.Atoi(line)

        if n % 2 != 0 && n != 0 && n <= 100 {
            fmt.Println("Weird")
        } else if n % 2 == 0 && n != 0 && n >= 2 && n < 6 {
            fmt.Println("Not Weird")
        } else if n % 2 == 0 && n > 5 && n <= 20 {
            fmt.Println("Weird")
        } else if n % 2 == 0 && n > 20 && n < 101 {
            fmt.Println("Not Weird")
        } else {
            fmt.Println("Not Weird")
        }
    }

}
