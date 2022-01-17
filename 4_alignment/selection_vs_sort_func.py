# 선택정렬 vs. 기본 정렬 라이브러리 수행시간 비교 

from random import randint
import time

array = []
for _ in range(10000):
  array.append(randint(1, 100))

start_time = time.time()

for i in range(len(array)):
  min_index = i
  for j in range(i+1, len(array)):
    if array[min_index] > array[j]:
      min_index = j
  array[i], array[min_index] = array[min_index], array[i]

end_time = time.time()

# 수행시간
print("선택정렬 성능 측정 : ", end_time - start_time)



array = []
for _ in range(10000):
  array.append(randint(1, 100))

start_time = time.time()

array.sort()

end_time = time.time()

# 수행시간
print("기본 정렬 라이브러리 성능 측정 : ", end_time - start_time)



# 선택정렬 성능 측정 :  24.45125102996826
# 기본 정렬 라이브러리 성능 측정 :  0.002169370651245117