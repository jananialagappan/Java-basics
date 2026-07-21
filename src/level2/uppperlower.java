package level2;

import java.util.Scanner;

public class uppperlower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println("Upper case");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Lower case");
        }
        else {
            System.out.println("Invalid character");
        }
    }
}
