package ch05.sce04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        //null인 배열의 0번째 값을 할당했기 때문에 NullPinterException 발생
        //intArray[0] = 10; //NullPointerException

        String str = null;
//        null로 초기화된 문자열의 길이를 출력했기 때문에 NullPinterException 발생
//        System.out.println("총 문자 수: " + str.length()); //NullPointerException
    }
}
