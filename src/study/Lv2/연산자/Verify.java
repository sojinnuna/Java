package study.Lv2.연산자;

public class Verify {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println((x>7) && (y<=7)); // true 출력
        System.out.println((x%3 == 2) || (y%2 != 1)); // false 출력
    }
}
