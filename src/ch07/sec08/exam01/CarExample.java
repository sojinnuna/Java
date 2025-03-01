package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
//        Car 객체 생성
        Car myCar = new Car();
//        동일하게 myCar의 run 메소드를 호출했지만 다 다른 값이 출력됨 => 다형성

//        Tire 객체 장착
//        Tire 객체 하나를 생성해서 Car 클래스의 tire 필드에 넣어줌.
        myCar.tire = new Tire();
//        Tire의 run 메소드 호출
        myCar.run();

//        HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

//        KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
