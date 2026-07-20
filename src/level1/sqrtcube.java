package level1;

import java.util.Scanner;

public class sqrtcube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int s=num*num;
        int c=s*num;
        System.out.println("Square of "+num+" is : "+s);
        System.out.println("Cube of "+num+" is :"+c);
    }
}
