package main

import (
    "fmt"
    "os"
    "bufio"
    "strconv"
)

func main() {

    var mealCost float64
    var tipPercent float64
    var taxPercent float64
    var tip float64
    var tax float64
    var totalCost float64

    scanner := bufio.NewScanner(os.Stdin)

    for scanner.Scan() {
        line := scanner.Text()

        if _, err := strconv.ParseFloat(line, 64); err == nil {

            if mealCost == 0 {
                mealCost, _ = strconv.ParseFloat(line, 64)

            } else if tipPercent == 0 {
                tipPercent, _ = strconv.ParseFloat(line, 64)

            } else if taxPercent == 0 {
                taxPercent, _ = strconv.ParseFloat(line, 64)
            }

        }

    }

    tip = mealCost * (tipPercent / 100)
    tax = mealCost * (taxPercent / 100)

    totalCost = mealCost + tip + tax

    output := fmt.Sprintf("The total meal cost is %.0f dollars.", totalCost)
    fmt.Println(output)
}
