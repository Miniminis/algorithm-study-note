# baekjoon 11047 동전 0
# https://www.acmicpc.net/problem/11047

n, k = map(int, input().split())
coins = []
cnt = 0

for _ in range(n):
  coins.append(int(input()))

coins.sort(reverse=True)

for coin in coins:
  if coin > k:
    continue

  cnt += k // coin
  k %= coin
  

print(cnt)