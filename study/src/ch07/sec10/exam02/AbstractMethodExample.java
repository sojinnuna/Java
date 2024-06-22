package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // method call corrected from dog.sound to dog.sound()

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

//    파라미터로 객체를 주입받아서 다형성을 부여함
    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
