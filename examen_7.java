import java.util.Scanner;

public class examen_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = input.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = input.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = input.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        double d = input.nextDouble();
        System.out.print("Ingrese el valor de e: ");
        double e = input.nextDouble();
        System.out.print("Ingrese el valor de f: ");
        double f = input.nextDouble();
        double divisor = a * e - b * d;

        if (divisor == 0) {
            System.out.println("El sistema de ecuaciones no tiene solución, ya que el divisor es igual a cero.");
        } else {
      
            double x = (c * e - b * f) / divisor;
            double y = (a * f - c * d) / divisor;

            System.out.println("La solución del sistema de ecuaciones es:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        input.close();
    }
}
