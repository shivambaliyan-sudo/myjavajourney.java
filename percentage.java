import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter out of marks");

        float z = sc.nextFloat();

        System.out.println("enter 1st subject marks");
        float a = sc.nextFloat();

        System.out.println(" enter 2nd sub marks");
        float b = sc.nextFloat();

        System.out.println("enter 3rd sub marks");
        float c = sc.nextFloat();

        System.out.println("enter 4th sub marks");
        float d = sc.nextFloat();

        System.out.println("enter 5th sub marks");
        float e = sc.nextFloat();

        float h = ((a+b+c+d+e)/z)*100;

        System.out.print(h);

        System.out.print("%");


    }


}
