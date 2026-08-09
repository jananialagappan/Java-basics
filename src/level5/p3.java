package level5;

public class p3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int num=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=num+1-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
