public class Menu {
    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Menu[] getList() {
        Menu[] menu = new Menu[9];
        menu[0] = new Menu("Espresso", 2.50);
        menu[1] = new Menu("Americano", 3.00);
        menu[2] = new Menu("Latte", 3.50);
        menu[3] = new Menu("Mocha", 4.00);
        menu[4] = new Menu("Cappuccino", 3.50);
        menu[5] = new Menu("Macchiato", 3.50);
        menu[6] = new Menu("Hot chocolate", 3.50);
        menu[7] = new Menu("Tea", 2.00);
        menu[8] = new Menu("Iced tea", 2.50);
        return menu;
    }

    public static void PrintMenu(Menu[] menu) {
        System.out.println("--------------------");
        System.out.println("|      Menu        |");
        System.out.println("--------------------");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getName() + " - " + menu[i].getPrice() + " $");
        }
        System.out.println("--------------------");
    }
}