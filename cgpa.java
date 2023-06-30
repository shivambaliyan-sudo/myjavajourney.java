import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" calculate cgpa");

        System.out.println("enter your grade 1");
        float a = sc.nextFloat();

        System.out.println("enter your grade 2");
        float b = sc.nextFloat();

        System.out.println("enter your 3rd grade");
        float c = sc.nextFloat();

        float d = (a+b+c)/3;
        System.out.print("your cgpa is ");
        System.out.println(d);
    }

}
