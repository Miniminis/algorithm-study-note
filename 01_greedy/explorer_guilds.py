# 모험가 길드 문제
# 모험가 그룹 길드장은 모험가 그룹을 안전하게 구성하고자 공포도가 X인 모험가는 반드시 X 명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정함

# 입력값을 오름차순으로 정렬 후 
# 현재 그룹에 포함된 모험가의 수 >= 현재 확인하고 있는 공포도 -> 바로 그룹결성가능!

x = int(input())
scare_points = list(map(int, input().split()))
scare_points.sort()

result = 0
count = 0

for point in range(len(scare_points)):
  count += 1

  if count >= point:
    result += 1
    count = 0

print(result)



