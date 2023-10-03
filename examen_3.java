import java.util.Scanner;

public class exam_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        final double PI = 3.1416;

        System.out.print("Ingresa el radio de tu esfera: ");
        double radio = scanner.nextDouble();

        double volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera con radio seleccionada " + radio + " es: " + volumen);

        scanner.close();
    }
}
