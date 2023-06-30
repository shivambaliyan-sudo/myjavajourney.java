import java.util.Scanner;
public class swtch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write age \"18,20,30,40\"");
        int age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("when you are 18 you are  a adult ");
                break;
            case 20 :
                System.out.println("you are now in clg");
                break;
            case 30 :
                System.out.println("you are in job");
                break;
            case 40:
                System.out.println("you have to retire");
                break;
            default:
                System.out.println("you have to be something");
                break;
        }
    }
}
