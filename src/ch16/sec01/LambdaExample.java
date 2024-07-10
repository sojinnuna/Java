package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
//        x*y 계산
        action((x, y)->{
            int result=x*y;
            System.out.println("result = " + result);

        });
//        x/y 계산
        action((x, y)->{
            int result=x/y;
            System.out.println("result = " + result);
        });
    }

    public static void action(Command command) {
        int x=10;
        int y=4;
        //데이터 처리
        command.execute(x,y);
    }
}
