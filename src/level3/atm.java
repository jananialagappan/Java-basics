package level3;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int initialbalance=10000;
        System.out.println("1. Check Balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "4. Exit");
        int choice= sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("current balance:"+initialbalance);
                break;
            case 2:
                int deposit=sc.nextInt();
                System.out.println("Amount deposited: "+deposit);
                System.out.println("Total balance: "+(deposit+initialbalance));
                break;
            case 3:
                int wd=sc.nextInt();
                System.out.println("Amount withdrawed: "+wd);
                System.out.println("Current balance: "+(initialbalance-wd));
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
