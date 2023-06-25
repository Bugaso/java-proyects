package pruebasdeljava;
/*
 * 4. Los profesores del curso de programación de Egg necesitan llevar un registro
 *  de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
 *   Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
 *    Las ponderaciones de cada nota son:
 *     Primer trabajo práctico evaluativo 10% Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo integrador 50% 
 *      Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 *       Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
 *        teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso
*/
import java.util.Scanner;
public class ejerciciorandom1{
	
public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	
		System.out.println("Ingrese la cantidad de alumnos");
		int miVector []= new int [scan.nextInt()];
		int apro= 0;
		int des = 0;
		for (int i=0;i<miVector.length;i++) {
		System.out.println("Ingrese las notas de los trabajos practicos");
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		System.out.println("Ingrese las notas de los 2 parciales");
		int par1 = scan.nextInt();
		int par2 = scan.nextInt();
		
		double porc = sumar(nota1,nota2,par1,par2);
		System.out.println(porc);
			if (porc>=7) {
				apro= apro+1;
				
			}else {
				des = des+1;
			}
				
			}
		
					
		System.out.println("La cantidad de aprobados es: "+apro+"\nLa cantidad de desaprobados es: "+des);
		
}
	   public static double sumar(int nota1, int nota2,int par1,int par2) {
		      double porc = nota1*0.10+nota2*0.15+par1*0.25+par2*0.50;   
			return porc;
			
		   }
	   
	 
	}

