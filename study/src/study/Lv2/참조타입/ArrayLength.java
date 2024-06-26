package study.Lv2.참조타입;

public class ArrayLength {
    public static void main(String[] args) {
        int[][] array= {
            {96, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        System.out.println(array.length); // 3
        System.out.println(array[2].length); // 5
    }
}
