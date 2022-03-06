import heapq

def max_heap(iterable):
  h = []
  result = []

  for i in iterable:
    heapq.heappush(h, -i)

  for i in range(len(h)):
    result.append(-heapq.heappop(h))

  return result

array = [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]
result = max_heap(array)
print(result)
# [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
