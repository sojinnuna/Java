package study.Lv2.클래스;

public class DatabaseExample {
//    main: 시작점에 있는 클래스
    public static void main(String[] args) {
        Database database = Database.getInstance();

        database.connect();
        System.out.println("데이터베이스: " + database.getConnection());
        database.close();
    }
}
