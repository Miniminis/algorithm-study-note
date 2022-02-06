
import math 

def is_prime_number(num):
  if num == 1:
    return True
  
  for i in range(2, int(math.sqrt(num))+1):
    if num % i == 0:
      return False

    return True

print(is_prime_number(4), is_prime_number(7))
# False True