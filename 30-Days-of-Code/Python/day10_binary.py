#!/bin/python3

import math
import os
import random
import re
import sys

def binary(n):
    return format(n, "b")

def consecutives(n):
    count = 0
    maximum = 0
    for i in range(len(n)):
        if "1" in n[i]:
            count += 1
            if maximum <= count:
                maximum = count
            else:
                continue
        else:
            count = 0
    return maximum

if __name__ == '__main__':
    n = int(input())
    print(consecutives(binary(n)))
