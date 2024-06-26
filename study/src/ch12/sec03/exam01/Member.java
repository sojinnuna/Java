package ch12.sec03.exam01;

public class Member {
    public String id;
    public Member(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            // target의 아이디와 현재 객체의 id가 동일한지 검사
            if(id.equals(target.id)) { // id 문자열이 같은지 비교
                return true;
            }
        }
        return false;
    }
}
