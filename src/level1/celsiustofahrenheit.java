package level1;

import java.util.Scanner;

public class celsiustofahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius=sc.nextDouble();
        double fahrenheit=(celsius*9/5)+32;
        System.out.println("Fahrenheit is : "+fahrenheit);
//        System.out.println("Enter Fahrenheit :");
//        double f=sc.nextDouble();
//        double c=(f-32)*5/9;
//        System.out.println("Celsius is :"+c);
    }
}
