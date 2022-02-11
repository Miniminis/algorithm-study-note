# 이진탐색 재귀함수로 구현하기 
# target 값이 몇번째에 존재하는지 위치 출력하기 

# 전체 원소개수 n, 목표 타겟 target
n, target = map(int, input().split())
array = list(map(int, input().split()))

def binery_search(array, start, end, target):
  # start > end : return None
  # mid = (start + end) // 2
  # tartget == mid : return 
  # target > mid : start = mid+1
  # target < mid : end = mid-1

  if start > end :
    return None
  
  mid = (start + end) // 2
  print('==>', start, end, mid)

  
  if target == array[mid]:
    return mid
  
  if target > array[mid]:
    return binery_search(array, mid+1, end, target)
  else:
    return binery_search(array, start, mid-1, target)

result = binery_search(array, 0, n-1, target)

if result == None:
  print('원소가 존재하지 않습니다.')
else:
  print(result+1, '번째에 원소가 존재합니다.')

# 10 7
# 1 3 5 7 9 11 13 15 17 19
# 4 번째에 원소가 존재합니다.


# 10 7
# 1 3 5 6 9 11 13 15 17 19
# 원소가 존재하지 않습니다.