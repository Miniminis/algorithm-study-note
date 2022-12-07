# Problem Info

- [leetcode / 26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

# Solution 1

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                continue;
            }

            nums[index] = nums[i];
            map.put(nums[i], index);
            index += 1;
        }

        return index;
    }
}
```

- 시간 복잡도 : 7 ms
- 공간 복잡도 : 48.2 MB
- 풀이 과정
  - 정렬된 배열에서 중복요소 제거하기
  - 제약조건 확인
    - 새로운 배열을 만들지 않고 반드시 배열을 수정함으로써 풀어야 한다. 
    - 배열의 길이를 변경할 수 없는 경우는 앞에서부터 차례대로 채워지도록 한다. 배열 길이는 상관하지 않는다. 

# Solution 2

```java
class Solution {
  public int removeDuplicates(int[] nums) {

    int index = 0;
    for (int n : nums) {
      if (index == 0 || n > nums[index-1]) {
        nums[index++] = n;
      }
    }

    return index;
  }
}
```

- 시간 복잡도 : 1 ms
- 공간 복잡도 : 44.2 MB
- 풀이 과정
  - nums 배열의 인덱스를 임의의 변수로 설정한다. 
  - 조건에 해당하는 경우만 인덱스를 증가시켜 해당 인덱스의 값에 삽입하는 방식
    - 조건 : 첫번째 요소일 경우 OR 현재 index의 가장 마지막번째 수보다 클 경우 -> 정렬된 배열의 속성을 매우 잘 이용하였음! 
