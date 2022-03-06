# 두 수 바꿔치기 문제

# A에서는 작은 순서대로 정렬, B에서는 높은 수대로 정렬

n, k = map(int, input().split())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort(reverse=True)


for i in range(k):
  if a[i] < b[i]:
    a[i], b[i] = b[i], a[i]

print(a, b)
print(sum(a))

# input
# 5 3 
# 1 2 3 4 5
# 5 5 6 6 5

# output
# 5 3 
# 1 2 3 4 5
# 5 5 6 6 5
# [5, 4, 5, 6, 6] [3, 5, 5, 2, 1]
# 26
