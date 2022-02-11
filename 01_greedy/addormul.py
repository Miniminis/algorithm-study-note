### 곱하기 혹은 더하기 문제
# 0일 경우 무조건 더하기
# 0이 아니면 무조건 곱하기가 유리

numbers = list(map(int, input()))
sum = 0

for num in numbers:
  if sum == 0 or num == 0:
    sum += num
  else:
    sum *= num

print(sum)


## 풀이
# 두 수 중 하나라도 0 또는 1인 경우 더하기가 유리하다. 
# 나머지 경우에는 모두 곱셈이 유리함! 
data = input()

# 첫번째 문자를 숫자로 변경하여 대입한다. 
result = int(data[0])

for i in range(1, len(data)):
  num = int(data[i])

  if num <= 1 or result <= 1:
    result += num
  else :
    result *= num

print(result)

