import heapq

def heapsort(iterable):
  h = []
  result = []

  for i in iterable:
    heapq.heappush(h, i)

  for i in range(len(h)):
    result.append(heapq.heappop(h))

  return result

array = [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]
result = heapsort(array)
print(result)
# [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]