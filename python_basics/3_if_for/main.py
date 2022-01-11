# if 
score = 85

if score >= 90:
  print("A")
elif score >= 80:
  print("B")
elif score >= 70:
  print("C")
else:
  print("F")

## 비교연산자 

## 논리 연산자 
if True and False:
  print("Yes")

a = 20
if a <= 20 and a > 0:
  print("OK")

## pass 
if a > 0 : 
  pass
else :
  print("hello!")

## 간소화 조건문
score = 80
result = "PASS" if score >= 90 else "FAIL" 
print(result)

## 부등식
x = 5

### other language
if x > 0 and x < 20:
  print(True)

### in python 
if 0 < x < 20:
  print(True)

## 예시 - 특정 번호의 학생 제외하기
scores = [90, 100, 100, 35]
cheating_students = {1, 2}

for i in range(len(scores)):
  if i in cheating_students:
    continue
  else:
    print(i+1, " 번 학생은 합격입니다.")
  