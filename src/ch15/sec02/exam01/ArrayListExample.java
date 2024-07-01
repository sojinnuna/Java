package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList 컬렉션 생성
//        List는 인터페이스기 때문에 해당 인터페이스를 구현한 구현 클래스로 객체를 생성해야 한다
        List<Board> list = new ArrayList<>();

//        객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

//        저장된 총 객체 수 얻기
//        size: 해당 리스트 안에 있는 객체 수를 알려준다
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

//        get(index): 해당 인덱스의 객체를 가져온다
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

//        향상된 for 문으로 가져오기
        for(Board b : list){
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
    }
}
