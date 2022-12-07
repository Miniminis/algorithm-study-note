# Problem Info

- [leetcode / 1. Two Sum](https://leetcode.com/problems/two-sum/description/)

# Solution 1

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i == j) {
                    continue;
                }

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
```

- 시간 복잡도 : 162 ms / O(N^2)
- 공간 복잡도 : 45 MB
- 풀이 과정
  - 배열 내의 요소들을 하나씩 비교하여 합이 target과 같은지 비교하므로 가장 원초적으로 반복문을 써서 하나씩 비교하기로 함
  - 배열을 두 번 순회한다. 인덱스가 같은 경우에는 연산조차 하지 않는다. 요소를 중복해서 사용하지 않기로 했기 때문이다.
  - 서로 다른 인덱스의 두 수를 더했을 때, target 과 값이 같다면, 그 요소를 담은 길이가 2인 배열을 반환한다.
- 개선할 점
  - 시간 복잡도를 O(N^2) 보다 빠르게할 수 있는 방법이 있을까? -> 두번 순회하지 않고 한번의 스캔으로 해결할 수 있을까


# Solution 2

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }

            map.put(nums[i], i);
        }

        return result;
    }
}
```

- 시간 복잡도 : 11ms / O(N)
- 공간 복잡도 : 46.8 MB
- 풀이 과정
  - a + b = target -> a = target - b
