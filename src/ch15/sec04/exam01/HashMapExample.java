package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
//        HashMapExample map = new HashMapExample;
//        Map의 인터페이스를 구현한 HashMapExample 클래스의 인스턴스를 생성하는 예
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
//        int value = map.get();
//        get(key)를 사용하면 해당 키에 저장되어있는 value 값을 얻을 수 있다
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

//    키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
//        keySet에는 키값들만 Set 형태로 저장되어있다
//        Set<String> keySet = map.ketSet();
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
//            키 값을 이용해서 value값을 얻어냄
//            Integer v = map.get(k);
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

//        엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
//        Set<Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
//      엔트리 Set를 돌면서 다음 엔트리를 가져옴
        while(entryIterator.hasNext()){
         Entry<String, Integer> entry = entryIterator.next();
         String k = entry.getKey();
         Integer v = entry.getValue();
            System.out.println(k + ": " + v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");

        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}
