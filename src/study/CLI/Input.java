package study.CLI;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt(String title) {
        System.out.print(title);
        return Integer.parseInt(scanner.nextLine());
    }
}
