# 미로찾기 문제 
# 입력값: 미로의 크기 (n, m), 미로정보
# 반환값 : 최단거리
# 아이디어
  # BFS 를 이용
  # 방문한 노드의 값을 +1 변경
  # 노드값이 1인 경우에만 move cnt 로 체크한다.

from collections import deque

n, m = map(int, input().split())
maze = []

for i in range(n):
  maze.append(list(map(int, input())))

dx = [+1, -1, 0, 0]
dy = [0, 0, -1, +1]

def bfs(x, y):
  queue = deque()
  queue.append((x, y))

  while queue:
    x, y = queue.popleft()

    for i in range(4):
      nx = x + dx[i]
      ny = y + dy[i]

      if nx < 0 or nx >= n or ny < 0 or ny >= m:
        continue
      
      if maze[nx][ny] == 0:
        continue
      
      if maze[nx][ny] == 1:
        maze[nx][ny] = maze[x][y] + 1
        queue.append((nx, ny))

  return maze[n-1][m-1]


print(bfs(0, 0))
