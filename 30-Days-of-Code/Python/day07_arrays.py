#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

new_arr = [str(item) for item in reversed(arr)]

print(" ".join(new_arr))
