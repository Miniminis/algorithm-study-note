# 상하좌우 문제
# 상하좌우 이동시 변경될 좌표값 -> 미리 배열로 정의

size = int(input())
plans = input().split()

dx = [0, 0, 1, -1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

x, y = 1, 1

for plan in plans:
  for i in range(len(move_types)):
    if plan == move_types[i]:
      tx = x + dx[i]
      ty = y + dy[i]
  
  if tx < 1 or tx > size or ty < 1 or ty > size:
    continue
  
  x, y = tx, ty

print(x, y)
