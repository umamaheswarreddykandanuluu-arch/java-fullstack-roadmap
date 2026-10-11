import java.util.Scanner;
public class Calculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First:");
        int a = sc.nextInt();
        System.out.print("second:");
        int b = sc.nextInt();
        System.out.println("Sum:" + (a+b));
        System.out.println("product:" + (a*b));
        sc.close();
    }
}
