package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
	
	/* Casos de prueba
	 * ENTRADA: 9 15 | ESPERA: 3 | OBTENIDO: El MCD de los numeros es: 3
	 * ENTRADA: -1 5 | ESPERA: ERROR | OBTENIDO: ERROR 
	 * ENTRADA: 10 55| ESPERA: 5 | OBTENIDO: El MCD de los numeros es: 5
	 * ENTRADA: 1515 2364 | ESPERA: 3 | OBTENIDO: El MCD de los numeros es: 3
	 * ENTRADA: M  p | ESPERA: Error | OBTENIDO: Tipo de valor incorrecto
	 */

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables para el primer y segundo numero y el numero menor de los dos
		int a = 0, b = 0, menor = 0;
		
		//Gestion de instrucciones
		
		do {
			try {
				//Impresion del mensaje para que el usuario introduzca el primer numero
				System.out.print("Introduzca un número: ");
				//Escaneo y guardado del valor obtenido por el usuario
				a = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while(a<=0);
		do {
			try {
				//Impresion del mensaje para que el usuario introduzca el primer numero
				System.out.print("Introduzca un número: ");
				//Escaneo y guardado del valor obtenido por el usuario
				b = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while(b<=0);
		
		//Condicion para saber cual es el menor y calcular el MCD
		if(a>0&&b>0) {
			//Si el primer numero es menor al segundo se le aplica el valor de este a la variable menor
			if(a<b) {
				menor=a;
			}else {//En caso de que el segundo sea el menor se le aplicará el valor de este otro
				menor=b;
			}
			//Bucle para calcular si es divisible por el numero mas pequeño que se pueda en los dos casos, disminuyendo el valor del divisor hasta encontrar el valor correcto
			while(a%menor!=0 || b%menor!=0) {
				menor--;
			}
			
			//Impresion del mensaje final
			System.out.println("El MCD de los numeros es: " + menor);
			
		}else {//Si la condicion no es correcta se le aplica un mensaje de error
			System.err.println("ERROR");
		}
		//Cierre del escaner
		sc.close();
	}
}
