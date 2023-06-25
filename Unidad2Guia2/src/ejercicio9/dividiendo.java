package ejercicio9;

public class dividiendo {
	public static void restas(int n,int n1) {
		int cont = 0;
		int residuo=0;
		while(n>n1) {
			n=n-n1;
			
			cont++;
			residuo=n;
			
			
			
		}
		System.out.println("Resto: "+residuo);
		System.out.println("Cociente(resultado): "+cont);
	}
}
