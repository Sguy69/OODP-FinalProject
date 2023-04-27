import java.util.Scanner;

public class Memba {
    color cl = new color();

    public void AskMemba(String PhoneNum) {
        Scanner Memsh = new Scanner(System.in);

        while (true) {
            System.out.println("\n" +
                    cl.Title("--------------------------MEMBER----------------"));
            System.out.println("\nDo you have membership? (Y/N)");
            String AnsMemd = Memsh.next().toUpperCase();
            if (AnsMemd.equals("Y") || AnsMemd.equals("N")) {
                Memsh.close();
                if (AnsMemd.equals("Y")) {
                    // CheckMemba if true Showdetail if false ask for register

                } else if (AnsMemd.equals("N")) {
                    // Skip to next bill
                    break;
                }
                break;
            } else {
                System.out.println(cl.Error("Error") + ":" + cl.ErText("Please input either Y or N"));

            }
            Memsh.close();
        }
    }

}