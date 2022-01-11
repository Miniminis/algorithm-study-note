# 정수
a = 777
print(a)

a = 777 + 5
print(a)

# 실수 
a = 1e9
print (a) # 실수형으로 표현된다. 

a = int(1e9)
print (a) # 정수형으로 표현된다. 


## 0.9 값의 정확도 체크
a = 0.3 + 0.6
print(a)

if a == 0.9:
  print(True)
else:
  print(False)


# 수의 연산
a = 7
b = 3

print(a / b)
print(a % b)
print(a // b)

print(a ** b) # 거듭제곱
print(a ** 0.5) # 제곱근


# 리스트 자료형
## 초기화
array = [70, 4, 10, 2, 11]
print(array)

## 인덱싱
print(array[3])

### 양수 인덱싱
print(array[2]) # 10

### 음수 인덱싱
print(array[-2])  # 2
print(array[-0])  # 1

## 슬라이싱 > 파이썬에서 기본 제공함
print(array[2:4]) # 10, 2

## list comprehension - forloop
array = [i for i in range(10)]
print(array)

## list comprehension - if
### 0 - 19 중 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]
print(array)  # [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]

## list 컴프리헨션 vs. 일반코드 -> 짧은 코드!
### list comprehension
array = [i for i in range(20) if i % 2 == 1]
print(array)

### normal code
array = []
for i in range(20):
  if i % 2 == 1:
    array.append(i)
print(array)

## 2차원 배열 초기화하기
# array = [[0] * m for _in range(n)]
array = [[0] * 4 for _ in range(3)]
print(array)  # [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

array[1][1] = 5
print(array)  # [[0, 0, 0, 0], [0, 5, 0, 0], [0, 0, 0, 0]]

## != array = [[0] * m] * n
# array = [[0] * m] * n 와 같이 초기화할 경우, 전체 리스트 안에 포함된 각 리스트가 모두 같은 객체로 인식된다. 주소값도 같이 복사하기 때문! 
array = [[0] * 4] * 3
print(array)  # [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

array[1][1] = 5
print(array)  # [[0, 5, 0, 0], [0, 5, 0, 0], [0, 5, 0, 0]]


## 언더바 사용하기 in python 
# 반복 변수의 값을 무시하기 위해서 

# 케이스 1. 1 - 9까지 자연수 더하기 
# 매번 합을 더해야하기 때문에 변수가 필요하다. 
summary = 0
for i in range (10):
  summary += i;
print(summary)

# 케이스 2. 단순히 내부적으로 반복만 할 경우
# 변수가 필요 없는 반복의 경우는 언더바를 사용해서 변수를 생갹할 수 있다. 
for _ in range (10):
  print("Hello, Algorithm!")

## 매소드 사용해보기
array = [100, 5, 20, 3, 87]

# append
array.append(127)
print(array)    # [100, 5, 20, 3, 87, 127]

# insert
array.insert(2, 60)
print(array)    # [100, 5, 60, 20, 3, 87, 127]

# remove
array.remove(87)    
print(array)    # [100, 5, 60, 20, 3, 127]

# reverse
array.reverse()
print(array)    # [127, 3, 20, 60, 5, 100]

# sort, sort(reverse = True)
array.sort()
print(array)    # [3, 5, 20, 60, 100, 127]

array.sort(reverse=True)
print(array)    # [127, 100, 60, 20, 5, 3]

# count
print(array.count(127))   # 1


## 문자열
data = "hello, python!"
print(data)   # hello, python!

## 튜플 
data = 'hello, "python"'
print(data)   # hello, "python"

### 문자열의 덧셈
a = "Hello"
b = "World"
print(a + " " + b)    # Hello World

a = "String"
print(a*3)    # StringStringString

a = "ABCDEF"
print(a[2:3])   # C

# 특정 인덱스 값 변경 불가
# a[2] = 'Z'
# print(a)
# Traceback (most recent call last):
#   File "main.py", line 158, in <module>
#     a[2] = 'Z'
# TypeError: 'str' object does not support item assignment
# exit status 1


# 튜플
a = (1, 2, 3, 4, 5)

## indexing
print(a[3])   # 4

## slicing
print(a[1:4])   # (2, 3, 4)

## 원소변경불가
# a[3] = 100
# print(a)

# Traceback (most recent call last):
#   File "main.py", line 178, in <module>
#     a[3] = 100
# TypeError: 'tuple' object does not support item assignment
# exit status 1



## 사전자료형
## 초기화 1
data = dict()
data['apple'] = '사과'
data['banana'] = '바나나'
data['coconut'] = '코코넛'
print(data)   # {'apple': '사과', 'banana': '바나나', 'coconut': '코코넛'}

## 초기화 2
second_data = {
  97 : '홍길동',
  98 : '고길동'
}
print(second_data)    # {97: '홍길동', 98: '고길동'}


if 'apple' in data:
  print('해당 키는 존재합니다.')  # 해당 키는 존재합니다.

### methods
print(data.keys())    # dict_keys(['apple', 'banana', 'coconut'])
print(data.values())    # dict_values(['사과', '바나나', '코코넛'])

for key in data.keys():
  print(key)

# apple
# banana
# coconut

values = data.values()
values_list = list(data.values())   # ['사과', '바나나', '코코넛']
print(values_list)
for value in values_list:
  print(value)      
# 사과
# 바나나
# 코코넛


## 집합 자료형
data = set([1, 1, 2, 3, 4, 4, 5, 6])
print(data)   # {1, 2, 3, 4, 5, 6}  -> 중복제거

data = {1, 2, 3, 4, 5}
print(data)   # {1, 2, 3, 4, 5}

### 연산 : 합, 교, 차
a = set([1, 2, 3, 4, 5])
b = {3, 4, 5, 6, 7, 7}

# 합집합
print(a | b)  # {1, 2, 3, 4, 5, 6, 7}

# 교집합
print(a & b)  # {3, 4, 5}

# 차집합
print (a - b) # {1, 2}

### 관련함수
data = {1, 2, 3, 4, 5}

# add() 
data.add(100)
print(data)   # {1, 2, 3, 4, 5, 100}

# update()
data.update({34, 9})
print(data)   # {1, 2, 3, 4, 5, 100, 34, 9}

# remove()
data.remove(100)
print(data)   # {1, 2, 3, 4, 5, 34, 9}

