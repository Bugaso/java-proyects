package ejercicio5guia1;

import java.util.Scanner;

public class elMayorEs {
	private int n;
	private int aux;
	
	public elMayorEs() {}
	
	public elMayorEs(int n, int aux) {
		this.n=n;
		this.aux=aux;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getAux() {
		return aux;
	}

	public void setAux(int aux) {
		this.aux = aux;
	}
	
	public static void detector(int n,int i,int aux,int cv) {
		Scanner Scanner = new Scanner(System.in);
		for(i=1;i<=3;i++) {
			n=Scanner.nextInt();
			
			
				if(i==1) {
					aux=n;
				}else if(aux<n) {
					aux=n;
				}else if(aux==n){
					cv++;
				}if (cv==2) {
					System.out.println("Todos los numeros ingresados son iguales.");
				}
					
				
			
			}
		if (cv<2) {
			System.out.println("El numero mayor ingresado es: "+aux);
		}
	}
}
