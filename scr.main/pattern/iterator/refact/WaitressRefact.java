package pattern.iterator.refact;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaitressRefact {

    List<Menu> menuList;

    public WaitressRefact() {
        menuList = new ArrayList<>();
        menuList.add(new PancakeHouseMenu());
        menuList.add(new DinerMenu());
        menuList.add(new CafeMenu());
        printMenu();
    }

    public WaitressRefact(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        Iterator<Menu> menuItemIterator = menuList.listIterator();
        while (menuItemIterator.hasNext()) {
            Menu menu = menuItemIterator.next();
            System.out.println("\n ---- \n");
            printMenu(menu.createIterator());
        }
        System.out.println("\n ---- \n");

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.name() + ", ");
            System.out.print(menuItem.price() + " -- ");
            System.out.println(menuItem.description());
        }
    }

}
