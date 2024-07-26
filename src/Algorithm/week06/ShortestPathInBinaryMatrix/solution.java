package Algorithm.week06.ShortestPathInBinaryMatrix;

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    boolean isInRange(int r, int c, int rowLength, int colLength) {
        return (r >= 0 && r < rowLength) && (c >= 0 && c < colLength);
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        int shortestDist = -1;
        int rowLength = grid.length;
        int colLength = grid[0].length;

        if (grid[0][0] != 0 || grid[rowLength - 1][colLength - 1] != 0) {
            return shortestDist;
        }

        // 이동 가능한 8가지 방향을 정의
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

        // 방문 여부를 저장할 곳
        boolean visited[][] = new boolean[rowLength][colLength];

        //BFS !!
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        //BFS 실행
        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int curRow = curPos[0];
            int curCol = curPos[1];
            int curLength = curPos[2];

            // 현재 위치가 목적지라면?
            // 도달못했다면? -1 리턴
            if (curRow == rowLength - 1 && curCol == colLength - 1) {
                shortestDist = curLength;
                return shortestDist;
            }

            // 예약 !!
            // 8가지 방향으로 이동한 결과를 큐에 입력
            for (int[] d : dir) {
                int nextRow = curRow + d[0];
                int nextCol = curCol + d[1];

                if (isInRange(nextRow, nextCol, rowLength, colLength)) {
                    if (grid[nextRow][nextCol] == 0 && !(visited[nextRow][nextCol])) {
                        queue.offer(new int[]{nextRow, nextCol, curLength + 1});
                        // 방문 표시
                        visited[nextRow][nextCol] = true;
                    }
                }
            }

        }
        return shortestDist;
    }
}
