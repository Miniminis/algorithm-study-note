# codeup 4713
# https://codeup.kr/problem.php?id=4713

def to_days(date):
  start_day = date[1]
  end_day = date[3]
  
  start_month = date[0] - 1
  for i in range (start_month):
    start_day += num_of_days[i]

  end_month = date[2] - 1
  for i in range (end_month):
    end_day += num_of_days[i]
  
  return (start_day, end_day)


num_of_days = [31, 28, 31, 30, 31, 30, 31, 31,  30, 31, 30, 31]

n = int(input())
flower_dates = []
candidate = []
cnt = 0

for i in range(n):
  flower_dates.append(to_days(list(map(int, input().split()))))

# flower_dates [(150, 1, 151), (180, 1, 181), (108, 135, 243), (183, 161, 344)]

princess_days = to_days([3, 1, 11, 30])
start, end = princess_days[0], princess_days[1]

while start <= end:
  for flower in flower_dates:
    if flower[0] <= start:
        candidate.append(flower)
    
  candidate.sort(reverse=True)

  start = candidate[0][1]
  cnt += 1
  candidate = []

print(cnt)
