package pattern.composite;

public class MenuTestDrive {

    public MenuTestDrive() {
        MenuComponent pancakeHouseMenu =
                new Menu("팬케이크 하우스 메뉴", "아침메뉴");
        MenuComponent dinerMenu =
                new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu =
                new Menu("카페 메뉴", "저녁 메뉴 ");
        MenuComponent dessertMenu =
                new Menu("디저트 메뉴", "디저트를 즐겨 보세요!");
//        MenuComponent coffeeMenu = new Menu("커피 메뉴", "Stuff to go with your afternoon coffee");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B 팬케이크 세트",
                "스크램블 에그",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "레귤러 팬케이크 세트",
                "달걀",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "블루베리 팬케이크",
                "신선한 블루베리",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "와플",
                "취향에 따라 .. 와플",
                true,
                3.5));

        dinerMenu.add(new MenuItem(
                "채식주의자용 BLT",
                "통밀 위에 콩고기 베이컨...",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "통 밀위에 베이컨 ..",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "오늘의 스프",
                "감자 샐러드로...",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "핫도그",
                "핫도그..임",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "찐 채소와 브라운 라이스",
                "찐 채소와 라이스...",
                true,
                3.99));

        dinerMenu.add(new MenuItem(
                "파스타",
                "마리나라 소스 스파게티 ...",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "애플 파이",
                "애플 파이..",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "치즈케이크",
                "뉴욕 치즈케이크",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "소르베",
                "라스베리와 라임의 절묘한 조화",
                true,
                1.89));

        cafeMenu.add(new MenuItem(
                "배지 버거와 에어 프라이",
                "배지 버거와 에어 프라이...",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "오늘의 스프",
                "오늘의 스프",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "브리토",
                "콩과 살사, 부리토",
                true,
                4.29));


        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
