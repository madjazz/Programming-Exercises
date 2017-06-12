vowels = ['a', 'e', 'i', 'o', 'u']

s <- "jhfuhiuahiaho"

v_count = 0

for element in s:
    if element in vowels:
        v_count += 1
    else:
        next

print('Number of vowels: ' + str(v_count))
