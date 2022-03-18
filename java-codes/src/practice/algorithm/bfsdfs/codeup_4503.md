# 문제정보

- 문제 출처 : codeup
- 문제 번호 : 4503
- 문제 제목 : 바이러스
- 링크 : [https://codeup.kr/problem.php?id=4503](https://codeup.kr/problem.php?id=4503)

# 입력/출력
1. 첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다. 
2. 둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. 
3. 이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다. 
4. 1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.

기본 케이스
```text
7
6
1 2
2 3
1 5
5 2
5 6
4 7

4
```

한번 통과 실패한 케이스 
```text
7
6
4 5
6 4
7 2
3 5
3 1
1 5

4
```


# 풀이 (DFS)
- 이전에 풀었었던 음료수 얼려먹기와 비슷하다고 생각되어 dfs 를 떠올려서 dfs 로 풀어보았다. 
- 그런데 풀이를 찾아보다보니, bfs 로 훨씬 빨리 푼 결과도 발견하여 bfs 로도 추가로 풀어보기로 한다. 

```java
package practice.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int count = -1;

    public static void main(String[] args) {
        //n, m 입력받기
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());

        //graph 정보 입력받기
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] infos = sc.nextLine().split(" ");
            int s = Integer.parseInt(infos[0]);
            int e = Integer.parseInt(infos[1]);

            graph.get(s).add(e);
            graph.get(e).add(s);
        }

//        System.out.println("graph = " + graph);

        //visited 정의
        boolean[] visited = new boolean[101];
        Arrays.fill(visited, false);

        dfs(visited, 1, graph);
        System.out.println(count);
    }

    private static void dfs(boolean[] visited, int i, List<List<Integer>> graph) {
        //dfs 수행
        //visited = true
        //count += 1
        visited[i] = true;
        count += 1;

        for (int j : graph.get(i)) {
            if (!visited[j]) {
                dfs(visited, j, graph);
            }
        }
    }

}

```

# 메모리 / 수행시간 (DFS)
- 14944 / 122



# 풀이 (BFS)

```java
package practice.algorithm;

import java.util.*;

public class Main {

    private static int n, m;
    private static int count = 0;

    public static void main(String[] args) {

        /*
        * bfs
        * n,m 입력받기
        * graph 정보 입력받기
        * - list, list
        * graph 정보 확인하기
        *
        * visited 정의 & 초기화
        * bfs 수행
        * - 방문 처리
        * - count ++
        * graph[i] 순회 중, visited[i] false 건 찾아서
        * */

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int j = 0; j < m; j++) {
            String[] connectInfo = sc.nextLine().split(" ");
            int s = Integer.parseInt(connectInfo[0]);
            int e = Integer.parseInt(connectInfo[1]);

            graph.get(s).add(e);
            graph.get(e).add(s);
        }

//        System.out.println("graph = " + graph);

        boolean[] visited = new boolean[101];
        Arrays.fill(visited, false);

        bfs(visited, 1, graph);
        System.out.println(count);
    }

    private static void bfs(boolean[] visited, int i, List<List<Integer>> graph) {
        visited[i] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int j : graph.get(v)) {
                if (!visited[j]) {
                    visited[j] = true;
                    count += 1;
                    queue.offer(j);
                }
            }
        }
    }
}

```

# 메모리/ 수행시간 (BFS)
- 15064 / 122