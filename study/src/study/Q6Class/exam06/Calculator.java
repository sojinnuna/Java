package study.Q6Class.exam06;

public class Calculator {
    String powerOn;
    int result1;
    int result2;
    String powerOff;

    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public int plus(int i, int i1) {
       return i + i1;
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }
}
