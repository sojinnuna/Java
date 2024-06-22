package study.Q6Class.exam04;

public class CarExample {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println("car1.company: " + car.company);

        Car car2 = new Car("자가용");
        System.out.println("car2.company: " + car.company);
        System.out.println("car2.model: " + car.model);

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company: " + car.company);
        System.out.println("car3.model: " + car.model);
        System.out.println("car3.color: " + car.color);

        Car car4 = new Car("택시", "검정", 200);

    }
}
