# Enter your code here. Read input from STDIN. Print output to STDOUT

vec <- readLines(file("stdin"))

meal_cost <- as.numeric(vec[1])
tip_percent <- as.integer(vec[2])
tax_percent <- as.integer(vec[3])

tip_percent <- tip_percent / 100
tax_percent <- tax_percent / 100 

tip <- meal_cost * tip_percent
tax <- meal_cost * tax_percent

total_cost <- round(meal_cost + tip + tax)

write(paste("The total meal cost is", total_cost, "dollars."), stdout())

