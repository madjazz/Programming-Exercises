n = int(input())
key_values = [input().split() for _ in range(n)]
phone_dict = {key: value for key, value in key_values}
while True:
    try:
        name = input()
        if name in phone_dict:
            print("{}={}".format(name, phone_dict[name]))
        else:
            print("Not found")
    except:
        break
