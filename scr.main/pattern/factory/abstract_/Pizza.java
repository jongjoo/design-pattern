package pattern.factory.abstract_;

import pattern.factory.abstract_.ingredient.Cheese;
import pattern.factory.abstract_.ingredient.Clams;
import pattern.factory.abstract_.ingredient.Dough;
import pattern.factory.abstract_.ingredient.Pepperoni;
import pattern.factory.abstract_.ingredient.Sauce;
import pattern.factory.abstract_.ingredient.Veggies;

public abstract class Pizza {
    String name;

    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
