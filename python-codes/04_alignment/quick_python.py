# 퀵정렬

array = [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]
print(array)

def quick_sort(array):
  if len(array) < 1:
    return array
  
  pivot = array[0]
  tail = array[1:]

  left_side = [x for x in tail if x <= pivot]
  right_side = [x for x in tail if x > pivot]

  print("left side : ", left_side, "right side : ", right_side)

  return quick_sort(left_side) + [pivot] + quick_sort(right_side)

print(quick_sort(array))

# [5, 7, 9, 0, 3, 1, 6, 2, 4, 8]
# left side :  [0, 3, 1, 2, 4] right side :  [7, 9, 6, 8]
# left side :  [] right side :  [3, 1, 2, 4]
# left side :  [1, 2] right side :  [4]
# left side :  [] right side :  [2]
# left side :  [] right side :  []
# left side :  [] right side :  []
# left side :  [6] right side :  [9, 8]
# left side :  [] right side :  []
# left side :  [8] right side :  []
# left side :  [] right side :  []
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
