# 최소동전개수 거스름돈
array = [500, 100, 50, 10]
coin_num = 0
change = 1260

for coin in array:
    coin_num += change // coin
    change %= coin
print("거스름돈 동전의 개수는 ", coin_num, " 개 입니다.")
