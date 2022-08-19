package exclass7.Bill;

import java.util.Scanner;

public class Others {
    public void login() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter username : ");
        String username = in.next();

        if (username.equals("Exit"))
            System.exit(0);

        for (User user : Data.getInstance().getUsers())
            if (user.getUsername().equals(username)) {
                userPanel(user);
                break;
            }

    }

    private void userPanel(User user) {
        Scanner in = new Scanner(System.in);

        System.out.println(user + "  1. bill List\n  2. logOut\n\n");

        switch (in.nextInt()) {
            case 1:
                billPanel(user);
                break;
            case 2:
                login();
                break;
            default:
                userPanel(user);
        }
    }

    private void billPanel(User user) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n\n  1. All Bills\n  2. addBill\n  3. back to user Panel\n");

        switch (in.nextInt()) {
            case 1:
                printBill(user);
                break;
            case 2:
                user.addBill(getBillData());
                billPanel(user);
                break;
            case 3:
                userPanel(user);
                break;
            default:
                billPanel(user);
        }
    }

    private Bill getBillData() {
        Scanner in = new Scanner(System.in);

        System.out.println("\n  Enter serial : ");
        int serial = in.nextInt();

        System.out.println("\n  Enter amount : ");
        int amount = in.nextInt();

        System.out.println("\n\t\t\tBill Added...");

        return new Bill(serial, amount);
    }

    private void printBill(User user) {
        Scanner in = new Scanner(System.in);
        user.printAllBills();

        System.out.println("-------------\n  press 0 to back");

        if (in.nextInt() == 0)
            billPanel(user);
        else
            printBill(user);
    }
}
