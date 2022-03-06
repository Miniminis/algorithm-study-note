# 문자의 재정렬
# ord('0') : 48
# ord('9') : 57
# ord('A') : 65
# ord('Z') : 90

chars = list(input())

alpabets = []
nums = []

for char in chars:
  if ord(char) <= ord('9'):
    nums.append(int(char))
  else:
    alpabets.append(char)

alpabets.sort()
nums.sort()

print(''.join(str(w) for w in (alpabets+nums)))

# K1KA5CB7
# ABCKK157

# AJKDLSI412K4JSJ9D
# ADDIJJJKKLSS12449