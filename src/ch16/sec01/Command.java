package ch16.sec01;

@FunctionalInterface
public interface Command {
    void execute(int x, int y);
}
