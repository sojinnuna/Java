package ch00.연산자;

public class p3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
//둘 다 맞아야 true 출력
        System.out.println((x>7)&&(y<=5));
//        둘 중 하나라도 맞으면 true 출력
        System.out.println((x%3 == 2) || (y%2 != 1));
    }
}
