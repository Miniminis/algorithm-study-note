# python 100제 
# 1
# print("Hello")

# 2
# print("Hello", "World")

# 3
# print("Hello")
# print("World")

# 4
# print("'Hello'")

# 5
# print('"Hello World"')

# 6
# print('"!@#$%^&*()\'')

# 7
# print("\"C:\Download\\'hello\'.py\"")

# 8
# print('print("Hello\\nWorld")')

# 9
# print(input())

# 10
# print(int(input()))

# 11
# print(float(input()))

# 12
# a = input() 
# b = input()
# print(a)
# print(b)

# 13 
# a = input() 
# b = input()
# print(b)
# print(a)

# 14
# a = float(input())
# print(a)
# print(a)
# print(a)

# 15
# a, b = input().split()
# print(a)
# print(b)

# 16
# a, b = input().split()
# print(b, a)

# 17
# a = input()
# print(a, a, a)

# 18
# a, b = input().split(':')
# print(a, b, sep=':')

# 19
# y, m, d = input().split('.')
# print(d, m, y, sep='-')

# 20
# a, b = input().split('-')
# print(a, b, sep='')

# 21
# word = input()
# print(word[0])
# print(word[1])
# print(word[2])
# print(word[3])
# print(word[4])

# 22
# birth = input()
# print(birth[0:2], birth[2:4], birth[4:6])

# 23
# h, m, s = input().split(':')
# print(m)

# 24 
# a, b = input().split()
# s = a + b
# print(s)

# 25
# a, b = input().split()
# sum = int(a) + int(b)
# print(sum)

# 26 
# a = input()
# b = input()
# sum = float(a) + float(b)
# print(sum)

# 27 
# a = input()
# n = int(a)
# print('%x'%n)

# 28
# a = input()
# n = int(a)
# print('%X'%n)

# 29
# a = input()
# n = int(a, 16)
# print('%o'%n)

# 30 : 10진수 유니코드로 변환하기 
# a = input()
# print(ord(a))

# 31 : 유니코드로 변환하기
# a = int(input())
# print(chr(a))

# 32
# a = int(input())
# print(-a)

# 33
# a = input()
# print(chr(ord(a)+1))

# 34
# a, b = map(int, input().split())
# print(a-b)

# 35
# a, b = map(float, input().split())
# print(a*b)

# 36
# word, n = map(str, input().split())
# print(word * int(n))

# 37
# n = int(input())
# s = input()
# print(n * s)

# 38 거듭제곱
# a, b = map(int, input().split())
# print(a ** b)

# 39 실수 거듭제곱
# a, b = map(float, input().split())
# print(a ** b)

# 40 
# a, b = map(int, input().split())
# print(a//b)

# 41
# a, b = map(int, input().split())
# print(a%b)

# 42 : 반올림
# a = float(input())
# print(format(a, ".2f"))

# 43
# f1, f2 = map(float, input().split())
# result = f1 / f2
# print(format(result, ".3f"))

# 44
# a, b = map(int, input().split())
# print(a+b)
# print(a-b)
# print(a*b)
# print(a//b)
# print(a%b)
# print(format(a/b, '.2f'))

# 45 : 평균구하기
# arr = list(map(int, input().split()))
# sum = sum(arr)

# # 1 -> 2.0
# import numpy
# avg = format(numpy.mean(arr), '.2f')

# # 2 -> 2
# # import statistics
# # avg = statistics.mean(arr)

# # 3 -> 2.0
# # avg = sum / len(arr)

# print(sum, avg)

# 46
# n = int(input())
# print(n*2)

# 47
# a, b = map(int, input().split())
# print(a*(2**b))

# 48
# a, b = map(int, input().split())
# print(a<b)

# 49
# a, b = map(int, input().split())
# print(a==b)

# 50
# a, b = map(int, input().split())
# print(b >= a)

# 51
# a, b = map(int, input().split())
# print(a!=b)

# 52
# n = int(input())
# print(bool(n))

# 53
# n = int(input())
# print(not bool(n))

# 54
# a, b = map(int, input().split())
# print(bool(a) and bool(b))

# 55
# a, b = map(int, input().split())
# print(bool(a) or bool(b))

# 56
# a, b = map(bool, map(int, input().split()))
# print((a and not b) or (not a and b))

# 57 
# a, b = map(bool, map(int, input().split()))
# print((a and b) or (not a and not b))

