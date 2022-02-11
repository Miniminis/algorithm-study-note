# 피보나치 수열
# 4 번째 피보나치 수 구하기

def fibo(x):
  if x == 1 or x == 2:
    return 1
  
  return fibo(x-1) + fibo(x-2)

print(fibo(4));

# output : 3