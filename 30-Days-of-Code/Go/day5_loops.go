package main

import (
    "fmt"
    "bufio"
    "os"
    "strconv"
)

func main() {


    var n int
    var result int

    scanner := bufio.NewScanner(os.Stdin)

    for scanner.Scan() {
        line := scanner.Text()

        if _, err := strconv.Atoi(line); err == nil {

            n, _ = strconv.Atoi(line)
        }
    }

    for i := 1; i < 11; i++ {
        result = n * i
        fmt.Println(n, "x", i, "=", result)
    }
}
