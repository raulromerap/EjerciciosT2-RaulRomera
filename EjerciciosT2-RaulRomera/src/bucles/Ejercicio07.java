package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 4 | ESPERA: 1    	| OBTENIDO: El MCD de los numeros es: 	1
							121												121
							12321											12321
							1234321 										1234321
							
	 * ENTRADA: -1 | ESPERA: Introduce el valor de la figura: | OBTENIDO: Introduce el valor de la figura: 
	 * ENTRADA: 10 | ESPERA: 1  					| OBTENIDO: 1
							 121								121
							 12321								12321
							 1234321							1234321
							 123454321							123454321
							 12345654321						12345654321
							 1234567654321						1234567654321
							 123456787654321					123456787654321
							 12345678987654321					12345678987654321
							 12345678910987654321 				12345678910987654321
							 
	 * ENTRADA: 2 | ESPERA: 1 	| OBTENIDO: 1
	  						121			  	121
	
	 * ENTRADA: p | ESPERA: Error | OBTENIDO: Tipo de valor incorrecto
	 */

public class Ejercicio07 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de la variable del numero del usuario
		int n = -1;
		
		do {
			try {
				//Impresion del mensaje para que el usuario introduzca el numero
				System.out.print("Introduce el valor de la figura: ");
				//Escaneo y guardado del valor del numero del usuario
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while(n<0);
		
		//Se crea un bucle el cual le dará la altura al triangulo
		for (int i = 1; i <= n; i++) {
			//Se crea un bucle el cual pondrá los numeros correspondientes a cada fila
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            //Se crea un bucle el cual pondrá los numeros al reves cuando termine los crecientes
            for (int k = i - 1; k >= 1; k--)
                System.out.print(k);
            System.out.println();
		}
		//Cierre del escaner
		sc.close();
	}

}
