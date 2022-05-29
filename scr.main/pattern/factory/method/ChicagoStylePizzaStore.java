package pattern.factory.method;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        if(type.equals("pepperoni")){
            return new ChicagoStyleCheesePizza();
        }
        if(type.equals("clam")){
            return new ChicagoStyleCheesePizza();
        }
        if(type.equals("veggie")){
            return new ChicagoStyleCheesePizza();
        }
        throw new IllegalArgumentException();
    }
}
