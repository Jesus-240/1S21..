import java.util.Scanner;
import java.lang.Math;
public class examen_6{
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int x;
		int y;
		int a;
		int b;
		int c;
		int resultado;
		double distancia;
		double raizAB;
		System.out.println("calcular el valor de las distancia entre 2 puntos ");
		System.out.println("introdusca las cordenadas del punto X: ");
		x = teclado.nextInt();
		System.out.println("introdusca las cordenadas del punto Y: ");
		y = teclado.nextInt();
		System.out.println("introdusca el valor A: ");
		a = teclado.nextInt();
		System.out.println("introdusca el valor B: ");
		b = teclado.nextInt();
		System.out.println("introdusca el valor de C: ");
		c = teclado.nextInt();
		resultado = Math.abs(a*x + b*y + c);
		raizAB = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		System.out.println("el valor de la distancia es: " + resultado);
	}
}