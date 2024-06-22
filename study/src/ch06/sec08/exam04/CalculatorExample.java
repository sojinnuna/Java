package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator mycalc = new Calculator();

//        메소드 오버로딩: 메소드 이름은 같지만
        double result1 = mycalc.areaRectangle(10);

        double result2 = mycalc.areaRectangle(10, 20);

        System.out.println("정사각형 넓이=" + result1);
        System.out.println("직사각형 넓이=" + result2);
    }
}
