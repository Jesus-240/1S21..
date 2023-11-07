import java.util.Scanner;
public class examen_2p{
	public static void main(String[] args) {
		
		int [] val = new int [100];
		
		Scanner teclado= new Scanner(System.in);
		int n,s,p,m,d,x,a;

		System.out.println("Ingresa la cantidad de datos");
		n = teclado.nextInt();

		

		for(s= 1; s<=n; s++){
			System.out.println("Ingresa el valor " + s +": ");
			val[s] = teclado.nextInt();
		}
		p=0;
		for(int i = 0;i<=n; i++){
			p+=val[i];
		}
		m=p/n;
		x=0;
		for(int r = 1; r<=n; r++){
			d=Math.abs(val[r]-m);
			x+=d;

		}
		a=x/n;
		System.out.println("La desviacion media es: " + a);

	}
}