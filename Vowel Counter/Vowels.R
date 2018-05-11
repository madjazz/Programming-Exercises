vowels <- c("a", "e", "i", "o", "u")

s <- "jhfuhiuahiaho"

v_count <- 0

for (i in strsplit(s, "")[[1]]) {
  if (i %in% vowels) {
    v_count <- v_count + 1
  }
  else {
    next(i)
  }
}

cat("Number of vowels: ", v_count)
