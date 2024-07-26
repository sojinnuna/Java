package Algorithm.week06.LengthKakao;

import java.util.*;

class Solution {
    private static final int[] dr = {1, -1, 0, 0};
    private static final int[] dc = {0, 0, 1, -1};

    public int[] solution(String[][] places) {
        int n = places.length;
        int[] answer = new int[n];

        // 각 장소에 대해 거리두기 규칙을 확인
        for (int i = 0; i < n; i++) {
            if (check(places[i])) {
                answer[i] = 1; // 거리두기 규칙을 잘 지킨 경우
            } else {
                answer[i] = 0; // 거리두기 규칙을 위반한 경우
            }
        }

        return answer;
    }

    // 모든 사람이 거리두기를 잘 하고 있는지 체크하는 함수
    boolean check(String[] place) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (place[r].charAt(c) == 'P') {
                    // 거리 2 이하에 사람(P)이 없으면 true 반환하고, 있으면 false를 반환하는 함수
                    if (!bfs(r, c, place)) {
                        return false;
                    }
                }
            }
        }
        return true; // 모든 P에 대해 거리두기를 잘 지키고 있는 경우
    }

    // 거리 2 이하에 사람이 있는지 확인하는 BFS 함수
    boolean bfs(int r, int c, String[] place) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{r, c, 0}); // 시작점과 거리 0
        boolean[][] visited = new boolean[5][5];
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cr = cur[0];
            int cc = cur[1];
            int dist = cur[2];

            // 거리 2 이상이면 더 이상 탐색하지 않음
            if (dist > 2) continue;

            // 거리 2 이하의 위치에서 사람 발견 시 거짓 반환
            if (dist != 0 && place[cr].charAt(cc) == 'P') {
                return false;
            }

            // 상하좌우로 이동
            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];

                // 유효한 위치인지 확인하고, 방문하지 않았으며, 벽이 아닌 경우
                if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && place[nr].charAt(nc) != 'X' && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, dist + 1});
                }
            }
        }

        return true; // 모든 사람에 대해 거리두기 규칙을 지킨 경우
    }
}