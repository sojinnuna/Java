package study.Lv2.클래스;

public class Database {
        private String connection = "MySQL";

//        Singleton 객체 생성
//    new 선언과 함께
        private static Database database = new Database();

        private Database() {}

    public static Database getInstance() {
            return database;
    }

        public String connect(){
            System.out.println(connection + "에 연결합니다.");
            return connection;
        }

        public void close() {
            System.out.println(connection + "을 닫습니다.");
        }
    public String getConnection(){
        return connection;
    }
}
