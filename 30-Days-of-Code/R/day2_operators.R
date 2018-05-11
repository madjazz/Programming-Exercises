
meal_cost <- as.numeric(readline())
tip_percent <- as.integer(readline())
tax_percent <- as.integer(readline())
  
tip_percent <- as.numeric(tip_percent/100)
tax_percent <- as.numeric(tax_percent/100)

tip <- as.numeric(meal_cost * tip_percent)
tax <- as.numeric(meal_cost * tax_percent)

total_cost <- round(meal_cost + tip + tax)
  
paste("The total meal cost is", total_cost, "dollars.")
