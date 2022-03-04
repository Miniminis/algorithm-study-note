# codeup 4713
# https://codeup.kr/problem.php?id=4713

def to_days(date):    
  # [3, 1, 11, 30]
  start_day = date[0] * 100 + date[1]
  end_day = date[2] * 100 + date[3]
  
  return (start_day, end_day)


n = int(input())
flower_dates = []
candidate = []
cnt = 0

for i in range(n):
  flower_dates.append(to_days(list(map(int, input().split())))) 
  
# [(101, 531), (101, 630), (515, 831), (610, 1210)]

princess_days = to_days([3, 1, 11, 30])
start, end = princess_days[0], princess_days[1]
# 301, 1130 

while start <= end:
  temp = (0, 0)

  for flower in flower_dates:
    if flower[0] <= start and flower[1] > temp[1]:
      temp = flower

  if temp == (0, 0):
    break
  
  start = temp[1]
  cnt += 1
  
print(cnt)
