## 자주 사용하는 내장함수 
# sum()
result = sum([1, 2, 3, 4, 5])
print(result)

# min(), max()
array = [1, 200, 3, 6, 43]
print(min(array))
print(max(array))

# eval()
result = eval("(3+5)*7")
print(result)

# sorted()
array = [9, 23, 54, 100, 12]
result = sorted(array) 
result_reverse = sorted(array, reverse=True)
print(result)
print(result_reverse)

# sorted() with key
array = [
  ('hong', 45),
  ('ming', 17),
  ('rod', 74)
]

result = sorted(array, key=lambda x: x[1])
print(result)

result = sorted(array, key=lambda x: x[1], reverse=True)
print(result)

# [('ming', 17), ('hong', 45), ('rod', 74)]
# [('rod', 74), ('hong', 45), ('ming', 17)]


# 순열
from itertools import permutations

data = ['A', 'B', 'C']
result = list(permutations(data, 3))
print(result)
# [('A', 'B', 'C'), ('A', 'C', 'B'), ('B', 'A', 'C'), ('B', 'C', 'A'), ('C', 'A', 'B'), ('C', 'B', 'A')]

# 조합
from itertools import combinations

result = list(combinations(data, 2))
print(result)
# [('A', 'B'), ('A', 'C'), ('B', 'C')]

# 중복순열
from itertools import product
result = list(product(data, repeat=3))
print(result)
# [('A', 'A', 'A'), ('A', 'A', 'B'), ('A', 'A', 'C'), ('A', 'B', 'A'), ('A', 'B', 'B'), ('A', 'B', 'C'), ('A', 'C', 'A'), ('A', 'C', 'B'), ('A', 'C', 'C'), ('B', 'A', 'A'), ('B', 'A', 'B'), ('B', 'A', 'C'), ('B', 'B', 'A'), ('B', 'B', 'B'), ('B', 'B', 'C'), ('B', 'C', 'A'), ('B', 'C', 'B'), ('B', 'C', 'C'), ('C', 'A', 'A'), ('C', 'A', 'B'), ('C', 'A', 'C'), ('C', 'B', 'A'), ('C', 'B', 'B'), ('C', 'B', 'C'), ('C', 'C', 'A'), ('C', 'C', 'B'), ('C', 'C', 'C')]

# 중복조합
from itertools import combinations_with_replacement

result = list(combinations_with_replacement(data, 2))
print(result)
# [('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'B'), ('B', 'C'), ('C', 'C')]


## collections

# counter
from collections import Counter

counter = Counter([1, 4, 4, 2, 3, 6, 4])
print(counter[4])
print(counter[1])
print(dict(counter))
# 3
# 1
# {1: 1, 4: 3, 2: 1, 3: 1, 6: 1}


# math
import math

# 최대 공약수 & 최소공배수
def lcm(a, b):
  return a * b // math.gcd(a, b)

a = 21
b = 14

print(math.gcd(21, 14))
print(lcm(21, 14))
# 7
# 42