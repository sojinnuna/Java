package Algorithm.week04.network;


public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        // n(컴퓨터의 개수)만큼 dfs를 실행
        for (int i = 0; i < n; i++) {
            // 근데 중복되면 안되기에 if 조건 추가
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                answer++;
            }
        }
        return answer;
    }

    void dfs(int cur, int n, int[][] computers, boolean[] visited) {
        visited[cur] = true;

        for (int i = 0; i < n; i++) {
            if (computers[cur][i] == 1 && !visited[i]) {
                dfs(i, n, computers, visited);
            }
        }

        }
    }
