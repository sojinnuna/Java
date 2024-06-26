//package cli;
//
//import java.util.Scanner;
//
//public class Input {
//    static Scanner sc = new Scanner(System.in);
//
////    매개변수 title을 출력하고 줄바꿈하지 않음
////    사용자가 입력한 문자열을 리턴함
//    public static String read(String title){
//        System.out.println(title);
//        return sc.nextLine();
//    }
//
////    매개변수title을 출력하고 줄바꿈하지 않음
////    사용자가 입력한 문자열을 리턴함
////    그냥 엔터를 치면 defaultValue를 리턴
//    public static String read(String title, String defaultValue){
//        System.out.println("%s(%s): ", title, defaultValue);
//        Stirng answer = sc.nextLine();
//
////        입력값이 비어있는지 확인하고 비어있으면 defaultValue, 안 비어있으면 answer 리턴
//        return answer.isEmpty() ? defaultValue : answer;
//    }
//
////    매개변수 title을 출력하고 줄바꿈하지 않음
////    사용자가 입력한 문자열을 정수로 변환 후 리턴함
//    public static int readInt(String title){
//        System.out.println(title);
//        int answer = sc.nextInt();
//        sc.nextLine();
//        return answer;
//    }
//
////    매개변수 title (Y/n)을 출력하고 줄바꿈하지 않음,
////    defaultValue가 true 이면 (Y/n), false이면 (y/N)을 출력
////    입력 없이 엔터를 친 경우 기본값 리턴
//    public static boolean confirm(String title, boolean defaultValue){
////        defaultValue 가 true면 (Y/n), false면 (y/N)을 yesNo에 저장
////        defaultValue == true는 defaultValeu로 줄여쓸 수 있다
//        String yesNo = defaultValue ? "Yes" : "No";
//        System.out.println("%s %s: ", title, yesNo);
//
//        String answer = sc.nextLine();
////        answer가 비어있는 경우 기본값 리턴
//        if(answer.isEmpty()) return defaultValue;
//
//        return answer.equalsIgnoreCase("y");
//    }
//
//    public static boolean confirm(String title){
//        return confirm(title, true);
//    }
//}
