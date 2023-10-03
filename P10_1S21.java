import java.util.Scanner;

public class P10_1S21{
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la opcion [a,b,c,d,e] ");
		String opc= "a";
		opc=teclado.nextLine();
		switch(opc){
	case"a":
		System.out.println("aqui el caso a");
		break;
	case"b":
		System.out.println("aqui el caso b");
		break;
	case"c":
		System.out.println("aqui el caso c");
		break;
	case"d":
		System.out.println("aqui el caso d");
		break;
	case"e":
		System.out.println("aqui el caso e");
		break;
	default:
		System.out.println("No se encuentra esa opcion");
	  }

	}
}