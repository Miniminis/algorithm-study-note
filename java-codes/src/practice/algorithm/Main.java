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
