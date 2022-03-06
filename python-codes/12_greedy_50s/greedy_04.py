# 모험가 길드 문제
# 한 마을에 모험가가 n 명 존재
# 이들을 대상으로 공포도를 측정함
# 공포도가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어진다.
# 모험가 그룹 길드장은 모험가 그룹을 안전하게 구성하고자 공포도가 X인 모험가는 반드시 X 명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정함
# 동빈이는 최대 몇 개의 모험가 그룹을 만들 수 있을까?
# N명의 모험가에 대한 정보가 주어졌을 때, 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성해야함!
# 입력예시 
# 모험가의 수 : 5
# 각 모험가의 공포도 : 2 3 1 2 2 
# 출력예시
# 2

n = int(input())
fears = list(map(int, input().split()))
min_num = 1
number = 0

fears.sort()


for f in fears:  
  if min_num == f:
    number += 1
    min_num = 1
  else:
    min_num += 1

print(number)


# 다른 코드
n = int(input())
fears = list(map(int, input().split()))

fears.sort()

min_num = 0
number = 0

for f in fears:  
  min_num += 1
  
  if min_num == f:
    number += 1
    min_num = 0

print(number)


    
