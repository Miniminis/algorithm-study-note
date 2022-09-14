# 문제정보

- 문제 출처 : codeup
- 문제 번호 : 3130
- 문제 제목 : 소들의 헤어스타일
- 링크 : [https://codeup.kr/problem.php?id=3130](https://codeup.kr/problem.php?id=3130)

# 입력/출력
- 첫번째 줄에 소의 수 N이 입력된다.(1 <= N <= 80,000)
- 두 번째 줄 부터 N+1번째 줄까지 각 소들의 키가 입력된다. ( 1 <= hi <= 1,000,000,000 )

- 각 소들이 헤어 스타일을 확인할 수 있는 소들의 수를 출력한다.

```text
case 1)
6
10
3
7
4
12
2

5

case 2)
10
999999999
2
999999999
2
999999999
2
999999999
2
999999999
2

case 3)
80000
999999999
999994463
999989467
999989166
999985044
999983431
999974002
999972793
999961368
999951688
999944262
999940890
999932440
999929485
999918716
999917074
999915387
999908735
999908598
999897730
999890464
999885355
999874414
999874094
999864295
999855357
999853904
999845463
999842986
999837264
999833126
999821066
999816550
999813480
999804219
999799860
999792216
999783729
999774350
999769618
999760753
999756553
999753110
999748944
999741740
999740139
999737826
999737498
999736087
999730687
999718920
999709119
999702937
999699696
999695632
999692092
999687806
999679643
999673823
999663083
999652145
999642280
999632712
999620832
999614848
999610461
999607840
999596783
999591624
999590896
999583812
999575797
999572089
999562593
999555838
999552918
999552472
999544755
999543045
999539458
999527913
999524449
999522002
999514583
999510472
999498792
999498779
999494005
999489922
999481142
999478109
999469658
999465847
999460428
999449262
999438838
999437983
999427205
999419044
999416455
999414309
999405805 ...
최대 1024바이트까지만 보여줍니다.
```

# 풀이 아이디어
- 초기 숫자를 입력받는 stack 1 에서 가장 나중에 입력된 숫자들부터 꺼내면서 다른 stack 2에 넣는다. 
- stack 1에서 꺼내고 다른 stack 2의 모든 요소들과 비교
  - 숫자 >= stack2의 요소 : +1
  - 숫자 < stack2의 요소 : 즉시 종료
- 전체 count 출력

# 풀이
- 1차시도 : 잘못된 풀이 
  - stack 과 비교하는 수가 같은 경우를 간과했다. 
- 2차시도 : 시간초과 
  - 중첩 for 문으로 시간이 초과한듯
```java
package practice.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCow = sc.nextInt();

        Stack cowHome = new Stack();
        List<Integer> rights = new ArrayList();

        int count = 0;

        for (int i = 0; i < numOfCow; i++) {
            cowHome.push(sc.nextInt());
        }

        for (int i = 0; i < numOfCow; i++) {
            int num = (int) cowHome.pop();

            for (int j = rights.size()-1; j >= 0; j--) {
                int rightNum = rights.get(j);
                if (num <= rightNum) {
                    break;
                }

                count += 1;
            }

            rights.add(num);
        }

        System.out.println(count);
    }
}
```

- 3차시도
  - 스택 이용하여 자신이 볼 수 있는 소가 몇 마리인지 -> 자신을 볼 수 있는 소가 몇 마리인지를 카운트 하는 방식으로 전환
  - int 형으로 변수들 선언했다가 범위초과되어 long 으로 변경함
  - 참고
    - https://swblossom.tistory.com/75
    - https://jlog1016.tistory.com/42

```java
package practice.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numOfCow = sc.nextInt();

        Stack<Long> cowsHigherThanMe = new Stack();
        long count = 0;

        for (long i = 0; i < numOfCow; i++) {
            long cow = sc.nextInt();

            if (cowsHigherThanMe.isEmpty()) {
                cowsHigherThanMe.push(cow);
            } else if (cow >= cowsHigherThanMe.peek()) {
                //나보다 키가 같거나 작은소가 있을때까지 pop
                while (!cowsHigherThanMe.empty() && cow >= cowsHigherThanMe.peek()) {
                    cowsHigherThanMe.pop();
                }

                cowsHigherThanMe.push(cow);
            } else {
                //전부 나보다 키 큰 소들만 있음
                cowsHigherThanMe.push(cow);
            }

            count += (long) cowsHigherThanMe.size() - 1;
        }

        System.out.println(count);
    }
}
```

# 메모리 / 수행시간
- 56948 / 963