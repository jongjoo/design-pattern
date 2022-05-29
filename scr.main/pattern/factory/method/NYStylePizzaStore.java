package pattern.factory.method;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new NYStyleCheesePizza();
        }
        if (type.equals("clam")) {
            return new NYStyleCheesePizza();
        }
        if (type.equals("veggie")) {
            return new NYStyleCheesePizza();
        }
        throw new IllegalArgumentException();
    }
}
