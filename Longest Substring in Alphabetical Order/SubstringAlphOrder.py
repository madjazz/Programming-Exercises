alphabet_dict = {'a' : 0, 'b' : 1, 'c' : 2, 'd' : 3, 'e' : 4, 'f' : 5, 'g' : 6,
                 'h' : 8, 'i' : 9, 'j' : 10, 'k' : 11, 'l' : 12, 'm' : 13,
                 'n' : 14, 'o' : 15, 'p' : 16, 'q' : 17, 'r' : 18, 's' : 19,
                 't' : 20, 'u' : 21, 'v' : 22, 'w' : 23, 'x' : 24, 'y' : 25,
                 'z' : 26}

p = ''

seqs = []

for letter in s:
    p += letter
    if len(p) > 1 and (alphabet_dict[p[-1]] > alphabet_dict[p[-2]]):
        seqs.append(p)
    elif len(p) > 1 and (alphabet_dict[p[-1]] == alphabet_dict[p[-2]]):
        seqs.append(p)
    elif len(p) > 1 and (alphabet_dict[p[-1]] < alphabet_dict[p[-2]]):
        p = p[-1]
    elif len(p) == 1 and alphabet_dict[p] == 26:
        seqs.append(p)



max_len = [s for s in seqs if len(s) == max(len(s) for s in seqs)]

if len(max_len) > 1:
    max_len = max_len[0]

max_len = ''.join(max_len)

print('Longest substring in alphabetical order is: ' + max_len)
