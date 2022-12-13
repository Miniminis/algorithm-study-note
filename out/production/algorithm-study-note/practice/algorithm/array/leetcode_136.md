# Problem Info

- [leetcode / 136. Single Number](https://leetcode.com/problems/single-number/description/)

# Solution 1

```java
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i+=2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}
```

- 시간 복잡도 : 6 ms
- 공간 복잡도 : 42.2 MB
- 풀이 과정
  - 배열을 순서대로 정렬한 뒤, 마지막 요소를 제외한 홀수번째 요소만 검사하여 뒤의 요소와 페어가 되는지 확인하였다. 
  - 만약 이 모든 과정을 거쳐 답이 안나온다면, 정답은 맨 마지막 숫자가 된다. 
- 아쉬운 부분
  - 처음에 이 알고리즘을 생각하지 못했다. 배열의 가장 큰 특징인 정렬 기능을 간과했다.
  - 정렬 한 뒤, 페어로 생각하니까 문제가 훨씬 쉽게 풀렸다. 

# Solution 2

```java
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = res^nums[i];
        }

        return res;
    }
}
```

- 시간 복잡도 : 1 ms
- 공간 복잡도 : 50.4 MB
- 풀이 과정
  - 비트 연산자를 이용하여 푸는 방법
  - XOR 연산자
    - 두 값이 같으면 0을 다르면 1을 반환한다. 
    - 교환법칙이 성립한다. 연산의 위치는 중요하지 않다. 
    - 결합법칙도 성립한다. 
    - 항등원은 0이다. 0^X일 경우, 반드시 X가 나온다.  
- 참고
  - https://codechacha.com/ko/java-xor/
  - https://onejunu.tistory.com/125
