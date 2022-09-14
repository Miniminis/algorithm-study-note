# 문제정보

- 문제 출처 : codeup
- 문제 번호 : 3129
- 문제 제목 : 올바른 괄호 2
- 링크 : [https://codeup.kr/problem.php?id=3129](https://codeup.kr/problem.php?id=3129)

# 입력/출력
- '('와 ')'로 이루어진 50,000글자 이하의 괄호 문자열이 입력된다.
- 문자열 중간에 공백이나 다른 문자는 포함되지 않는다.

- 올바른 괄호 문자열이면 'good', 아니면 'bad'를 출력한다.

```text
))()((

bad
---
)()(

bad
---
(()())

good
```

# 풀이 아이디어
- 여는괄호+닫는괄호의 쌍이 맞아야 한다. 
- 괄호를 입력을 받고 나서 하나씩 stack 에 넣는다. 
- 넣기 전에 <스택 최상단의 괄호> + <현재의 괄호> 가 "()" 와 같다면 최상단 pop()
- 모든 연산이 끝나고 stack 에 여전히 괄호가 남아있다면 bad, 남은 괄호없이 깨끗하다면 good

# 풀이

```java
package practice.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] brackets = sc.next().split("");
        Stack<String> pair = new Stack<>();

        for (int i = 0; i < brackets.length; i++) {
            String bracket = brackets[i];

            if (pair.isEmpty()) {
                pair.push(bracket);
                continue;
            }

            if ((pair.peek() + bracket).equals("()")) {
                pair.pop();
            } else {
                pair.push(bracket);
            }
        }

        if (pair.isEmpty()) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
```

# 메모리 / 수행시간
- 26160 / 391
