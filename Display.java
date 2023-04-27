import java.util.*;
import java.util.Scanner;;

public class Display {

    ArrayList<String> User = new ArrayList<String>();

    public void showUser(String name, int point, ArrayList<String> menuItems) {
        System.out.println("User: " + name);
        System.out.println("Points: " + point);
        System.out.println("Menu Items:");
        for (String item : menuItems) {
            System.out.println("-" + item);
        }
    }

    Menu[] menu = new Menu[9];

    public void PrintMenu() {
        System.out.println("///--Menu--///");
        {
            for (Menu item : menu) {
                System.out.println(item.getName() + "\n" + item.getPrice() + " Baht");

            }
        }
    }

    public static void showUserDetail() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> phoneNums = new ArrayList<String>();

        System.out.println("Enter phone numbers :");
        while (true) {
            String phone = input.nextLine();
            if (phone.equals("done")) {
                break;
            }
            phoneNums.add(phone);
        }
        System.out.println("Phone numbers collected:");
        for (String phone : phoneNums) {
            System.out.println(phone);
        }

    }
}
