package Algorithm.week04.WordChange;

import java.util.*;

public class WordChange { // 클래스 이름 수정 (Wordchange -> WordChange)
    public int solution(String begin, String target, String[] words) {
        // BFS 탐색을 위한 큐와 방문 여부를 기록할 배열 선언
        Queue<WordState> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        // 시작 단어를 큐에 추가하고, 초기 변환 횟수는 0
        queue.offer(new WordState(begin, 0));

        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            // 큐에서 현재 상태를 꺼낸다.
            WordState cur = queue.poll();

            // 현재 단어가 목표 단어와 일치하면 변환 횟수를 반환
            if (cur.word.equals(target)) return cur.cnt;

            // 다음 상태를 예약
            // 단어 목록에서 다음 단어를 찾는다.
            for (int i = 0; i < words.length; i++) {
                // 현재 단어와 한 글자만 다른 단어를 찾는다.
                if (getDiffCount(cur.word, words[i]) == 1) {
                    // 해당 단어가 아직 방문되지 않았으면
                    if (!visited[i]) {
                        // 큐에 해당 단어를 추가하고 방문 처리
                        queue.offer(new WordState(words[i], cur.cnt + 1));
                        visited[i] = true;
                    }
                }
            }
        }
        // 목표 단어를 찾지 못한 경우 0을 반환
        return 0;
    }

    // 두 단어의 다른 글자 수를 계산하는 함수
    private int getDiffCount(String word, String target) {
        int diffCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount;
    }

    // 단어의 상태를 나타내는 클래스
    class WordState {
        String word;
        int cnt;

        // 생성자를 통해 단어와 변환 횟수를 초기화
        WordState(String word, int cnt) {
            this.word = word;
            this.cnt = cnt;
        }
    }
}
