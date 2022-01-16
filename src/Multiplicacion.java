import java.util.Scanner;

public class Multiplicacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla a realizar");

        int num = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
