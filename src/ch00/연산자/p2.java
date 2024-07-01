package ch00.연산자;

public class p2 {
//    사다리꼴 넓이 구하기
    public static void main(String[] args) {
        double height = 7;
//        윗면 upperbase
        double up = 5;
//        아랫면 lowerbase
        double bottom = 10;
        double result = (up + bottom) * height / 2;

        System.out.println("사다리꼴의 넓이는: " + result);
    }
}
