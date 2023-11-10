package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: -546 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 5 | ESPERA: 1 Digitos | OBTENIDO: El número 5 contiene 1 digitos
	 * ENTRADA: 10 | ESPERA: 2 Digitos | OBTENIDO: El número 10 contiene 2 digitos
	 * ENTRADA: 1515 | ESPERA: 4 Digitos | OBTENIDO: El número 1515 contiene 4 digitos
	 * ENTRADA: M | ESPERA: Error | OBTENIDO: Tipo de valor incorrecto
	 */

public class Ejercicio09 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables del numero del usuario, el suxiliar y el contador
		int n = 0, aux, cont = 0;
		
		do {
			try {
				//Impresion del mensaje para que el usuario introduzca el primer numero
				System.out.print("Introduzca un número: ");
				//Escaneo y guardado del valor obtenido por el usuario
				n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while(n==0);
		//Se iguala el auxiliar al numero del usuario
		aux = n;
		
		//Condicional para saber si el numero está dentro del rango
		if(n>0) {
			//Hace una y otra vez el calculo de auxiliar entre diez para quitarle el ultimo numero al int, cada vez que lo hace suma el contador 1 hasta que llega a 0
			do {
				aux = aux/10;
				cont++;
				
			}while(aux>=1);
			//Se envia el mensaje final
			System.out.println("El número " + n + " contiene " + cont + " digitos");
		}else { //Si no está en el rango se manda mensaje de error
			System.err.println("ERROR");
		}
		//Cierre del escaner
		sc.close();
	}

}
