# 시각
# 3이 하나라도 포함되는 시각의 모든 경우의 수
# 00:00:00 ~ N:59:59

hour = int(input())
count = 0

for h in range(hour+1):
  for m in range (60):
    for s in range(60):
      if '3' in str(h) + str(m) + str(s):
        count += 1

print(count)

# 5
# 11475