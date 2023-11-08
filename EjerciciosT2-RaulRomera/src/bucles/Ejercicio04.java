package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, menor = 0;
		
		System.out.print("Introduzca un número: ");
		a = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		b = sc.nextInt();
		
		if(a>0&&b>0) {
			
			if(a>b) {
				menor=a;
			}else {
				menor=b;
			}
			
			while(a%menor!=0 || b%menor!=0) {
				menor--;
			}
			
			System.out.println("El MCD de los numeros es: " + menor);
			
		}else {
			System.err.println("ERROR");
		}
		
		sc.close();
	}
}
