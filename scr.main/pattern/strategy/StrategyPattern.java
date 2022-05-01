package pattern.strategy;

public class StrategyPattern {

    public StrategyPattern() {

        Move fly = new Fly();
        Move swimming = new Swimming();

        fly.move();
        swimming.move();

        fly.setMsg("not Move");
        swimming.setMsg("not Move");

        fly.move();
        swimming.move();
    }

}
