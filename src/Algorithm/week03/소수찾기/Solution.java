package Algorithm.week03.소수찾기;

import java.util.*;

class Solution {
    Set<Integer> candidates = new HashSet<>();

    public int solution(String numbers) {
        //재귀함수 사용하여 숫자 조합 생성
        // *permutation 조합을 스스로 구성할 수 있도록 5번 이상 복습 필요
        permutation(numbers, 0, new boolean[numbers.length()], 0);

        // 각 숫자 조합을 확인하여 소수의 개수를 센다.
        int answer = 0;
        for (int num : candidates) {
            if (isPrime(num))  answer++;
        }

        return answer;
    }

    void permutation(String numbers, int current, boolean[] visited, int digit) {
        if (digit == numbers.length()) return;

        for (int i = 0; i < numbers.length(); i++) {
            if (visited[i]) continue;

            int newValue = current + (int)((numbers.charAt(i) - '0') * Math.pow(10, digit));
            candidates.add(newValue);

            visited[i] = true;
            permutation(numbers, newValue, visited, digit + 1);
            visited[i] = false;
        }
    }

    // inPrime: 소수인지 확인하는 함수 ... 내(개발자)가 만듬
    boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
