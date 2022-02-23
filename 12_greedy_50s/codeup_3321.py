# codeup 3321 : 최고의 피자 
# https://codeup.kr/problem.php?id=3321

# 반올림 : round(num, 자리수)
# import math
# 올림 : math.ceil()
# 내림 : math.floor(), math.trunc()

toping_num = int(input())
dough_price, toping_price = map(int, input().split())
dough_calory = int(input())
toping_calories = []
for i in range(toping_num):
  toping_calories.append(int(input()))

toping_calories.sort(reverse=True)

total_price = dough_price
total_calory = dough_calory
result = 0

for t in toping_calories:
  total_price += toping_price
  total_calory += t

  calory = total_calory / total_price
  if result > calory:
    break
  else:
    result = calory

print(int(result))
