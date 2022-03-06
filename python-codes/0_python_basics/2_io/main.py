# 자주 사용되는 표준 입력 방법
# word = input()
# print(word)
# test
# test

# print(map(int, input().split()))  
# hello python nice to meet you
# <map object at 0x7f6cf4c6c550>

# print(list(map(int, input().split()))) 
# 1 100 43 29 70
# [1, 100, 43, 29, 70]

## 입력받는 데이터의 개수가 정해져 있다면
# a, b, c = map(int, input().split())
# print(a)
# print(b)
# print(c)
# 1 100 45
# 1
# 100
# 45


 # 빠르게 입력받기 
# sys.stdin.readline()
# 이진탐색, 정렬 등에서는 입력받는데 걸리는 시간이 초과되어 실패하기도 한다. 
# import sys

# data = sys.stdin.readline().rstrip()
# print(data)

# 기본출력
# print() 
a = 1
b = 2
print(a, b)

print(7, end=" ")
print(8)

answer = 7 
print("the answer is " + str(answer) + "!")

# f-string
print(f"the answer is {answer} !")
