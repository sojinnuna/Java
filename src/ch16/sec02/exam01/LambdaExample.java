package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //실행문이 두개 이상인 경우 중괄호 필요
        person.action(()->{
            System.out.println("등교 합니다.");
            System.out.println("자바를 배웁니다.");
        });
        //실행문이 한 개일 경우 중괄호 생략 가능
   person.action(()->
       System.out.println("하교합니다.")
   );
    }

}
