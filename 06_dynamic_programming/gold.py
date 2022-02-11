# 금광문제

t = int(input())

def mining():
  goldmines = []

  n, m = map(int, input().split())
  nums = list(map(int, input().split()))
  idx = 0

  # dp table 초기화
  for i in range(n):
    goldmines.append(nums[idx:idx+m])
    idx += m

  # dynamic programming
  for j in range(1, m):
    for i in range(n):
      if i == 0: left_up = 0
      else: left_up = goldmines[i-1][j-1]

      if i == n - 1: left_down = 0
      else: left_down = goldmines[i+1][j-1]

      left =  goldmines[i][j-1]

      goldmines[i][j] = goldmines[i][j] + max(left_down, left, left_up)

  result = 0
  for i in range(n):
    result = max(result, goldmines[i][m-1])

  return result


for i in range(t):
  print(mining())


# 2
# 3 4
# 1 3 3 2 2 1 4 1 0 6 4 7
# 4 4 
# 1 3 1 5 2 2 4 2 5 0 2 3 0 6 1 2
