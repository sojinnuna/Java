package ch07.sec04.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
//        flyMode의 기본값이 Normal이므로 Airplane의 fly 호출
        sa.fly();
//        상수는 무조건 대문자로 작성한다
//        static 값은 클래스명으로 접근.
//        flyMode를 SUPERSONIC으로 변경해줌
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
//        flyMode가 SUPERSONIC으로 변경됐으므로 if문을 통해 자식의 토드 출력
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
//        Airplane의 land 메소드 실행
        sa.land();
    }
}
