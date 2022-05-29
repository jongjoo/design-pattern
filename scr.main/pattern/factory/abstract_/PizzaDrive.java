package pattern.factory.abstract_;


public class PizzaDrive {

    public PizzaDrive() {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName() + "\n");


    }
}
