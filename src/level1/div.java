package level1;

import java.util.Scanner;

public class div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        if(n2!=0) {
            int ans = n1 / n2;
            System.out.println("Division of two numbers: "+ans);
            int q=n1/n2;
            int rem=n1%n2;
            System.out.println("Quotient: "+q);
            System.out.println("Remainder "+rem);
        }
        else{
            System.out.print("Invalid operation.Division cant be done by 0");
        }
    }
}
