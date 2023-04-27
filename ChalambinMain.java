/*
 * import java.util.Scanner;
 * 
 * public class ChalambinMain {
 * 
 * /* public static void main(String[] args) throws Exception{
 * // Color
 * color cl = new color();
 * Memba mem = new Memba();
 * // Display Menu
 * 
 * // Add Customers
 * // customer.addCustomer("John", "0123456789", true, 10);
 * // customer.addCustomer("Puneiei", "0123456789", true, 10);
 * // customer.addCustomer("Domyuyu", "0234567890", false, 0);
 * 
 * System.out.println(cl.Title("---Welcome to Chalambin Cafe---"));
 * 
 * Menu[] menu = Menu.getList();
 * Menu.PrintMenu(menu);
 * 
 * int menuIndex = 0;
 * String phonenumber = "";
 * // Select Menu
 * Scanner scan = new Scanner(System.in);
 * while (true) {
 * System.out.println(cl.Title("-------------------"));
 * System.out.print("\n|Select menu (1-9):|");
 * String input = scan.nextLine();
 * try {
 * menuIndex = Integer.parseInt(input);
 * if (menuIndex >= 0 && menuIndex <= 8) {
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
 * // boolean phoneInputStatus = false;
 * do {
 * try {
 * phonenumber = Integer.toString(PhoneNumInput());
 * // phoneInputStatus = true;
 * break;
 * } catch (InvalidInputException | InvalidPhoneNumber e) {
 * System.out.println(cl.Error("Error") + " : " + e.getMessage());
 * }
 * } while (true);
 * 
 * /*
 * while (true) {
 * System.out.println("Please enter phonenumber: ");
 * String input = phone.nextLine();
 * try {
 * phonenumber = Integer.parseInt(input);
 * break;
 * } catch (NumberFormatException e) {
 * System.out.println("Error: Please input only numbers");
 * }
 * }
 */
/*
 * // Show user selected menu
 * System.out.print("\033[H\033[2J");
 * System.out.println("\n" +
 * cl.Title("--------------------BILL----------------------"));
 * System.out.println(
 * "\nYou selected menu: " + menu[menuIndex - 1].getName() + menu[menuIndex -
 * 1].getPrice()
 * + "\nPhonenumber: 0" + phonenumber + "You get 1 point");
 * 
 * // Ask user if they have membership
 * // use phone number to find member
 * mem.AskMemba(phonenumber);
 * 
 * /*
 * while (true) {
 * System.out.println("\n" +
 * cl.Title("--------------------------MEMBER----------------"));
 * System.out.println("\nDo you have membership? (Y/N)");
 * 
 * if (Memsh.hasNextLine()) {
 * String AnsMemd = Memsh.nextLine();
 * String AnsMems = AnsMemd.toUpperCase();
 * if (AnsMems.equals("Y") || AnsMems.equals("N")) {
 * break;
 * } else {
 * System.out.println(cl.Error("Error") + ":" + "Please input either Y or N");
 * }
 * } else {
 * System.out.println(cl.Error("Error") + ":" + "Please enter a valid input");
 * Memsh.nextLine(); // consume the invalid input
 * }
 * }
 * Memsh.close();
 */
/*
 * }
 * // Call CheckUserMem method
 * 
 * // check.CheckUserMem(AnsMem, phonenumber);
 * 
 * // check.CheckCosMem(AnsMem, phonenumber);
 * // Thank customer
 * 
 * //////////////////////////////////////////
 * 
 * //public static void CheckCusInfo(String Ans, int PhoneNum) {
 * // String input = Ans.toUpperCase();
 * //if (input.equals("Y")) {
 * //}
 * //}
 */

/*
 * public static int PhoneNumInput() throws InvalidInputException,
 * InvalidPhoneNumber {
 * 
 * try {
 * // int phonenumber = Integer.parseInt(input);
 * Scanner phone = new Scanner(System.in);
 * System.out.println("////////////////////////////////////////// \n");
 * System.out.print("Please enter your phonenumber : ");
 * int phonenumber = Integer.parseInt(phone.next());
 * System.out.println("\n////////////////////////////////////////// \n");
 * if (PhoneNumfix(Integer.toString(phonenumber)).length() != 10) {
 * throw new InvalidPhoneNumber();
 * }
 * return phonenumber;
 * } catch (NumberFormatException e) {
 * throw new InvalidInputException();
 * }
 * 
 * //}*
 * 
 * public static String PhoneNumfix(String PhoNum) {
 * return "0" + PhoNum;
 * //}
 * }
 */
/*
 * public static String PhoneNumFix(String PhoNum) {
 * int count = 0;
 * int PhNm = Integer.parseInt(PhoNum);
 * while (PhNm != 0) {
 * PhNm = PhNm / 10;
 * count = count + 1;
 * }
 * if (count != 10) {
 * String FixedPhNm = "0" + Integer.toString(PhNm);
 * return FixedPhNm;
 * } else {
 * return PhoNum;
 * }
 * 
 * }
 */
