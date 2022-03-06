# 사이클 판별하기 

# 특정 원소를 포함하는 집합 찾기 (루트노드찾기))
def find_parent(parent, x):
  if parent[x] != x:
    parent[x] = find_parent(parent, parent[x])
  return parent[x]

# 합집합 연산 수행하기 
def union_parent(parent, a, b):
  a = find_parent(parent, a)
  b = find_parent(parent, b)

  if a < b:
    parent[b] = a
  else:
    parent[a] = b

# 사용자 입력받기
v, e = map(int, input().split())
parent = [0] * (v+1)

for i in range(1, v+1):
  parent[i] = i

cycle = False

for i in range(e):
  a, b = map(int, input().split())

  if find_parent(parent, a) == find_parent(parent, b):
    cycle = True
    break
  else:
    union_parent(parent, a, b)

if cycle:
  print('cycle 발생')
else:
  print('cycle 발생안함')
