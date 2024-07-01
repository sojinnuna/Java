package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // x는 11
        ++x; // x는 12
        System.out.println("x=" + x);
        System.out.println("------------------------");

        y--; // y는 9
        --y; // y는 8
        System.out.println("y=" + y);
        System.out.println("------------------------");

        z = x++; // z는 12, x는 13
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------------");

        z = ++x; //z는 14, x는 14
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------------");

        z = ++x + y++; // z는 23, x는 15, y는 9
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
