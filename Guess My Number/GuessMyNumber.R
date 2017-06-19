low <- 0
mid <- 50
high <- 100

guess <- "Is your secret number: "

cat("Please think of a number between 0 and 100!")

cat(guess, mid, "?")

request <- readline("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly.")

while (request != 'c') {
  if  (request == 'h') {
    high = mid
    mid = as.integer((mid + low) / 2)
  }
  else if (request == 'l') {
    low = mid
    mid = as.integer((mid + high) / 2)
  }
  else {
    cat("Sorry, I did not understand your input.")
  }
  cat(guess, mid, "?")
  request = readline("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ")
}
  
if (request == 'c') {
  cat("Game over. Your secret number was: ", mid)
}