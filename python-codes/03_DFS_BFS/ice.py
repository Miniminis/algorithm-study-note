# DFS & BFS 문제
# 음료수 얼려먹기

# n, m 입력받기
n, m = map(int, input().split())

# 현재 얼음틀 상태 입력받기
ice_frames = []

for i in range(n):
  ice_frames.append(list(map(int, input())))

print(ice_frames)

# 총 덩어리 개수 : result
result = 0

# dfs func 정의
# - 연결된 모든 노드가 방문되면 return True
# - 현재위치가 0면 1로 채우기
# - 해당 위치부터 상하좌우 모두 방문 재귀호출 -> 방문 가능하면 1로 채우는 과정 재귀적으로 반복할것 

def dfs(x, y):
  if x <= -1 or x >= n or y <= -1 or y >= m:
    return False

  if ice_frames[x][y] == 0:
    ice_frames[x][y] = 1

    dfs(x-1, y)
    dfs(x+1, y)
    dfs(x, y-1)
    dfs(x, y+1)

    return True
  return False

# n, m for loop -> dfs 함수 호출하기 
# - visited == True -> result +=1
# print(result)
for i in range(n):
  for j in range(m):
    if dfs(i, j) == True:
      result += 1

print(result)
