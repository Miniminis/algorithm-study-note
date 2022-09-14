# 문제정보

- 문제 출처 : codeup
- 문제 번호 : 1402
- 문제 제목 : 거꾸로출력하기3
- 링크 : [https://codeup.kr/problem.php?id=1402](https://codeup.kr/problem.php?id=1402)

# 입력/출력

```text
5
1 3 5 6 8

8 6 5 3 1 
```

# 풀이

```java
package practice.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        Stack stack = new Stack();

        for (int i = 0; i < num; i++) {
            stack.push(scanner.next());
        }

        for (int i = 0; i < num; i++) {
            System.out.print(stack.pop() + " ");
        }

    }
}
```

# 메모리 / 수행시간
- 14316 / 152
