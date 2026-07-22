package level4;

import java.util.Scanner;

public class sumofNnums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
        int evensum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0) {
                evensum += i;
            }
        }
        System.out.println("Even sum upto n"+evensum);
    }
}
