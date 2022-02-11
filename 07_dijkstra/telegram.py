import heapq
import sys

input = sys.stdin.readline
INF = int(1e9)

n, m, c = map(int, input().split())
graph = [[] for _ in range(n+1)]
distance = [INF] * (n+1)

for _ in range(m):
  x, y, z = map(int, input().split())
  graph[x].append((y, z))

def dijkstra(start):
  q = []

  heapq.heappush(q, (0, start))
  distance[start] = 0

  while q:
    dist, now = heapq.heappop(q)

    if distance[now] < dist:
      continue
    
    for i in graph[now]:
      cost = dist + i[1]
      if cost < distance[i[0]]:
        distance[i[0]] = cost
        heapq.heappush(q, (cost, i[0]))

dijkstra(c)

print(distance)

total_num_of_cities = 0
max_distance = 0

for i in distance:
  if i == INF:
    continue
  
  total_num_of_cities += 1
  max_distance = max(max_distance, i)

# 출발지인 C를 제외하고 출력
print(total_num_of_cities -1, max_distance)

# 3 2 1
# 1 2 4
# 1 3 2
# distance = [1000000000, 0, 4, 2]
# 2 4

