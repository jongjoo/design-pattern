package pattern.factory.abstract_;

import pattern.factory.abstract_.ingredient.Cheese;
import pattern.factory.abstract_.ingredient.Clams;
import pattern.factory.abstract_.ingredient.Dough;
import pattern.factory.abstract_.ingredient.Pepperoni;
import pattern.factory.abstract_.ingredient.Sauce;
import pattern.factory.abstract_.ingredient.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
