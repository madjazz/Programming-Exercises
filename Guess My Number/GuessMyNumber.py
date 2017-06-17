#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Jun 16 18:37:10 2017

Guess my number

@author: Timo
"""

low = 0
mid = 50
high = 100

guess = "Is your secret number: "

print("Please think of a number between 0 and 100!")

print(guess + str(mid) + "?")

request = input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ")

while request != 'c':
    if  request == 'h':
        high = mid
        mid = int((mid + low)/2)
    elif request == 'l':
        low = mid
        mid = int((mid + high)/2)
    else:
        print("Sorry, I did not understand your input.")
    print(guess + str(mid) + "?")
    request = input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly. ")
    
if request == 'c':
    print("Game over. Your secret number was: " + str(mid))