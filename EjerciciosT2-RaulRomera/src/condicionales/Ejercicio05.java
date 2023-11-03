package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, valorAbs;
		
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		valorAbs = (num < 0) ? num * -1 : num;
		
		System.out.println(valorAbs);
		
		sc.close();
		
		
	}

}
