package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) +1;

        if(num==1){
            System.out.println("1번이 나왔습니다.");
        }
    }

}
