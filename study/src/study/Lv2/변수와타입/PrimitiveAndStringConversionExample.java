package study.Lv2.변수와타입;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
//        00.parse00: 문자를 데이터 타입으로 변경
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

//        String.valueof: 데이터 타입을 문자로 변경
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);


    }
}
