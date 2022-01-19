# 떡볶이
# 적어도 m만큼 떡을 가져가기 위해서 절단기의 높이는?

n, m = map(int, input().split())
rice_cakes = list(map(int, input().split()))

def binery_search(array, start, end, target, result):

  if start > end:
    return result
  
  mid = (start + end) // 2
  total = 0

  for i in array:
    if i > mid:
      total += i - mid

  if total >= target:
    result = mid
    return binery_search(array, mid+1, end, target, result)
  else:
    return binery_search(array, start, mid-1, target, result)
  
print(binery_search(rice_cakes, 0, max(rice_cakes), m, 0))

# 입력 : 떡의 개수 n / 떡의 길이 m / 각 떡의 길이들 array
# 4 6
# 19 15 10 17
# 출력
# 15