#!/bin/python3

import sys

if __name__ == "__main__":
    meal_cost = float(input().strip())
    tip_percent = int(input().strip())
    tax_percent = int(input().strip())

    tip_percent = float(tip_percent/100)
    tax_percent = float(tax_percent/100)
    tip = float(meal_cost * tip_percent)

    tax = float(meal_cost * tax_percent)
    total_cost = round(meal_cost + tip + tax)

    print("The total meal cost is {} dollars.".format(total_cost))
