import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long amount = 1000, deposit, withdraw;
        int choice;
        int pin = 0;
        int k = 0;
        String transaction = "y";
        while (pin != 1520) {
            System.out.println("ENTER YOUR SECRET PIN NUMBER:");
            pin = sc.nextInt();
            if (pin != 1520)
                System.out.println("PLEASE ENTER VALID PASSWORD\n");
        }
        do {
            System.out.println("\t***Welcome to ATM Service***\n");
            System.out.println("\t\t1. Check Balance\n");
            System.out.println("\t\t2. Withdraw Cash\n");
            System.out.println("\t\t3. Deposit Cash\n");
            System.out.println("\t\t4. Quit\n");
            System.out.println("\t****************************\n\n");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("\n YOUR BALANCE IN Rs : ");
                    System.out.println(amount);
                    break;
                case 2:
                    System.out.println("\n ENTER THE AMOUNT TO WITHDRAW: ");
                    withdraw = sc.nextInt();
                    if (withdraw % 100 != 0) {
                        System.out.println("\n PLEASE ENTER THE AMOUNT IN MULTIPLES OF 100");
                    } else if (withdraw > (amount - 500)) {
                        System.out.println("\n INSUFFICENT BALANCE");
                    } else {
                        amount = amount - withdraw;
                        System.out.println("\n\n PLEASE COLLECT CASH");
                        System.out.print("\n YOUR CURRENT BALANCE IS ");
                        System.out.println(amount);
                    }
                    break;
                case 3:
                    System.out.println("\n ENTER THE AMOUNT TO DEPOSIT");
                    deposit = sc.nextInt();
                    amount = amount + deposit;
                    System.out.print("YOUR BALANCE IS ");
                    System.out.println(amount);
                    break;
                case 4:
                    System.out.println("\n THANK U USING ATM");
                    break;
                default:
                    System.out.println("\n INVALID CHOICE");
            }
            System.out.println("\n\n\n DO U WISH TO HAVE ANOTHER TRANSCATION?(y/n): \n");
            transaction = sc.next();
            if (transaction == "n" || transaction == "N")
                k = 1;
        } while (k != 0);

        System.out.println("\n\n THANKS FOR USING OUT ATM SERVICE");
    }
}