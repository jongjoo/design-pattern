package pattern.compound.duck;

public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("삑삒");
    }
}
