package study.Lv2.조건문과반복문;

public class FindSolution {
    public static void main(String[] args) {
//        x와 y는 10 이하의 자연수이다
        for(int x = 1; x <=10; x++) {
            for(int y = 1; y <=10; y++) {
//                4x + 5y = 60인 방정식
                int answer = 4*x + 5*y;
//                60인 경우를 출력한다
                if (answer == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
