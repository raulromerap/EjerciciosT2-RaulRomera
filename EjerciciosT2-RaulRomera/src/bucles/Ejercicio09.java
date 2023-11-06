package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, aux, cont = 0, div = 10;
		
		System.out.print("Introduzca un número: ");
		n = sc.nextInt();
		
		if(n>0) {
			do {
				aux = n/div;
				cont++;
				div = div * 10;
			}while(aux>=1);
		}else {
			System.err.println("ERROR");
		}
		System.out.println("El número " + n + " contiene " + cont + " digitos");
		sc.close();
	}

}
