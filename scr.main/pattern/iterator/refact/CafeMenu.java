package pattern.iterator.refact;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("베지 버거와 에어 프라이",
                "통밀 위에 콩고기 베이컨",
                true,
                3.99);

        addItem("오늘의 스프",
                "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",
                false,
                3.69);

        addItem("부르토",
                "감자 샐러드를 곁들인 오늘의 스프",
                true,
                4.29);

    }

    public void addItem(String name, String desc, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        menuItems.put(name, item);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }


    /*
        내부 구조를 드러내는 단점이 있어 제거.
        public MenuItem[] getMenuItems() {
        return menuItems;
    }*/
}
