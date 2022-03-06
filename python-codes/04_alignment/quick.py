# 퀵정렬

array = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]
print(array)

def quick_sort(array, start, end):
  # 만약에 원소가 1개이면 return 
  if start >= end:
    return

  pivot = start
  left = start + 1
  right = end

  while left <= right:
    while left <= end and array[left] <= array[pivot]:
      left += 1
    while right > start and array[right] >= array[pivot]:
      right -= 1
    if left > right:
      array[right], array[pivot] = array[pivot], array[right]
    else:
      array[left], array[right] = array[right], array[left]
    print(array)
  
  quick_sort(array, start, right-1)
  quick_sort(array, right+1, end)

quick_sort(array, 0, len(array)-1)

print(array)


# [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]
# [5, 4, 9, 0, 3, 1, 6, 2, 7, 8]
# [5, 4, 2, 0, 3, 1, 6, 9, 7, 8]
# [1, 4, 2, 0, 3, 5, 6, 9, 7, 8]
# [1, 0, 2, 4, 3, 5, 6, 9, 7, 8]
# [0, 1, 2, 4, 3, 5, 6, 9, 7, 8]
# [0, 1, 2, 4, 3, 5, 6, 9, 7, 8]
# [0, 1, 2, 3, 4, 5, 6, 9, 7, 8]
# [0, 1, 2, 3, 4, 5, 6, 9, 7, 8]
# [0, 1, 2, 3, 4, 5, 6, 8, 7, 9]
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


# 5 4 9 0 3 1 6 2 7 8
# 5 4 2 0 3 1 6 9 7 8
# 1 4 2 0 3 5 6 9 7 8
# 1 0 2 4 3 5 6 9 7 8
# 0 1 2 4 3 5 6 8 7 9
# 0 1 2 3 4 5 6 7 8 9