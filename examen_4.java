import java.util.Scanner;

public class examen_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = input.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double longitudCircunferencia = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);

        input.close();
    }
}
