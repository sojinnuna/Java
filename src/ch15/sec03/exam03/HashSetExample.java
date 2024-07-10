package ch15.sec03.exam03;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        //HashSet컬렉션 생성
        Set<String>set=new HashSet<>();
        //객체 추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");
        //객체를 하나씩 가져와서 처리
        //sete 내에서 반복 기능을 사용하기 위해 iterator를 가져옴
        Iterator<String> iterator=set.iterator();
        //hashNext:다음으로 가져올 요소가 있으면 true 없으면 false반환
        while(iterator.hasNext()) {
            //객체를 하나 가져오기
            //next:요소들을 돌면서 객체를 하나씩 가져오기
            String element=iterator.next();
            System.out.println(element);
            //요소들을 돌면서 JSP 인지 체크
            if(element.equals("JSP")) {
                //가져온 객체를 컬렉션에서 제거
                //조건에 일치하는 요소를 컬렉션에서 제거
                iterator.remove();
            }
        }
        System.out.println();
        //set 에서 remove를 쓰면 해당객체 제거
        set.remove("JDBC");
        //향상된 for 문으로 객체를 하나씩출력함
        // 객체를 하나씩 가져와서 처리
        for(String element:set) {
            System.out.println(element);
        }
    }
}
