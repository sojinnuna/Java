package study.Q6Class.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean korean = new Korean("박자바", "011225-1234567");
        Korean korean2 = new Korean("김자바", "930525-0654321");
//print는 main 함수 안에 넣기
        System.out.println("k1.nation: " + korean.nation);
        System.out.println("k1.name: " + korean.name);
        System.out.println("k1.ssn: " + korean.ssn);
//띄어쓰기 하려면 어떻게 해야하는가?
        System.out.println("k2.nation: " + korean.nation);
        System.out.println("k2.name: " + korean.name);
        System.out.println("k2.ssn: " + korean.ssn);

    }
}
