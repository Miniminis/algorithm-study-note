# 문제정보

- 문제 출처 : codeup
- 문제 번호 : 3130
- 문제 제목 : 소들의 헤어스타일
- 링크 : [https://codeup.kr/problem.php?id=3130](https://codeup.kr/problem.php?id=3130)

# 메모리 / 수행시간
- 

# 입력/출력

```text

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

