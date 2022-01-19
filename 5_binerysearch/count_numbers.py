# 정렬된 배열에서 특정 수의 개수 구하기 문제

from bisect import bisect_left, bisect_right

n, m = map(int, input().split())
array = list(map(int, input().split()))

def binery_search(array, target): 
  count = bisect_right(array, target) - bisect_left(array, target)

  if (count == 0):
    return -1
  
  return count

print(binery_search(array, m))
