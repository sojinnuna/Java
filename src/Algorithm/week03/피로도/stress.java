package Algorithm.week03.피로도;

import java.util.*;

// 배열을 전달받으려면 어떻게 선언을 해야할까?

public class Stress {
    // 전역변수?
    int answer = 0;

    public int stress(int k, int[][] dungeons) {
        int n = dungeons.length;
        boolean[] visited = new boolean[n];
        backtrack(k, visited, n, dungeons, 0);
        return answer;
    }

    public void backtrack(int cur_k, boolean[] visited, int n, int[][] dungeons, int cnt) {
        //basecase
//       전역변수인 answer의 값이 변하도록 작성
        if(cnt > answer){
            answer = cnt;
        }

        //recursive call
        // n은 어디서 나온거지?
        // 어떻게 추가하고 뺀다는 의미지?
        for (int i = 0; i < n; i++) {
            if (cur_k >= dungeons[i][0] && !visited[i]){
                visited[i] = true; // 추가하기
                backtrack(cur_k - dungeons[i][1], visited, n, dungeons, cnt+1); // dungeons 소모, cnt 추가
                visited[i] = false; //추가하기
            }
        }
    }
}
