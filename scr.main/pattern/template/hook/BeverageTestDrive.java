package pattern.template.hook;

public class BeverageTestDrive {
    public BeverageTestDrive() {

        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\n홍차 준비 중..");
        teaWithHook.prepareRecipe();

        System.out.println("\n커피 준비 중..");
        coffeeWithHook.prepareRecipe();

        System.out.println("\n주문하신 음료가 나왔습니다.\n");

    }
}
