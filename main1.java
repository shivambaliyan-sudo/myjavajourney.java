import java.util.Scanner;
public class main1 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("sum of three no.");

        System.out.println("enter 1st no.");
        int a = sc.nextInt();

        System.out.println("enter 2nd no.");
        int b = sc.nextInt();

        System.out.println("enter 3rd no.");
        int c = sc.nextInt();

        int d = a+b+c;

        System.out.println(d);

    }
}