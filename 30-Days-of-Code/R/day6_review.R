# Enter your code here. Read input from STDIN. Print output to STDOUT

vec <- readLines(file("stdin"))

splitter <- function(vector) {
  vector <- strsplit(vector, "")[[1]]
  even <- ""
  odd <- ""
  for (i in 1:length(vector)) {
    if (i %% 2 == 0) {
      even <- paste0(even, vector[i])
    } else {
      odd <- paste0(odd, vector[i])
    }
  }
  
  return(paste(odd, even))
}

for (i in 1:length(vec)) {
  if (nchar(vec[i]) > 2) {
    write(splitter(vec[i]), stdout())
  } else {
    next
  }
}