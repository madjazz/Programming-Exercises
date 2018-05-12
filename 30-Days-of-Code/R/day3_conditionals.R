# Enter your code here. Read input from STDIN. Print output to STDOUT

n <- as.numeric(readLines(file("stdin")))

if (n != 0 & n %% 2 != 0 & n <= 100) {
  write("Weird", stdout())
} else if (n %% 2 == 0 & n != 0 & n > 1 & n <= 5) {
  write("Not Weird", stdout())
} else if (n %% 2 == 0 & n > 5 & n <= 20) {
  write("Weird", stdout())
} else if (n %% 2 == 0 & n > 20 & n <= 100) {
  write("Not Weird", stdout())
} else {
  write("Weird", stdout())
}