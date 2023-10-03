import java.util.Scanner;

public class examen_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor de la resistencia (0 - 1000 Ω): ");
        double resistencia = input.nextDouble();
        System.out.print("Ingrese el valor de la intensidad: ");
        double intensidad = input.nextDouble();

        if (resistencia < 0) {
            System.out.println("Error: El valor de la resistencia no puede ser negativo.");
        } else if (resistencia > 1000) {
            System.out.println("Error: El valor de la resistencia es mayor que 1000 Ω.");
        } else {
            double caidaPotencial = intensidad * resistencia;
            
            System.out.println("La caída de potencial es: " + caidaPotencial + " V");
        }

        input.close();
    }
}
