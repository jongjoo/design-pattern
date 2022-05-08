package pattern.strategy;

import java.util.Objects;

public class Car {

    private CarStrategy carStrategy;

    public void move() {
        if (Objects.nonNull(carStrategy)) {
            carStrategy.move();
        }
    }

    public void stop() {
        if (Objects.nonNull(carStrategy)) {
            carStrategy.stop();
        }
    }

    public void setCarStrategy(CarStrategy carStrategy) {
        this.carStrategy = carStrategy;
    }

}
