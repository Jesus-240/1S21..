import java.util.Scanner;
import java.lang.Math;
public class examen_5{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		System.out.println("Calcular el area del triangulo");
		System.out.println("   *");
		System.out.println("   * *");
		System.out.println(" a *   * b");
		System.out.println("   *  s *");
		System.out.println("   *      *");
		System.out.println("   * * * * * *");

		System.out.println("         c");
		int a;
		int b;
		int c;
		int d;
		int area;
		double resultado;
		System.out.println("introduce el valor de a :");
		a = teclado.nextInt();
		System.out.println("introduce el valor de b :");
		b = teclado.nextInt();
		System.out.println("introduce el valor de c :");
		c = teclado.nextInt();
		d = (a+b+c)/2;
		area = d*(d-a)*(d-b)*(d-c);
		resultado = Math.sqrt(area);
		System.out.println("el area del triangulo es: " + resultado);

	}
}