package ch06.sec15.exam02;

import javax.xml.crypto.Data;

public class DataBaseExample {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        System.out.println("데이터베이스 : " + db.connect());

        db.connect2();
    }
}
