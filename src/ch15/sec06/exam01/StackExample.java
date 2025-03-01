package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>();

//        동전 넣기
//        Stack은 한쪽이 막혀있는 박스라고 생각한다 → 아래쪽부터 차곡차곡 쌓인다
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

//        while(coinBox.empty()){
//            System.out.println(coinBox);
//            coinBox.peek();

//        동전을 하나씩 꺼내기 → LIFO기 때문에 마지막에 넣은 10원부터 출력된다
        while(!coinBox.isEmpty()){
//          반환된 요소는 Coin 객체로 캐스팅되어 coin 변수에 저장됩니다.
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }
    }
}
