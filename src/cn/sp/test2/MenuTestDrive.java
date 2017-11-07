package cn.sp.test2;

/**
 * Created by 2YSP on 2017/7/17.
 * 组合模式&迭代器模式
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("pancake house menu","Breakfast");
        MenuComponent dinnerMenu = new Menu("dinner menu","Lunch");
        MenuComponent cafeMenu = new Menu("cafe menu","Dinner");
        MenuComponent dessertMenu = new Menu("dessert menu","Dessert of course");

        MenuComponent allMenus = new Menu("All menus", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        //加入菜单项
        dinnerMenu.add(new MenuItem("Pasta","2313",true,3.89));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust",true,1.59));

        //...加入更多菜单项
        Waitress waitress = new Waitress(allMenus);
//        waitress.prinfMenu();

        waitress.printVegetarianMenu();
    }
}
