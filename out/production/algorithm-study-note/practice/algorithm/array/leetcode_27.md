# Problem Info

- [leetcode / 27. Remove Element](https://leetcode.com/problems/remove-element/)

# Solution 1

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }

        return index;
    }
}
```

- 시간 복잡도 : 1 ms
- 공간 복잡도 : 42.8 MB
- 풀이 과정
  - 별도의 배열을 만들지 않고 주어진 배열 내에서만 해결해야한다. 공간복잡도 O(1)의 제한이 있기 떄문
  - 따라서 현재 배열에서 새로운 index 를 별도로 카운팅 하고, 배열을 순회하며, 지우는 값이 아닐 경우, 그냥 index 순서대로 그냥 채워주는 방식을 이용했다. 

# Solution 2

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[length-- -1];
            }
        }

        return length;
    }
}
```

- 시간 복잡도 : 0 ms
- 공간 복잡도 : 40.8 MB
- 풀이 과정
  - 배열에서 대상 수일 경우, 배열의 제일 끝 수를 현재 index 자리로 삽입한 뒤, 전체 배열의 크기 및 다음 index를 1씩 줄인다. 그러면 현재 index를 다시 검사하게 되고, 검사 범위는 줄어든 array의 length 만큼이 될 것이다. 
