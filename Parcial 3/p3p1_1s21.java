import java.util.Scanner;
public class p3p1_1s21{
	static Scanner teclado= new Scanner(System.in);
	public static void Suma(){
		System.out.println("Suma de 2 números");
		System.out.println("Ingrese el primer número");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo número");
		int b= teclado.nextInt();
		int c= a+b;
		System.out.println("La suma fue " +c);
	}

	public static void Resta(){
		System.out.println("Resta de 2 números");
		System.out.println("Ingrese el primer número");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo número");
		int b= teclado.nextInt();
		int c= a-b;
		System.out.println("La resta fue " +c);
}

    public static void Multiplicacion(){
		System.out.println("Multiplicacion de 2 números");
		System.out.println("Ingrese el primer número");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo número");
		int b= teclado.nextInt();
		int c= a*b;
		System.out.println("La multiplicacon fue " +c);
}

    public static void Division(){
		System.out.println("Division de 2 números");
		System.out.println("Ingrese el primer número");
		int a= teclado.nextInt();
		System.out.println("Ingrese el segundo número");
		int b= teclado.nextInt();
		int c= a/b;
		System.out.println("La division fue " +c);
}

    public static void menu(){
    	System.out.println("Operaciones basicas");
    	System.out.println("\n A) Suma");
    	System.out.println("B) Resta");
    	System.out.println("C) Multipicacion");
    	System.out.println("D) Division");
    	System.out.println("\n Que opcion deseas");
    	System.out.println("\n S) Salir");
    }

    public static void main(String[] args){
    	menu();
    	String opc=teclado.nextLine();
    	if (opc.equals("A"))Suma();
    	if (opc.equals("B"))Resta();
    	if (opc.equals("C"))Multiplicacion();
    	if (opc.equals("D"))Division();
    }
}