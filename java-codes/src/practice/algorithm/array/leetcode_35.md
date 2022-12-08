# Problem Info

- [leetcode / 35. Search Insert Position](https://leetcode.com/problems/search-insert-position/description/)

# Solution 1

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        //sorted array
        //target's index
        //not exist -> where to go in sorted array 


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }
}
```

- 시간 복잡도 : 2 ms / O(N)
- 공간 복잡도 : 43.7 MB
- 풀이 과정
  - 타겟 수와 같거나 타겟보다 큰 경우, 해당 index 를 반환한다. 
  - 그 이외의 경우에는 배열의 가장 마지막에 들어가게되는 경우인데, 이 경우는 현재 배열의 길이만큼 리턴해주면 된다. 

# Solution 2

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length-1;

        while (min <= max) {
            int mid = min + (max-min)/2;

            if (target < nums[mid]) {
                max = mid - 1;
            } else if (target > nums[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }

        return min;
    }
}
```

- 시간 복잡도 : O(logN) / 0 ms
- 공간 복잡도 : 42.1 MB
- 풀이 과정
  - binary search 를 이용하여 탐색 범위를 대폭 단축시켰더니 logN 으로 시간복잡도가 낮아졌다. 
