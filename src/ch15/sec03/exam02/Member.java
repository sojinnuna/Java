package ch15.sec03.exam02;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }
    //equals 재정의
    @Override
    public boolean equals(Object obj) {
        //obj가 member로 바뀐거기 때문에 다운캐스팅해줌
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);

        }else {
            return false;
        }
    }
}
