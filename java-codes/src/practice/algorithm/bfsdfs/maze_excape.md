# 문제정보

- 문제 출처 : NONE
- 문제 번호 : NONE
- 문제 제목 : 미로탈출문제
- 링크 : [NONE](NONE)
- 문제상세
  - N * M 크기의 직사각형 형태의 미로가 있다.
  - 여러마리의 괴물이 이어서 이를 피해서 탈출해야한다.
  - 사용자의 위치는 현재 (1, 1)에 있고 미로의 탈출구는 (N, M)에 있다.
  - 한번에 한칸씩만 이동이 가능하다.
  - 괴물있으면 0, 괴물 없으면 1로 표시되어있다.
  - 미로는 반드시 탈출할 수 있는 형태로 되어있다.
  - 탈출을 위해 움직여야하는 최소 칸의 개수는 무엇일까?
  - 4<= N, M<=200
  - 0과 1로 이루어진 미로정보가 주어짐
  - 시작과 마지막은 항상 1


# 입력/출력

```text
5 6
101010
111111
000001
111111
111111

10
```

# 풀이 아이디어
- bfs 로 풀어보자. 
- 1,1 에서 시작
- 매번 새로운 노드에 도착할 때 해당 노드의 값을 +1 해줌 
- 도착시의 노드가 1일때만 moveCnt +1 : 이때의 moveCnt 는 바로 해당 위치의 노드값이 됨
- 마지막 노드에 도착한 뒤, moveCnt 를 출력하면 됨!

# 풀이

```java
package practice.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Queue 생성을 위한 Node class 정의
class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class Main {
    //n, m, graph 변수 정의
    public static int n, m;
    public static int[][] graph = new int[201][201];

    //상하좌우 방향 정의
    public static int[] dx = {+1, -1, 0, 0};
    public static int[] dy = {0, 0, +1, -1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n, m 입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        //미로의 정보 입력받기
        for (int i=0; i < n; i++) {
            String row = sc.nextLine();
            for (int j=0; j < m; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }

        //미로 시작점부터 차례로 돌면서 bfs 실행
        System.out.println("bfs(0, 0) = " + bfs(0, 0));
    }

    private static int bfs(int i, int j) {
        Queue<Node> queue = new LinkedList<>();
        //x, y 에 해당하는 Node -> queue offer
        queue.offer(new Node(i, j));

        //queue 가 빌때까지 계속 반복
        while (!queue.isEmpty()) {
            //queue.poll -> x, y
            Node node = queue.poll();
            int x = node.getX();
            int y = node.getY();

            //현재 위치에서 상하좌우 확인
            //현재위치 + 상, 하, 좌, 우
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                //미로공간 벗어나면 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                //벽인 경우 무시
                if (graph[nx][ny] == 0) {
                    continue;
                }

                //graph x, y 가 처음방문하는 1이면 해당 노드까지의 최단거리 기록 = 현재위치값 +1 (누적)
                //해당 위치 queue 에 삽입
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }

        //queue 가 완전히 비워지면, 제일 하단 좌표 (= 지금까지의 이동 횟수를 담은) return n-1, m-1
        return graph[n-1][m-1];
    }

}

```

# 메모리 / 수행시간
- 


