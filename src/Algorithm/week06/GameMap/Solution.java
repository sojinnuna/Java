package Algorithm.week06.GameMap;

public class Solution {
    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};
    int rowLength;
    int colLength;

    public int GameMap(char[][] grid){
        rowLength = grid.length;
        // 그냥 grid의 길이로 하면 안되나?
        colLength = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[rowLength][colLength];

        for(int r = 0; r < rowLength; r++){
            for(int c = 0; c < colLength; c++){
                if(grid[r][c] == '1' && !visited[r][c]){
                    dfs(r, c, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
    // boolean도 2차 배열로 표시해야함
    void dfs(int r, int c, char[][] grid, boolean[][] visited){
        visited[r][c] = true;
        int count = 0;

        for(int i = 0; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(0 <= nr && nr < rowLength && 0 <= nc && nc < colLength && !visited[nr][nc]){
                dfs(nr, nc, grid, visited);
            }
        }
    }
}
