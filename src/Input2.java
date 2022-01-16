import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("num1:");
        int num1 = sc.nextInt();
        System.out.println("num2:");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}
