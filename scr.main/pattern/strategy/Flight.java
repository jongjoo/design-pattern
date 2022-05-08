package pattern.strategy;

import java.util.Objects;

public class Flight {

    private FlightStrategy flightStrategy;

    public void move() {
        if (Objects.nonNull(flightStrategy)) {
            flightStrategy.move();
        }
    }

    public void stop() {
        if (Objects.nonNull(flightStrategy)) {
            flightStrategy.stop();
        }
    }

    public void setFlightStrategy(FlightStrategy flightStrategy) {
        this.flightStrategy = flightStrategy;
    }

}
