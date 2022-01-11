# 매개변수 직접지정
def hello(a, b):
  print(a, b)

hello(a = "Hello", b = "Python")

# global keyword 
# 값을 변경할 경우에만 영향
a = 10

def func():
  global a
  a += 1
  print(a)

func()

# 값을 변경하지 않을 경우 문제없음
def func_1():
  print(a)

func_1()

# 여러개의 반환값
# 패킹 & 언패킹
def result(a, b):
  add = a + b
  sub = a - b
  mul = a * b
  div = a / b
  return add, sub, mul, div

a, b, c, d = result(3, 7)
print(a, b, c, d)




## 람다
# 비교
def func(a, b):
  return a + b

print(func (3, 7))
print((lambda a, b: a + b)(3, 7))

# 예시 1) 한번쓰고 마는 함수, 짧은 함수
array = [
  ('홍길동', 50),
  ('이순신', 32),
  ('아무개', 74)
]

def my_key(x):
  return x[1]

print(sorted(array, key=my_key))
print(sorted(array, key=lambda x: x[1]))
# [('이순신', 32), ('홍길동', 50), ('아무개', 74)]
# [('이순신', 32), ('홍길동', 50), ('아무개', 74)]

# 예시 2) 여러개의 리스트에 연산적용
list1 = [1, 2, 3, 4, 5]
list2 = [3, 4, 5, 6, 7]

result = map(lambda a, b: a + b, list1, list2)
print(list(result))

