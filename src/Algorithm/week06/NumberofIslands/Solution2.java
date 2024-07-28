package Algorithm.week06.NumberofIslands;

// 매개변수: n, m 크기의 배열 (1, 0으로 구성됨)
// 1은 섬이라서 갈 수 있고, 0은 물이라서 갈 수 없음
// return 값: 섬의 개수 → count해서 integer로 리턴

public class Solution2 {
    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};
    int rowLength;
    int colLength;

    public int numIslands(char[][] grid) {
        // 선언
        // 앞에 int를 안 쓴다 ?
        rowLength = grid.length;
        colLength = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[rowLength][colLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }

    // dfs 구현
    void dfs(int r, int c, char[][] grid, boolean[][] visited) {
        // 위에서 r과 c의 값을 받아옴
        visited[r][c] = true;

        for (int i = 0; i < rowLength; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            // rowLength, colLength 미만이어야함
            if (nr >= 0 && nr < rowLength && nc >= 0 && nc < colLength && grid[nr][nc] == '1') {
                if (!visited[nr][nc]) {
                    dfs(nr, nc, grid, visited);
                }
            }
        }
    }
}

