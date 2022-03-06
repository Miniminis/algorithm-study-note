# 삽입정렬 알고리즘
# 왼쪽의 수들은 이미 정렬되어있다고 가정하고 지금의 수를 어디에 끼워넣을지 판단

array = [7, 5, 9, 0, 3, 1, 6, 2, 4, 8]

for i in range(1, len(array)):
  for j in range(i, 0, -1):
    if array[j] < array[j-1]:
      array[j-1], array[j] = array[j], array[j-1]
    else:
      break

print(array)
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]