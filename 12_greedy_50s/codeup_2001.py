# codeup 2001 최소 대금
# https://codeup.kr/problem.php?id=2001

pasta_prices = []
drink_prices = []

for i in range(3):
  pasta_prices.append(int(input()))

for j in range(2):
  drink_prices.append(int(input()))

pasta_prices.sort()
drink_prices.sort()

result = (pasta_prices[0] + drink_prices[0]) * 1.1
print(format(result, ".1f"))

