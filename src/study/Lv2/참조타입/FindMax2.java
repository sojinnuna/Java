package study.Lv2.참조타입;

public class FindMax2 {
    public static void main(String[] args) {

        int sum = 0;
//        평균은 실수(double)로 선언
        double avg = 0.0;
//        개수 세는 것도 선언
        int count = 0;

        int[][] array = {
                {95, 86},
                {83, 92,  96},
                {78, 83, 93, 87, 88}
        };

        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        avg = (double) sum / count;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
