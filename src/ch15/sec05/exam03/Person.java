package ch15.sec05.exam03;

//Person 클래스를 Comparable 인터페이스 구현 객체로 정의하세요.
public class Person implements Comparable<Person> {
//    Person 클래스의 필드
    public String name;
    public int age;

//    Person 클래스의 생성자
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    Comparable 인터페이스의 compareTo 메서드 구현
    @Override
    public int compareTo(Person o) {
        if(age<o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;
    }
}
