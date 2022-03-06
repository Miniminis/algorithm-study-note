# 1이 될 때까지
n = 25
k = 5
cnt = 0

while True:
  if n % k == 0:
    n = n // k
  else:
    n -= 1

  cnt += 1

  if n == 1:
    break

print(cnt)    # 2

# 1이 될 때까지 - 참고
n, k = map(int, input().split())
result = 0

while True:
  target = (n // k) * k
  result += (n - target)
  n = target

  if n < k:
    break

  result += 1
  n //= k

result += (n - 1)
print(result)
