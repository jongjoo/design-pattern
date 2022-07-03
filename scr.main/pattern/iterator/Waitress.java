package pattern.iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress() {
        pancakeHouseMenu = new PancakeHouseMenu();
        dinerMenu = new DinerMenu();
        printMenu();
    }

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("메뉴\n ----- \n 아침메뉴");
        printMenu(pancakeIterator);
        System.out.println("\n 점심 메뉴");
        printMenu(dinerIterator);
        System.out.println("\n ---- ");

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.name() + ", ");
            System.out.print(menuItem.price() + " -- ");
            System.out.println(menuItem.description());
        }
    }

}
