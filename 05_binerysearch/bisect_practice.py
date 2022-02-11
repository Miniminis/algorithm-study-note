# bineary search library practice
# 정렬을 지키면서 원소를 삽입할 수 있는 가장 왼쪽/오른쪽 인덱스를 출력해준다. 

from bisect import bisect_left, bisect_right

a = [1, 2, 3, 4, 5]
x = 4

print(bisect_left(a, x))
print(bisect_right(a, x))
