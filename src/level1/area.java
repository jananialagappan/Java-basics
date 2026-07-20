package level1;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int area=l*b;
        System.out.println("Area of rectangle is :"+area);
    }
}
