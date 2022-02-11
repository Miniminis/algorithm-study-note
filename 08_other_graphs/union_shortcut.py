# 서로소집합 구현하기

# 노드의 개수, 간선 개수 입력받기
v, e = map(int, input().split())

# parent[] 테이블 생성
parent = [0] * (v+1)

# parent table 요소 자기 자신으로 초기화하기
for i in range(1, v+1):
  parent[i] = i

# 특정 원소의 부모를 찾기 위한 함수
def find_parent(parent, x):
  if parent[x] != x:
    parent[x] = find_parent(parent, parent[x])
  return parent[x]

# 두 원소가 속한 집합 합치기 (부모 요소 갱신)
def union(parent, a, b):
  a = find_parent(parent, a)
  b = find_parent(parent, b)

  if a < b:
    parent[b] = a
  else:
    parent[a] = b

# 유니온 연산 수행
for i in range(e):
  a, b = map(int, input().split())
  union(parent, a, b)

# 각 원소가 속한 집합 출력하기
for i in range(1, v+1):
  print(find_parent(parent, i), end=' ')

print()

# 부모테이블 요소 출력하기 
for i in range(1, v+1):
  print(parent[i], end = ' ')