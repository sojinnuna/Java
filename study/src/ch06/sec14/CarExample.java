package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

//        잘못된 값이 들어갔을 경우 set 메소드에서 0으로 처리해준다
        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getspeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getspeed());
    }
}
