package pattern.factory.abstract_;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        }
        if (type.equals("pepperoni")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }
        if (type.equals("clam")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        }
        if (type.equals("veggie")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        }
        return pizza;
    }
}