# 58
# a, b = map(bool, map(int, input().split()))
# print(not a and not b)

# 59
# a = int(input())
# print(~a)

# 60 
# a, b = map(int, input().split())
# print(a & b)

# 61
# a, b = map(int, input().split())
# print(a | b)

# 62
# a, b = map(int, input().split())
# print(a ^ b)

# 63
# a, b = map(int, input().split())
# print(a if a > b else b)

# 64
# a, b, c = map(int, input().split())
# print(a if a < b and a < c else b if b < c and b < a else c)

# 65
# a, b, c = map(int, input().split())
# if a % 2 == 0:
#   print(a)

# if b % 2 == 0:
#   print(b)

# if c % 2 == 0:
#   print(c)

# 66 
# arr = list(map(int, input().split()))

# for a in arr:
#   if a % 2 == 0:
#     print("even")
#   else:
#     print("odd")

# # 67
# n = int(input())

# if n<0 :
#   if n%2==0 :
#     print('A')
#   else :
#     print('B')
# else :
#   if n%2==0 :
#     print('C')
#   else :
#     print('D')

# 68
# n = int(input())

# if n>=90 :
#   print('A')
# elif n>=70 :
#   print('B')
# elif n>=40 :
#   print('C')
# else :
#   print('D') 

# 69
# word = input()

# if word == 'A':
#   print('best!!!')
# elif word == 'B':
#   print('good!!')
# elif word == 'C':
#   print('run!')
# elif word == 'D':
#   print('slowly~')
# else:
#   print('what?')

# 70
# month = int(input())

# if month in [12, 1, 2]:
#   print('winter')
# elif month in [3, 4, 5]:
#   print('spring')
# elif month in [6, 7, 8]:
#   print('summer')
# elif month in [9, 10, 11]:
#   print('fall')

# 71
# n = 1
# while n != 0:
#   n = int(input())

#   if n!= 0:
#     print(n)

# 72
# n = int(input())

# while n > 0:
#   print(n)
#   n = n-1


# 73
# n = int(input())

# while n > 0:
#   print(n-1)
#   n = n-1

# 74
# w = ord(input())

# t = ord('a')

# while t <= w:
#   print(chr(t))
#   t = t+1

# 75
# n = int(input())
# s = 0
# while s <= n:
#   print(s)
#   s = s+1

# 76
# n = int(input())
# s = 0

# for i in range(0, n+1):
#   print(i)

# 77
# n = int(input())
# sum = 0

# for i in range(0, n+1, 2):
#   sum = sum+i

# print(sum)

# 78
# w = 'a'

# while w != 'q':
#   w = input()
#   print(w)

# 79
# n = int(input())
# sum = 0
# i = 0

# while sum < n:
#   i = i+1
#   sum = sum + i

# print(i)

# 80
# n, m = map(int, input().split())
# for i in range (1, n+1):
#   for j in range(1, m+1):
#     print(i, j)

# 81
# print('%X'%10)
# w = int(input(), 16)
# for i in range(1, 16):
#   print('%X'%w, '*', '%X'%i, '=%X'%(w*i), sep='')

# 82
# n = int(input())
# for i in range(1, n+1):
#   if (i % 10 == 3) or (i % 10 == 6) or (i % 10 == 9):
#     print("X", end=' ')
#   else:
#     print(i, end = ' ')

# 83
# r, g, b = map(int, input().split())
# for i in range(0, r):
#   for j in range(0, g):
#     for k in range(0, b):
#       print(i, j, k, sep=' ')

# print(r * g * b)

# 84
# h, b, c, s = map(int, input().split())
# result = h*b*c*s/8/1024/1024
# print(format(result, '.1f'), 'MB')

# 85
# r, g, b = map(int, input().split())
# result = r*g*b/8/1024/1024
# print(format(result, '.2f'), 'MB')

# 86
# n = int(input())
# sum = 0
# i = 1

# while sum < n:
#   sum = sum + i
#   i  = i + 1

# print(sum)

# 87
# n = int(input())
# i = 0

# while i < n:
#   i = i + 1
#   if i % 3 == 0:
#     continue
#   print(i, end = ' ')

# 88
# a, d, n = map(int, input().split())

# result = a + d*(n-1)
# print(result)

# 89
# a, r, n = map(int, input().split())
# result = a * r ** (n-1)
# print(result)

# 90
a, m, d, n = map(int, input().split())
result = a * m * (n-1) + 
print(result)
