# Problem Info

- [leetcode / 118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/description/)

# Solution 1

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                    continue;
                }

                row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }

            triangle.add(row);
        }

        return triangle;
    }
}
```

- 시간 복잡도 : 1ms / O(N^2)
- 공간 복잡도 : 42.3 MB
- 풀이 과정
  - 직관적으로 한줄씩 row 생성했다. 
- 아쉬운 점
  - 첫번째와 마지막 수를 제외하고는 이전 row의 (i-1, j-1), (i-1, j) 번째의 두 수를 더하는 것이라는 간단한 규칙을 코드화하지 못했다. 

# Solution 2

```java

```

- 시간 복잡도 :
- 공간 복잡도 :
- 풀이 과정
  - 
