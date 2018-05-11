package main

import (
    "fmt"
    "bufio"
    "os"
    "strconv"
    )

func main() {

    var even string
    var odd string

    scanner := bufio.NewScanner(os.Stdin)

    for scanner.Scan() {
        line := scanner.Text()

        if _, err := strconv.Atoi(line); err == nil {
            // Do nothing
        } else {
            for i := 0; i < len(line); i++ {

            if i % 2 == 0 {
                even += string(line[i])
            } else {
                odd += string(line[i])
            }

        }

        fmt.Println(even, odd)
        odd = ""
        even = ""
        }

    }

}
