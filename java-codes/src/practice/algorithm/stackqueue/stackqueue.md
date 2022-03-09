## stack

- 먼저 들어온 데이터가 나중에 나가는 형식의 자료구조
- 선입후출, LIFO, last in first out
- 입구와 출구가 동일한 형태로 스택을 시각화
  - 예) 박스쌓기, 접시쌓기 등
- 다양한 알고리즘에서 사용됨 

### 예시

```java
package practice.algorithm;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        //원소 삽입
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("stack = " + stack);

        //최상단 원소 출력
        System.out.println("stack.peek() = " + stack.peek());

        //empty() check
        System.out.println("stack.empty() = " + stack.empty());

        //원소 삭제 : 삭제시 삭제한 원소 return
        while(!stack.empty()) {
            System.out.println("stack.pop() = " + stack.pop());
        }

        //삭제 후 stack 확인
        System.out.println("stack = " + stack);

        //isEmpty() check
        System.out.println("stack.isEmpty() = " + stack.isEmpty());

    }

    /*
    stack = [1, 2, 3]
    stack.peek() = 3
    stack.empty() = false
    stack.pop() = 3
    stack.pop() = 2
    stack.pop() = 1
    stack = []
    stack.isEmpty() = true
    */
}

```

### 직접구현

```java

```


## queue

- 먼저 들어온 데이터가 먼저 나가는 형식의 자료구조
- 선입선출, FIFO, first in first out
- 입구와 출구가 모두 뚫려있는 터널과 같은 형태로 시각화
  - 예) 은행대기줄
- 리스트로 구현은 가능하나, 시간복잡도가 증가한다. 
- Queue 자료구조를 지원함: LinkedList

### 예시

```java
package practice.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new LinkedList();

        //원소 삽입
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("queue = " + queue);

        //제일 첫번째 요소 출력
        System.out.println("queue.peek() = " + queue.peek());

        //원소 출력 : return 요소
        while(!queue.isEmpty()) {
            System.out.println("queue.poll() = " + queue.poll());
        }

        //empty check
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
    }

    /*
    queue = [1, 2, 3]
    queue.peek() = 1
    queue.poll() = 1
    queue.poll() = 2
    queue.poll() = 3
    queue.isEmpty() = true
    */

}

```

### 직접구현

```java

```
