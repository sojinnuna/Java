package ch16.sec03;

public class Person {
    public void action1(Workable workable) {
        workable.work("고길동", "둘리 괴롭히기");
    }

    public void action2(Speakable speakable) {
        speakable.speak("Hello~");
    }
}
