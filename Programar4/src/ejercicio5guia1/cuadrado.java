package ejercicio5guia1;

public class cuadrado {
	
	private int i;
	private int j;
	
	
	public cuadrado(int i,int j) {
		this.i=i;
		this.j=j;
	}
	public cuadrado() {
		
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public static void grafico(int i,int j,int tamaño) {
		for (i=1;i<=tamaño;i++) {
			
			for (j=1;j<=tamaño;j++) {
				
				if (i==1||i==tamaño) {
					System.out.print("* ");
				}else if(j==1||j==tamaño) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
	}
}
