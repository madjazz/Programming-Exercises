i <- 4
d <- 4.0
s <- 'HackerRank '

# Declare second integer, double, and String variables.

# Read and save an integer, double, and String to your variables.

vec <- readLines(file("stdin"))

var_int <- as.integer(vec[1])
var_double <- as.numeric(vec[2])
var_string <- vec[3]

# Print the sum of both integer variables on a new line.
i + var_int

# Print the sum of the double variables on a new line.
d + var_double

# Concatenate and print the String variables on a new line
# The 's' variable above should be printed first.

write(paste0(s, var_string), stdout())