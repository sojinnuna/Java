package Algorithm.week04.targetNumber;

public class targetNumber {
    // 결과를 저장할 전역 변수 선언
    private int answer;

    public int targetNumber(int[] numbers, int target) {
        // 초기화: 시작 시 answer를 0으로 설정
        answer = 0;
        // 백트래킹 시작: 초기 값과 초기 인덱스는 0
        backtrack(0, 0, numbers, target);
        // 가능한 모든 조합을 확인 후, answer 반환
        return answer;
    }

    // 백트래킹 메소드 구현
    void backtrack(int cur, int idx, int[] numbers, int target) {
        // 기저 조건: 인덱스가 배열의 끝에 도달한 경우
        if (idx == numbers.length) {
            // 현재 값이 목표 값과 같은 경우, answer 증가
            if (target == cur) {
                answer++;
            }
            // 더 이상 진행하지 않음
            return;
        }

        // 재귀 호출: 현재 인덱스의 숫자를 더하거나 빼는 두 가지 경우를 모두 탐색
        // 숫자를 더한 경우
        backtrack(cur + numbers[idx], idx + 1, numbers, target);
        // 숫자를 뺀 경우
        backtrack(cur - numbers[idx], idx + 1, numbers, target);
    }
}


