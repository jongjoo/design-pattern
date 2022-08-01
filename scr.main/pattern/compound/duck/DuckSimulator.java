package pattern.compound.duck;

public class DuckSimulator {

    public DuckSimulator() {
        simulate();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulate(duckFactory);
    }

    private void simulate() {
//        Quackable mallardDuck = new MallardDuck();
//        Quackable redheadDuck = new RedheadDuck();
//        Quackable duckCall = new DuckCall();
//        Quackable rubberDuck = new RubberDuck();
        // 데코레이터
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        // 어뎁터
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getNumberOfQuacks() + " 번");

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());


        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        System.out.println("\n오리 시뮬레이션 게임 (+반복자 팩토리)\n");
        simulate(flockOfDucks);

        System.out.println("\n오리 시뮬레이션 게임 (+추상 팩토리)");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getNumberOfQuacks() + " 번");

        Quackologist quackologist  = new Quackologist();


    }
}
