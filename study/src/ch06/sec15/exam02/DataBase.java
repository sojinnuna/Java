package ch06.sec15.exam02;

public class DataBase {
    String connect =  "MySQL";

    String connect() {
        System.out.println("MySQL에 연결합니다.");

        return connect;
    }
    void connect2() {
        System.out.println("MySQL을 닫습니다.");

    }

}
