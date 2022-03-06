# backjoon 11399 ATM
# https://www.acmicpc.net/problem/11399

n = int(input())
orders = list(map(int, input().split()))

orders.sort()

order_sum = 0
sums = []
for order in orders:
  order_sum += order
  sums.append(order_sum)

print(sum(sums))
