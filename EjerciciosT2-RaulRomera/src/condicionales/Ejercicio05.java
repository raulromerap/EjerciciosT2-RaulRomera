package condicionales;

import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 2 | ESPERA: 2 | OBTENIDO: 2
	 * ENTRADA: -1515 | ESPERA: 1515 | OBTENIDO: 1515 
	 * ENTRADA: 0 | ESPERA: 0 | OBTENIDO: 0
	 * ENTRADA: 198752 | ESPERA: 198752 | OBTENIDO: 198752
	 * ENTRADA: -4 | ESPERA: 4 | OBTENIDO: 4
	 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion de la variable para el escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables para el numero del usuario y para el calculo del valor absoluto
		int num, valorAbs;
		
		//Gestion de instrucciones
		
		//Impresion del mensaje para que el usuario introduzca el numero
		System.out.print("Introduzca un número: ");
		//Escaneo y guardado del valor para el numero
		num = sc.nextInt();
		
		//Calculo y ternario para el valor absoluto, en caso de que el numero sea menor a 0 se multipliará por -1, de lo contrario será el mismo numero
		valorAbs = (num < 0) ? num * -1 : num;
		
		//Impresion del resultado final
		System.out.println(valorAbs);
		
		//Cierre del escaner
		sc.close();
		
		
	}

}
