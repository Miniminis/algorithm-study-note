# 1이 될 때까지
# 두 개의 숫자 N, K가 주어진다.
# 어떠한 수 N이 1이 될 때까지 두 과정 중 하나를 반복적으로 선택하여 수행한다.
  # N에서 1을 뺀다.
  # N에서 K를 나눈다.
# 예를들면 N=17, K=4 이면,
# 1번 수행 후, N=16
# 2번 수행 후, N=4
# 3번 수행 후, N=1
# 전체적으로 실행한 횟수는 3이 된다.
# 이처럼 어떤 조건과 수행해야할 일이 주어지고 그 수행의 최소 횟수를 구하는 프로그램을 작성해야하는 것

n, k = map(int, input().split())
cnt = 0

while n != 1:
  cnt += 1
  if n % k == 0:
    n /= k
  else:
    n-= 1

print(cnt)