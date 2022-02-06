
n = 5
data = [10, 20, 30, 40, 50]

sum = 0
prefix_sum = [0]
for i in data:
  sum += i
  prefix_sum.append(sum)

left = 3
right = 4

print(prefix_sum[right] - prefix_sum[left-1])
# 70 