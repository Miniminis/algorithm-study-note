# BFS & DFS

## 재귀함수
### 종료조건 미입력시
def recursive_func():
  print("재귀함수를 호출합니다!")
  recursive_func()

recursive_func()

# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# 재귀함수를 호출합니다!
# Traceback (most recent call last):
#   File "main.py", line 8, in <module>
#     recursive_func()
#   File "main.py", line 6, in recursive_func
#     recursive_func()
#   File "main.py", line 6, in recursive_func
#     recursive_func()
#   File "main.py", line 6, in recursive_func
#     recursive_func()
#   [Previous line repeated 992 more times]
#   File "main.py", line 5, in recursive_func
#     print("재귀함수를 호출합니다!")
# RecursionError: maximum recursion depth exceeded while calling a Python object
# exit status 1