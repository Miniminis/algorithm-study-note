# BFS - Breadth First Search
from collections import deque

def bfs(graph, i, visited):
  visited[i] = True
  queue = deque([i])

# queue 가 빌때까지 반복
  while queue:
    v = queue.popleft()
    print(v, end=' ')

    for j in graph[v]:
      if not visited[j]:
        queue.append(j)
        visited[j] = True

graph = [
  [],
  [2, 3, 8],
  [1, 7],
  [1, 4, 5],
  [3, 5],
  [3, 4],
  [7],
  [2, 6, 8],
  [1, 7]
]

visited = [False] * 9

print(bfs(graph, 1, visited))
# 1, 2, 3, 8, 7, 4, 5, 6
# 1 2 3 8 7 4 5 6 None