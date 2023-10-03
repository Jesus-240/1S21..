import java.util.Scanner;

public class examen_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double PI = 3.1416;

        System.out.print("Ingresa el valor en grados: ");
        double grados = scanner.nextDouble();

        double radianes = grados * (PI / 180);

        System.out.println(grados + " grados equivale a " + radianes + " radianes.");

        scanner.close();
    }
}
