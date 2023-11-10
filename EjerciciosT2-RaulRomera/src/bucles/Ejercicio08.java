package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
	/* Casos de prueba
	 * ENTRADA: Dime un numero inicial: -as 		| OBTENIDO: Dime un numero inicial: -as 
				Tipo de valor incorrecto						Tipo de valor incorrecto
				Dime un numero inicial: -5						Dime un numero inicial: -5	
				Dime un número: 2								Dime un número: 2
				Dime un número: 1								Dime un número: 1
				Fallo, es menor									Fallo, es menor
				Dime un número: 65								Dime un número: 65
				Dime un número: 42								Dime un número: 42
				Fallo, es menor									Fallo, es menor
				Dime un número: 0								Dime un número: 0
				Total de números introducidos: 5				Total de números introducidos: 5
				Numeros fallados: 2 							Numeros fallados: 2
	 */
public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables del numero del usuario, un numero auxiliarm, el contador de numeros y el contador de fallos
		int n = 0, aux, cont = 0, contF = 0;
		
		do {
			try {
				//Mensaje para que el usuario introduzca un número
				System.out.print("Dime un numero inicial: ");
				//Escaneo y guardado del valor del numero
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while (n==0);
		//Se crea un bucle en el cual se contará los numeros, los fallos y le preguntará una y otra vez por otro numero, en caso que ponga 0 se saldrá del bucle
		do {
			
			cont++;
			aux = n;
			try {
			System.out.print("Dime un número: ");
			n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
				cont--;
			}
			if(n<aux && (n>0 || n<0)) {
				System.out.println("Fallo, es menor");
				contF++;
			}
		}while(n>0||n<0);
		
		//Si el numero es igual a 0 se manda los mensajes finales
		if(n==0) {
		System.out.println("Total de números introducidos: " + cont);
		System.out.println("Numeros fallados: " + contF);
		}
		//Cierre del escaner
		sc.close();
	}

}
