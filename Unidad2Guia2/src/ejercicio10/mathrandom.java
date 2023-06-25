package ejercicio10;
import java.util.Scanner;
public class mathrandom {
	public static void calc(int adivi,int n,int n1) {
		Scanner Scan = new Scanner(System.in);
		System.out.println(n*n1);
		if (adivi==n*n1) {
			System.out.println("ACERTASTE!!!");
		}else {
			System.out.println("ERRASTE INTENTA OTRA VEZ");
			adivi=Scan.nextInt();
			mathrandom.calc(adivi, n, n1);
				
			}
		Scan.close();
		}

	
}

