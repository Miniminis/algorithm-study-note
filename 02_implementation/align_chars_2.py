# 문자의 재정렬 풀이
# 문자정렬 + 숫자의 합

chars = input()
result = []
sum = 0

for char in chars:
  if char.isalpha():
    result.append(char)
  else:
    sum += int(char)
  
result.sort()

if sum != 0:
  result.append(str(sum))

print(''.join(result))

# K1KA5CB7
# ABCKK13

# AJKDLSI412K4JSJ9D
# ADDIJJJKKLSS20