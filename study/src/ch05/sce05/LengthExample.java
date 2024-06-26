package ch05.sce05;

public class LengthExample {
    public static void main(String[] args) {
        //String에 length()를 사용하면 해당 문자열의 길이를 반환한다.
        String ssn = "9506241230123";
        int length = ssn.length();
        if(length == 13) {
            System.out.println("주민등록번호자릿수가맞습니다.");
        } else {
            System.out.println("주민등록번호자릿수가틀립니다.");
        }
    }
}

