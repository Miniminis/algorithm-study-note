# 피보나치 수열
# 99 번째 피보나치 수 구하기

# 상향식
d = [0] * 100

def fibo(x):
  if x == 1 or x == 2:
    return 1

  # 이미 계산된 적 있다면 해당 값을 가져다가 쓴다. 
  if d[x] != 0:
    return d[x]
  
  # 한 번 연산을 완료하면 d array 에 값을 넣는다. 
  d[x] = fibo(x-1) + fibo(x-2)
  return d[x]

print(fibo(99));

# output : 218922995834555169026
