package ch05.sce03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1; // 배열 변수 arr1 선언
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3}; // 배열 {1,2,3}을 생성하고 arr1 변수에 대입
        arr2 = new int[] {1,2,3};
        //arr2의 주소값을 arr3에 할당
        arr3 = arr2;

//        == 은 객체의 주소값을 비교
        //new를 할때마다 새롭게 객체의 주소가 할당되기 때문에 arr1과 arr2의 주소값은 다르다.
        System.out.println(arr1 == arr2);
        //arr3이 arr2의 주소값을 할당받았기 때문에 둘의 주소값은 같다.
        System.out.println(arr2 == arr3);
    }
}
