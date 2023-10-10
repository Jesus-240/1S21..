public class P2p5_1S21{
	public static void main(String[] args) {
		int a=1;
		while(a<10){
			System.out.println("Estamos repetiendonos dentro del ciclo while");
			a++;
		}

		a=10;
		while(a<10){
			System.out.println("Que pasa con esta instruccion");
		}

		a=1;
		while(true){
			System.out.println("aqui controlamos el controlador de forma natural");
			System.out.println("y generamos un if para que la condicion decida");
			System.out.println("cuando terminar la repeticion");
			if (a>10) break;
			a++;
		}

		a=1;
		while(false){
			System.out.println("cual es la justificacion para no ejecutarse");
		}
	}
}