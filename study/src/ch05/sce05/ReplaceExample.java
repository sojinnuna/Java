package ch05.sce05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
    String newStr = oldStr.replace("자바", "JAVA"); //해당 문자열에서 oldStr에 해당하는 값을 newStr로 변경한다.

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
