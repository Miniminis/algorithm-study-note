# 거스름돈 문제 복습
# 편의점 알바가 500, 100, 50, 10 원짜리 동전을 무한정 가지고 있다.
# 손님에게 거스름돈을 최소한의 동전개수로 거슬러주기 위해서는 어떻게 해야할까
# N은 항상 10의 배수

change = 1260
coins = [500, 100, 50, 10]
cnt = 0

for coin in coins:
  cnt += change // coin
  change %= coin

print(cnt)