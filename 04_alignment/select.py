# 선택정렬 > 0-9까지 작은 카드를 중심으로 나열하기 

array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(len(array)):
  min_idx = i
  for j in range(i+1, len(array)):
    if array[min_idx] > array[j]:
      min_idx = j
  array[min_idx], array[i] = array[i], array[min_idx]

print(array)
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]