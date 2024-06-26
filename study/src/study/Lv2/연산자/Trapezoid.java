package study.Lv2.연산자;

public class Trapezoid {
    public static void main(String[] args) {
        int top = 5;
        int bottom = 10;
        int height = 7;
//double 함수를 사용해서 실수로 출력함
        double result = (top + bottom) * height / 2.0;
        System.out.println("사다리꼴의 넓이는: " + result);
    }
}
