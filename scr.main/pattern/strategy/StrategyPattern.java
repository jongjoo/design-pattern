package pattern.strategy;

public class StrategyPattern {

    public StrategyPattern() {
        Car car = new Car();
        Flight flight = new Flight();

        car.setCarStrategy(new CarStrategy());
        car.move();
        car.stop();

        flight.setFlightStrategy(new FlightStrategy());
        flight.move();
        flight.stop();
    }
}
