#PASSWORD GENERATOR

import random as r
symbols = '''ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890
$#@_~-.'''
length = int(input("Enter password length: "))
if length <= 0:
    print("Password length must be positive")
else:
    for i in range(length):
        print(r.choice(symbols),end = "")