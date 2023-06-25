package ejercicio8guia1;

public class calculo {
	private int n;
	
	public calculo() {}
	
	public calculo(int n) {
		this.n=n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public static boolean esPrimo(int n) {
		
		if (n<=1) {
			return false;
		}
		
		 for (int i = 2; i < Math.sqrt(n); i++) {
		        if (n % i == 0) {
		            return false;
		        }
		    }
		 
		return true;
		
		
		
	}
}
