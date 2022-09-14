# 문제정보

- 문제 출처 : programmers
- 문제 번호 : functiondev - level 2
- 문제 제목 : 기능개발
- 링크 : [https://programmers.co.kr/learn/courses/30/lessons/42586](https://programmers.co.kr/learn/courses/30/lessons/42586)

# 입력/출력

```text
progresses	speeds	return
[93, 30, 55]	[1, 30, 5]	[2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
```

# 풀이 아이디어
- 총 소요기간에 대한 큐를 만들고 
- 큐에서 요소를 하나씩 꺼낸다. 
- 현재요소 1개를 저장할 변수를 지정하고 꺼낸 요소가 해당 변수보다 작으면 패쓰, 크면 변수를 갱신한다.
- 이 과정에서 기능들을 카운트한다. 변수가 갱신될 때의 카운트 값을 정답 배열에 넣는다. 카운트도 다시 초기화한다.  

# 풀이

```java
package practice.algorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}) = "
                + Arrays.toString(
                solution(new int[]{93, 30, 55},
                        new int[]{1, 30, 5})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> workingDays = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            workingDays.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        System.out.println("workingDays = " + workingDays);

        List<Integer> answer = new ArrayList<>();

        while (!workingDays.isEmpty()) {
            int day = workingDays.poll();
            int cnt = 1;

            while (!workingDays.isEmpty() && day >= workingDays.peek()) {
                cnt += 1;
                workingDays.poll();
            }
            answer.add(cnt);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
```

### 풀면서 시간이 오래 걸린 이유
- 풀이 개념은 이해했고 푸는 방법도 잘 세웠는데 해당 과정을 코드로 옮기는 과정이 미숙했다.
- while 문 내부의 while 문을 구현하는데 시간이 오래결렸다. 

## 다른 사람들의 풀이 1
### 배울점
- 배열을 그대로 사용
- 간결한 코드

```java
// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
```

## 다른 사람들의 풀이 2
### 배울점
- 반복문을 중첩시키지 않고 한번에 값의 계산과 queue 대상자를 뽑아내는 전략을 사용함

```java
// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!q.isEmpty() && q.peek() < date) {
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        //마지막 요소에 대한 q.size() 값을 넣어준다.
        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
```

