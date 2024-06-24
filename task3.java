import java.util.*;
public class ATM {
    public static void main(String args[]) {
        int bal = 15000, wd, dep;
        Scanner o = new Scanner(System.in);
        while (true) {
            System.out.println("1.deposit");
            System.out.println("2.withdraw");
            System.out.println("3.check balance");
            System.out.println("4.exit");
            System.out.print("enter your choice:");
            int choice = o.nextInt();
            switch (choice) {
            case 1:
                System.out.print("enter the amount to be deposited:");
                dep = o.nextInt();
                bal += dep;
                System.out.println("Successfully deposied and your new balance is " + bal);
                System.out.println("");
                break;

            case 2:
                System.out.print("enter the money to be withdrawn:");
                wd = o.nextInt();
                if (bal >= wd) {
                    bal -= wd;
                    System.out.println("please do collect your money and remaining balance is " + bal);
                } else {
                    System.out.println("withdrawal failed since money is not sufficient");
                }
                System.out.println("");
                break;

            case 3:
                System.out.println("current balance : " + bal);
                System.out.println("");
                break;

            case 4:
                System.out.println("exit");
                System.exit(0);
            }
        }
    }
}
