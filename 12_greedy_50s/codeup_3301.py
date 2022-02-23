# codeup 3301 : 거스름돈
# https://codeup.kr/problem.php?id=3301

money = [50000, 10000, 5000, 1000, 500, 100, 50, 10]
n = int(input())
result = 0

for m in money:
  result += n // m
  n %= m

print(result)
  


