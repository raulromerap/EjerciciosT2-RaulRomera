package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, aux, cont = 0, contF = 0;
		
		System.out.print("Dime un numero inicial: ");
		n = sc.nextInt();
		
		do {
			
			cont++;
			aux = n;
			System.out.print("Dime un número: ");
			n = sc.nextInt();
			
			if(n<aux && n>0) {
				System.out.println("Fallo, es menor");
				contF++;
			}
		}while(n>0);
		
		System.out.println("Total de números introducidos: " + cont);
		System.out.println("Numeros fallados: " + contF);
		sc.close();
	}

}
