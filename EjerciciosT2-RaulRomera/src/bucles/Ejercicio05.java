package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, mayor = 0 ;
		
		System.out.print("Introduce un número: ");
		a = sc.nextInt();
		System.out.print("Introduce otro número: ");
		b = sc.nextInt();
		
		if(a>0&&b>0) {
			
			if(a>b) {
				mayor=a;
			}else {
				mayor=b;
			}
			
			while(mayor%a!=0 || mayor%b!=0) {
				mayor++;
			}
			
			System.out.println("El MCM de los dos números es: " + mayor);
			
		}else {
			System.err.println("ERROR");
		}
		
		sc.close();
	}

}
