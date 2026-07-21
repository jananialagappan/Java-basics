package level2;

import java.util.Scanner;

public class vowelconsonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("it's a vowel");
                break;
            default:
                System.out.println("it's a consonent");
        }
    }
}
