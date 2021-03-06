## BFS & DFS
- 대표적인 그래프 탐색 알고리즘
- 탐색
  - 많은 양의 데이터 중에서 원하는 데이터를 찾는 과정
- 테스트에 자주 등장
- 문제종류
  - 미로탈출/출구찾기
  - 이어진 덩어리 개수 구하기

### DFS, Depth First Search
- 깊이 우선 탐색
- 깊은 부분을 우선적으로 탐색하는 알고리즘
- 스택 자료구조 OR 재귀함수를 이용한다. 
- 구체적인 동작과정
  - 탐색 시작노드를 스택에 삽입하고 방문처리
  - 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문처리
  - 방문하지 않은 인접노드가 없으면 스택에서 최상단 노드를 꺼낸다. 
  - 더이상 2번과정을 수행할 수 없을때까지 반복한다. 

```java
package practice.algorithm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {},
                {2, 3, 8},
                {1, 7},
                {1, 4, 5},
                {3, 5},
                {3, 4},
                {7},
                {2, 6, 8},
                {1, 7}
        };

        boolean[] visied = new boolean[9];
        Arrays.fill(visied, false);

        dfs(graph, 1, visied);
    }

    public static void dfs(int[][] graph, int i, boolean[] visied) {
        visied[i] = true;
        System.out.println("i = " + i);

        for (int node : graph[i]) {
            if (!visied[node]) {
                dfs(graph, node, visied);
            }
        }
    }
}

//i = 1
//i = 2
//i = 7
//i = 6
//i = 8
//i = 3
//i = 4
//i = 5
```


### BFS, Breadth First Search
- 너비 우선 탐색
- 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘
- 큐 자료구조를 이용하며 동작 과정은 다음과 같음
  - 탐색 시작 노드를 큐에 삽입하고 방문처리를 한다. 
  - 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문처리를 한다. 
  - 더이상 2번의 과정을 수행할 수 없을 때까지 반복한다. 
- 최단거리 구하는 문제에서 자주 사용된다.

  
```java
package practice.algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {},
                {2, 3, 8},
                {1, 7},
                {1, 4, 5},
                {3, 5},
                {3, 4},
                {7},
                {2, 6, 8},
                {1, 7}
        };

        boolean[] visited = new boolean[9];
        Arrays.fill(visited, false);

        bfs(graph, 1, visited);
    }

    private static void bfs(int[][] graph, int i, boolean[] visited) {
        visited[i] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.println("v = " + v);

            for (int node : graph[v]) {
                if (!visited[node]) {
                    queue.add(node);
                    visited[node] = true;
                }
            }
        }
    }
}

//v = 1
//v = 2
//v = 3
//v = 8
//v = 7
//v = 4
//v = 5
//v = 6
```

