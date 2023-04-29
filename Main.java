import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Color
        color cl = new color();

        // Add Custome
        Customer.addCustomer("Poommy", "0955960338", true, 10);
        Customer.addCustomer("Puneiei", "0123456789", true, 10);
        Customer.addCustomer("Domyuyu", "0234567890", true, 0);
        Customer.addCustomer("Guykuku", "0915492115", true, 9);
        do {
            System.out.println("");
            cl.PrintCafeName();
            Menu[] menu = Menu.getList();
            Menu.PrintMenu(menu);

            int menuIndex = 0;
            String phonenumber = "";

            // Select Menu
            Scanner scan = new Scanner(System.in);
            while (true) {

                System.out.print("\n| Select menu (1-9) | ");
                String input = scan.nextLine();
                try {
                    menuIndex = Integer.parseInt(input);
                    if (menuIndex > 0 && menuIndex < 10) {
                        break;
                    } else {
                        System.out.println(
                                cl.Error("Error") + " : " + cl.ErText("Please input a number between " + cl.Cyan("1")
                                        + cl.ErText(" and ") + cl.Cyan("9") + " "));
                    }
                } catch (NumberFormatException e) {
                    System.out.println(cl.Error("Error") + " : " + cl.ErText("Please input only numbers"));
                }
            }

            // Get user phonenumber
            // boolean phoneInputStatus = false;
            do {
                try {
                    phonenumber = Integer.toString(PhoneNumInput());
                    phonenumber = PhoneNumfix(phonenumber);
                    // phoneInputStatus = true;
                    break;
                } catch (InvalidInputException | InvalidPhoneNumber e) {
                    System.out.println(cl.Error("Error") + " : " + e.getMessage());
                }
            } while (true);

            System.out.println("\n" + cl.Title("------------------MEMBER------------------"));
            if (Customer.CheckIfMember(phonenumber)) {
                System.out.println("");
                Customer.PrintMember(phonenumber);
                // get free cup
                if (Customer.findCustomerByPhoneNum(phonenumber).getPoints() >= 10) {
                    System.out.print("Do you want to " + cl.ThingComplete("FREE") + " cup this order ? ("
                            + cl.ThingComplete("Y") + "/"
                            + cl.Red("N") + ") ");
                    Scanner Ans = new Scanner(System.in);
                    String customerAns = Ans.nextLine();
                    if (customerAns.toUpperCase().equals("Y")) {
                        // tranfer point
                        Customer.findCustomerByPhoneNum(phonenumber)
                                .setPoint(Customer.findCustomerByPhoneNum(phonenumber).getPoints() - 10);
                    } else {
                    }
                } else {
                }

            } else {
                System.out.println("\nYou're not our member yet");
                while (true) {
                    System.out.print(
                            cl.yellow("Do you want to ") + cl.ErText("register") + cl.yellow("?") + " ("
                                    + cl.ThingComplete("Y") + "/"
                                    + cl.Red("N") + ") ");
                    Scanner Ans = new Scanner(System.in);
                    String customerAns = Ans.nextLine();
                    if (customerAns.toUpperCase().equals("Y")) {
                        // register
                        System.out.print(cl.yellow("Name : "));
                        String NameInput = Ans.next();
                        Customer.addCustomer(NameInput, phonenumber, true, 0);

                        System.out.println("");
                        System.out.println(cl.ThingComplete("Register complete") + "\n");
                        Customer.PrintMember(phonenumber);
                        break;

                    } else if (customerAns.toUpperCase().equals("N")) {
                        // Check bill
                        break;
                    } else {
                        System.out.print("Answer " + cl.ThingComplete("Y") + " or " + cl.Red("N") + " only");
                    }
                    System.out.print("\n");
                    Ans.close();

                }
            }
            System.out.println("\n" + cl.Title("-------------------BILL---------------------"));
            System.out.println(
                    cl.yellow("\nYou selected menu: ") + menu[menuIndex - 1].getName() + " "
                            + menu[menuIndex - 1].getPrice()
                            + " $"
                            + cl.yellow("\nPhonenumber: ") + phonenumber);

            if (Customer.CheckIfMember(phonenumber)) {
                Customer.addPoints(phonenumber, 1);
                System.out.println("You gain " + cl.Cyan("1") + " more point, Now you have "
                        + cl.ThingComplete(Customer.findCustomerByPhoneNum(phonenumber).getPoints())
                        + ((Customer.findCustomerByPhoneNum(phonenumber).getPoints() < 1) ? "Points" : " Point"));
            }
            Thread.sleep(5000);
        } while (true);
    }

    public static int PhoneNumInput() throws InvalidInputException, InvalidPhoneNumber {

        try {
            // int phonenumber = Integer.parseInt(input);
            Scanner phone = new Scanner(System.in);
            color col = new color();
            col.Bar();
            System.out.print("\n");
            System.out.print("Please enter your phone number : ");
            int phonenumber = Integer.parseInt(phone.next());
            System.out.print("\n");
            col.Bar();
            if (PhoneNumfix(Integer.toString(phonenumber)).length() != 10) {
                throw new InvalidPhoneNumber();
            }
            return phonenumber;
        } catch (NumberFormatException e) {
            throw new InvalidInputException();
        }
    }

    public static String PhoneNumfix(String PhoNum) {
        return "0" + PhoNum;
    }
}
