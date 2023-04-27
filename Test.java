/*
 * import java.util.Scanner;
 * 
 * public class Test {
 * 
 * public static void main(String[] args) throws InvalidInputException {
 * // Color
 * color cl = new color();
 * // Display Menu
 * System.out.println(cl.Title("---Welcome to Chalambin Cafe---"));
 * 
 * Menu[] menu = Menu.getList();
 * Menu.PrintMenu(menu);
 * 
 * int menuIndex = 0;
 * String phonenumber = "";
 * String AnsMem = "";
 * 
 * // Select Menu
 * Scanner scan = new Scanner(System.in);
 * while (true) {
 * System.out.println("--------------------");
 * System.out.print("\n|Select menu (1-9):|");
 * String input = scan.nextLine();
 * try {
 * menuIndex = Integer.parseInt(input);
 * if (menuIndex >= 1 && menuIndex <= 9) {
 * break;
 * } else {
 * System.out.println(cl.Error("Error") + " : " +
 * cl.ErText("Please input a number between 1 and 9 "));
 * }
 * } catch (NumberFormatException e) {
 * System.out.println(cl.Error("Error") + " : " +
 * cl.ErText("Please input only numbers"));
 * }
 * }
 * 
 * // Get user phonenumber
 * do {
 * try {
 * phonenumber = Integer.toString(PhoneNumInput());
 * break;
 * } catch (InvalidInputException e) {
 * System.out.println(cl.Error("Error") + " : " + e.getMessage());
 * }
 * } while (true);
 * 
 * // Show user selected menu
 * System.out.print("\033[H\033[2J");
 * System.out.print("\033[H\033[2J");
 * System.out.println("\n--------------------BILL----------------------");
 * System.out.println(
 * "\nYou selected menu: " + menu[menuIndex - 1].getName() + " " +
 * menu[menuIndex - 1].getPrice()
 * + "\nPhonenumber: 0" + phonenumber + "\nYou get 1 point.");
 * 
 * // Ask user if they have membership
 * Scanner Memsh = new Scanner(System.in);
 * while (true) {
 * System.out.println("\n--------------------------MEMBER----------------");
 * System.out.println("\nDo you have membership? (Y/N)");
 * AnsMem = Memsh.nextLine().toUpperCase();
 * if (AnsMem.equals("Y") || AnsMem.equals("N")) {
 * break;
 * } else {
 * System.out.println("Error: Please input either Y or N");
 * }
 * }
 * 
 * // Check if the customer has a membership
 * CheckUserMem(AnsMem, phonenumber);
 * 
 * // Thank customer
 * System.out.println("Thank you for coming to Chalambin Cafe!");
 * 
 * }
 * 
 * private static int PhoneNumInput() {
 * return 0;
 * }
 * 
 * public static void CheckUserMem(String Ans, String PhoneNum) {
 * String input = Ans.toUpperCase();
 * if (input.equals("Y")) {
 * System.out.println("Customer with phone number " );}
 * \\
 */
