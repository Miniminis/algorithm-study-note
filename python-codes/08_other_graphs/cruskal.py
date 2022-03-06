# 크루스칼 알고리즘

# 특정 원소를 포합하는 집합 찾는 함수 정의하기 : 경로단축기법 사용하기
def find_parent(parent, x):
  if parent[x] != x:
    parent[x] = find_parent(parent, parent[x])
  return parent[x]


# 합집합 연산함수 정의하기
def union_parent(parent, x, y):
  x = find_parent(parent, x)
  y = find_parent(parent, y)

  if x < y:
    parent[y] = x
  else:
    parent[x] = y

# 사용자로부터 노드개수, 간선개수 입력받기
v, e = map(int, input().split())

# 부모노드 테이블 생성
parent = [0] * (v+1)

# 부모노드 테이블 초기화하기
for i in (1, v+1):
  parent[i] = i

# 간선정보 배열, 최종비용합계 변수 초기화하기 
edge = []
result = 0

# 간선정보 입력받기 : 시작노드, 끝노드, 비용 정보 입력받기
for _ in range(e):
  a, b, cost = map(int, input().split())
  edge.append((cost, a, b))

# 비용 순으로 오름차순 정렬하기
edge.sort()

# 간선정보에 따라 집합비교하기
for e in edge:
  cost, a, b = e

  # 두 요소의 집합이 같지 않을 때에만 유니온 함수 호출 후 비용에 포함시키기 
  if find_parent(parent, a) != find_parent(parent, b):
    union_parent(parent, a, b)
    result += cost

# 결과적으로 계산된 최소비용을 출력한다.
print(result)