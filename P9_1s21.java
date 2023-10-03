import java.util.Scanner;

public class P9_1s21{
	public static void main(String[] argas){
		Scanner entrada = new Scanner(System.in);
		String operacion;
		System.out.println("Introduza el primer número");
		int numero1 = entrada.nextInt();
		System.out.println("Introduza el segundo número");
		int numero2 = entrada.nextInt();
		
		int resta = numero1 - numero2;
		
		System.out.println("El resultado de la resta es: " + resta);
	}

}

	
