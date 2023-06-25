package ejercicio8guia1;

public class sacarabsoluto {
	private int n;
	
	public sacarabsoluto() {}
	
	public sacarabsoluto(int n) {
		this.n=n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public static void Absoluto(int n,int aux) {
		if (n>=0) {
			System.out.println("El valor absoluto de: "+n+" es :"+n);
		}else {
			aux=n-+n*2;//mira esto funciona asi: (-n)-(+(-n*2)
			
			System.out.println("El valor absoluto de: "+n+" es :"+aux);
		}
	}
}
