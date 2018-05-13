# Enter your code here. Read input from STDIN. Print output to STDOUT

n <- as.numeric(readLines(file("stdin")))

for (i in 1:10) {
  result <- n * i
  write(paste(n, "x", i, "=", result), stdout())
}