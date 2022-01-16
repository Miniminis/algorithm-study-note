# BFS & DFS
# 재귀함수
# 팩토리얼 구현예제 
# n! = 1 * 2 * 3  ... * n

## 반복문으로 구현
def loop(i):
  result = 1

  for i in range(1, i+1):
    result *= i
  return result

print(loop(5))  # 120


## 재귀함수로 구현
def self_func(i):
  if i <= 1:
    return 1

  return i * self_func(i-1)

print(self_func(5))  #120