import java.util.Scanner;
public class prctce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st sub marks");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd sub marks");
        int b = sc.nextInt();
        System.out.println("Enter you 3rd sub marks");
        int c = sc.nextInt();

        int d = (a + b + c);
        float z = d;
        float e = z / 300;
        float f = e * 100;


        if (f > 39 && a > 32 && b > 32 && c > 32) {
            System.out.println("you passed");

        }
        else{
                System.out.println(" you failed");

        }
        System.out.println("your total percentage is "+f+"%");
    }
}
