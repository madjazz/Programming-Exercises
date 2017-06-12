sub_string = 'bob'
sub_string_length = len(sub_string)

s <- "jhfuhiuahiahobobob"

bobs = 0

for i in range(len(s)):
    if s[i : i + sub_string_length] == sub_string:
        bobs += 1
    else:
        next
print("Number of times bob occurs is: " + str(bobs))
