public class DiezNumerosPrimos {
	public static void main(String [] args) {
	 int contador =0; 
	 int numero= 2;

	 while(contador<10){
	 if (esPrimo(numero)){
	 System.out.print(numero + ",");
	 contador++;
	 }
	 numero++;
	 }
	}

	public static boolean esPrimo(int num){
	 if(num<=1){
	 return false;
	 }
	 for(int a=2; a<=Math.sqrt(num);a++){
	 if (num% a==0){
	 return false;
	 }
	 }
	 return true;

	}
}