package study.Lv2.참조타입;

public class FindMax {
    public static void main(String[] args) {
//        max 값 선언 + 배열 선언
        int max = 0;
        int [] array = {1, 5, 3, 8, 2};

        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("max: " + max);
    }
}
