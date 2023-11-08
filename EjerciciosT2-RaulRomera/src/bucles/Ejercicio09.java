package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, aux, cont = 0;
		
		System.out.print("Introduzca un número: ");
		n = sc.nextInt();
		
		aux = n;
		
		if(n>0||n<0) {
			do {
				aux = aux/10;
				cont++;
				
			}while(aux>=1|| aux <= -1);
		}
		System.out.println("El número " + n + " contiene " + cont + " digitos");
		sc.close();
	}

}
