import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private String phoneNum;
    private boolean isMember;
    private int points;
    private static int size = 0;
    private static Map<String, Customer> customers = new HashMap<String, Customer>();

    public Customer(String name, String phoneNum, boolean isMember, int points) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.isMember = isMember;
        this.points = points;
        customers.put(phoneNum, this);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public boolean isMember() {
        return isMember;
    }

    public int getPoints() {

        return points;
    }

    public int getSize() {
        return size;
    }

    public void setPoint(int point) {
        this.points = point;
    }

    public static void addPoints(String PhoneNum, int Points) {
        Customer c = customers.get(PhoneNum);
        c.points += Points;
        customers.replace(PhoneNum, c);

    }

    public static Customer[] getCustomers() {
        return customers.values().toArray(new Customer[size]);
    }

    public static void addCustomer(String Name, String PhoneNum, Boolean MemberStatus, int Points) {
        Customer newcostumer = new Customer(Name, PhoneNum, MemberStatus, Points);
        customers.put(PhoneNum, newcostumer);
        size++;
    }

    public static Customer findCustomerByPhoneNum(String PhoneNum) {
        Customer c = customers.get(PhoneNum);
        return c;
    }

    // A static method that checks if a given phone number belongs to an existing
    // member
    /*
     * public static boolean checkExistingMember(String PneNum) {
     * for (Customer c : getCustomers()) {
     * if (c.getPhoneNum().equals(PhoneNum) && c.isMember()) {
     * return true;
     * }
     * }
     * return false;
     * }
     */

    public static void PrintMember(String PhoneNum) {
        /*
         * for (customer c : getCustomers()) {
         * if (c.getPhoneNum().equals(PhoneNum)) {
         * System.out.println("Name: " + c.getName() + "\nPhoneNumber: " +
         * c.getPhoneNum() + "\nPoint: " + c.getPoints());
         * }
         * }
         */

        Customer c = customers.get(PhoneNum);
        System.out.println("Name: " + c.getName() + "\nPhoneNumber: " + c.getPhoneNum() + "\nPoint: " + c.getPoints());
    }

    public static boolean CheckIfMember(String PhoneNum) {
        Customer c = customers.get(PhoneNum);

        if (c == null) {
            return false;
        }
        return true;
    }
}