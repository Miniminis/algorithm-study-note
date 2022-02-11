# 효율적인 화폐구성

# n : 화폐의 개수 
# m : 만들어야 하는 돈의 금액
# 화폐의 가치들 : values[]

n, m = map(int, input().split())

values = []
for i in range(n):
  values.append(int(input()))

d = [10001] * (m+1)
d[0] = 0

for i in values:
  for j in range(i, m+1):
    if d[j-i] != 10001:
      d[j] = min(d[j], d[j-i]+1)

if d[m] == 10001:
  print(-1)
else :
  print(d[m])


# input
# 2 15
# 2  
# 3
# output
# d = [0, 10001, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5]
# 5