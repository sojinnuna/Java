package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet컬렉션 생성
        Set<Member> set=new HashSet<Member>();
        //Member객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        //저장된 객체 수 출력
        System.out.println("총 객체수 :"+set.size());

    }
}
