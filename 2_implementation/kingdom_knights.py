# 왕실의 나이트 문제
# 역시 구현문제 -> 요구사항대로 충실히 구현만 하면 됨

# 풀이
pin = input() 

# a - h 의 문자값을 숫자로 바꾸는 작업 필요
tx = ord(pin[0])

x = tx - ord('a') + 1
y = int(pin[1])

result = 0

# 총 경우의 수는 8가지 일듯
moves = [(+2, -1), (+2, +1), (-2, -1), (-2, +1), (-1, +2), (-1, -2), (+1, -2), (+1, +2)]

for move in moves:
  nx = x + move[0]
  ny = y + move[1]

  if nx < 1 or nx > 8 or ny < 1 or ny > 8:
    continue
  
  result += 1

print(result)
  
