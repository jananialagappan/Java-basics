package level2;

import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max=a;
        if(b>a)
        {
            max=b;
        }
        if(c>a)
        {
            max=c;
        }
        System.out.print("Largest of 3 is :"+max);
    }

}
