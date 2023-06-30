import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        System.out.println("enter age to check you can drive or not");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a==18) {
            System.out.println("you can drive");
        }
        else {
            System.out.println("you cant drive");
        }


    }
}
