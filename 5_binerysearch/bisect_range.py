# 값이 특정 범위에 속하는 데이터 개수 구하기

from bisect import bisect_left, bisect_right

def count_by_range(a, left_value, right_value):
    left_idx = bisect_left(a, left_value)
    right_idx = bisect_right(a, right_value)

    return right_idx - left_idx

a = [1, 2, 3, 3, 3, 3, 4, 4, 8, 9]

# 4의 개수 구하기
print(count_by_range(a, 4, 4))  
# 8-6 = 2

# -1, 3 범위 내에 있는 데이터 개수 출력
print(count_by_range(a, -1, 3))  
# 6 - 0 = 6