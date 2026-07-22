package level3;

import java.util.Scanner;

public class calcswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        char op=sc.next().charAt(0);
        int ans;
        switch(op)
        {
            case '+':
                ans=a+b;
                System.out.println(ans);
                break;
            case '-':
                ans=a-b;
                System.out.println(ans);
                break;
            case  '*':
                ans=a*b;
                System.out.println(ans);
                break;
            case '/':
                if(b!=0)
                {
                    ans=a/b;
                    System.out.println(ans);
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
