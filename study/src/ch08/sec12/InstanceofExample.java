package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {

//        instanceof: 해당 객체의 타입을 체크해준다
//        형변환 시 에러 발생을 방지해줌
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}


