package pattern.strategy;

public class CarStrategy implements Position {

    @Override
    public void move() {
        System.out.println("출발하다.");
    }

    @Override
    public void stop() {
        System.out.println("정지하다.");
    }
}
