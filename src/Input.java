import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int num = sc.nextInt();
        System.out.println("Ingrese el numero 2:");
        int num2 = sc.nextInt();

        System.out.println(num * num2);
    }
}
