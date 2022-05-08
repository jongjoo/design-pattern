package pattern.strategy;

public class FlightStrategy implements Position {

    @Override
    public void move() {
        System.out.println("이륙하다");
    }

    @Override
    public void stop() {
        System.out.println("착륙하다");
    }
}
