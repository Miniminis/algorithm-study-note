# codeup 3120 : 리모컨
# https://codeup.kr/problem.php?id=3120
# 참고풀이 : https://chongmin-k.tistory.com/entry/%EC%BD%94%EB%93%9C%EC%97%85CodeUp-3120-%ED%8C%8C%EC%9D%B4%EC%8D%AC

a, b = map(int, input().split())
gap = abs(b - a)
cnt = gap // 10

rest = gap % 10

if rest in [1, 5]:
  cnt += 1
elif rest in [2, 4, 6, 9]:
  cnt += 2
elif rest in [3, 7, 8]:
  cnt += 3
  
print(cnt)
