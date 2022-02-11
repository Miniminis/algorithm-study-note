# 소수판별하기

def is_prime_number(number):
  if number == 1:
    return True
  
  for i in range(2, number-1):
    if number % i == 0:
      return False
  
  return True

print(is_prime_number(4), is_prime_number(7))