package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Introduzca un número: ");
		a = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		b = sc.nextInt();
		
		while(a != b) {
			if(a > b)
				a = a - b;
			else
				b = b - a;
		}
		System.out.println("El MCD de los numeros es: " + a);
		
		sc.close();
	}
}
