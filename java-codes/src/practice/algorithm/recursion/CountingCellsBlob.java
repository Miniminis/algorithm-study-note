package practice.algorithm.recursion;

/**
 * counting cells in a blob
 * 상하좌우 대각선으로 인접한 셀의 덩어리를 찾는 문제
 * 1. 우선 나를 블롭으로 카운트하고,
 * 2. 나와 인접한 8개의 셀에 대하여 인접한 블롭이 있는지 체크한 후, 있다면 카운트를 증가시킨다.
 *
 * 픽셀함수 내에서는
 * 1. 범위 내인지 검사
 * 2. 이미지 픽셀인지 검사 = 백그라운드 컬러가 아니고 + 이미 방문한 곳도 아닌 곳
 * 3. 1번과 2번을 통과한 셀은 대상 셀이므로 방문처리하고 인접한 셀의 개수를 재귀 호출하여 모두 합한 값을 블롭 크기로 간주하여 반환한다.
 * */
public class CountingCellsBlob {

    private static final int BACKGROUND_COLOR = 0;
    private static final int PIXEL_COLOR = 1;
    private static final int ALREADY_COUNTED = 2;

    private static final int[][] pixels = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 1, 1}
    };

    public static void main(String[] args) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels.length; j++) {
                int result = countPixel(i, j);
                if (result > 0) {
                    System.out.println(result);
                }
            }
        }

    }

    private static int countPixel(int x, int y) {
        if (x < 0 || y < 0 || x >= pixels.length || y >= pixels.length) {
            return 0;
        }

        if (pixels[x][y] != PIXEL_COLOR) {
            return 0;
        }

        pixels[x][y] = ALREADY_COUNTED;
        return 1 + countPixel(x, y-1) + countPixel(x+1, y-1) + countPixel(x+1, y)
                + countPixel(x+1, y+1) + countPixel(x, y+1) + countPixel(x-1, y+1)
                + countPixel(x-1, y) + countPixel(x-1, y-1);
    }

    /**
     * 5
     * 1
     * 13
     * 5
     * */

}
