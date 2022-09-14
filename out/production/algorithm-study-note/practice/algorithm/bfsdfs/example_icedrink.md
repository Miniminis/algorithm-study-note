# 문제정보

- 문제 출처 : NONE
- 문제 번호 : NONE
- 문제 제목 : 음료수 얼려먹기
- 링크 : [NONE](NONE)
- N * M 크기의 얼음틀이 있다.
- 구멍이 뚫려있는 부분은 0, 칸막이가 존재하는 부분은 1로 표시된다.
- 구멍이 뚫려있는 부분끼리 상, 하, 좌, 우로 붙어있는 경우 서로 연결되어 있는 것으로 간주한다.
- 이때 얼음틀의 모양이 주어졌을 때, 총 아이스크림의 개수를 구하는 프로그램을 작성해라
    - 예) 4 * 5 의 얼음틀 -> 아이스크림이 총 3개
- 연결요소찾기 문제
- 문제조건
    - 세로길이, 가로길이가 주어짐
    - 얼음틀의 형태가 주어짐
    - 구멍 부분 : 0
    - 막힌 부분 : 1

# 입력/출력

```text
4 5 
00110
00011
11111
00000

3
```

# 풀이 아이디어
1. 0으로 이어진 부분이 한 덩어리로 간주된다. 
2. 특정 지점의 상, 하, 좌, 우를 살펴 방문을 진행한다. 
3. 특정값이 0이고 방문하지 않은 지역이 있다면, 해당 지점을 방문
4. 위를 반복

# 풀이

```java
package practice.algorithm;

import java.util.Scanner;

public class Main {

    private static int n, m;
    private static int[][] graph = new int[1000][1000];

    public static void main(String[] args) {
        //그래프 사이즈 입력받기
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        //buffer 비우기
        scan.nextLine();

        //그래프 내부 정보 입력받기
        for (int i = 0; i < n; i++) {
            String row = scan.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = row.charAt(j) - '0';
            }
        }

        //출력할 result 정의하기
        int result = 0;

        //n, m 그래프 전부 돌면서 dfs 수행하기
        //결과가 true 이면 result ++
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }

        System.out.println("result = " + result);
    }

    private static boolean dfs(int i, int j) {
        //dfs
        //x, y : -1 or >x, y이면 false
        if (i <= -1 || i >= n || j <= -1 || j >= m) {
            return false;
        }

        //x, y == 0 -> 1로 교체
        if (graph[i][j] == 0) {
            graph[i][j] = 1;

            //내부에서 상, 하, 좌, 우 방면으로 dfs 실행 -> 완료되면 true
            dfs(i-1, j);
            dfs(i+1, j);
            dfs(i, j-1);
            dfs(i, j+1);

            return true;
        }

        //x, y == 1 이면 false
        return false;
    }
}

```

# 메모리 / 수행시간
- (afterTime-beforeTime) = 7472
