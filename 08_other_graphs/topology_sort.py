# 위상정렬 알고리즘

# 큐 자료구조 이용하기 위하여 라이브러리 임포트하기 
from collections import deque

# 노드의 개수, 간선의 총 개수 입력받기
v, e = map(int, input().split())

# 각 노드별 진압차수 정보 담을 배열 생성하긴
indegree = [0] * (v+1)

# 그래프 생성하기 : 2차원배열
graph = [[] for _ in range (v+1)]

# 방향그래프 초기화하기
for _ in range(e):
  a, b = map(int, input().split())
  graph[a].append(b)
  indegree[b] += 1

# 결과 배열 정의하기
result = []

# 위상정렬 수행하는 함수 만들기
def topology_sort():
  # 큐 자료구조 사용을 위해서 초기화
  q = deque()

  # 큐가 빌때까지 반복
  while q:  
    # 큐에서 제일 왼쪽 요소 꺼내기
    now = q.popleft()

    # 꺼낸 요소 결과배열에 넣기
    result.append(now)

    # 해당 배열 내 원소 루프 돌면서
    for i in graph[now]:
      # 진입차수 정보 -1 하기
      indegree[i] -= 1

      # 만약 진입차수가 0이면 큐에 넣기 
      if indegree[i] == 0:
        q.append(i)

topology_sort()

print(result)

# 결과배열 순회하며 위상정렬 결과 출력하기 
for i in result:
  print(i, end='')


# 7 8 
# 1 2
# 1 5
# 2 3
# 2 6
# 3 4
# 4 7
# 5 6
# 6 4