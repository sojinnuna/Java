package Algorithm.week06.NumberofIslands;

import java.util.*;

class Solution {
    // 전역변수로 선언
    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};
    int rowLength;
    int colLength;
    public int numIslands(char[][] grid) {
        rowLength = grid.length;
        colLength = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[rowLength][colLength];

        for (int r = 0; r < rowLength; r++){
            for (int c = 0; c < colLength; c++){
                if (grid[r][c] == '1' && !visited[r][c]){
                    dfs(r,c, grid, visited);
                    count += 1;
                }
            }
        }
        return count;
    }

    void dfs(int r,int c, char[][] grid, boolean[][] visited){
        visited[r][c] = true;

        for (int i = 0 ; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            // nr: 0보다 크고 rowLength보다 작아야함 / nc: 0보다 크고 colLength보다 작아야함 / grid는 1이어야함(섬)
            if (0 <= nr && nr < rowLength && 0 <= nc && nc < colLength && grid[nr][nc] == '1'){
                // 섬(1)인데도, 방문하지 않았다면?
                if (!visited[nr][nc]){
                    dfs(nr,nc, grid, visited);
                }
            }
        }
    }
}