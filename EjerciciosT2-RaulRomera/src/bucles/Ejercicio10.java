package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

//Caso de prueba

	/* Casos de prueba
	 * ENTRADA: 202 | ESPERA: Capicúa | OBTENIDO: Es capicúa
	 * ENTRADA: -5236 | ESPERA: ERROR | OBTENIDO: ERROR 
	 * ENTRADA: 10000 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 5201 | ESPERA: No es capicúa | OBTENIDO: No es capicúa
	 * ENTRADA: 2 | ESPERA: Es capicúa | OBTENIDO: Es capicúa
	 */

public class Ejercicio10 {

	public static void main(String[] args) {
		
		
		//Gestion de variables
		
		//Variable del Scanner
		Scanner sc = new Scanner(System.in);
		//Variable del número del usuario
		int num = -1, aux, cifra, inverso = 0;
		
		
		//Gestión de desarrollo
		
		do {
			try {
		//Introduccion del mensaje para insertar el numero del usuario
		System.out.print("Introduce un número entre 0 y 9999: ");
		//Escaneo del numero insertado para darle valor a la variable num
		num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Tipo de valor incorrecto");
				sc.nextLine();
			}
		}while(num<0||num>9999);
		
		//Operacion para darle la vuelta al número
		//Igualacion del auxiliar y el número del usuario
		aux = num;
		//Se empieza a crear el número inverso solo si el rango de número es el que se pide
		if(num >=0 && num <= 9999) {
			//Empezamos el bucle para calcular el inverso
			while(aux!=0) {
				//Hacemos un módulo para ir quitando cifras al número
				cifra = aux % 10;
				//Guardamos el número en inverso uno a uno
				inverso = inverso * 10 + cifra;
				//Y por ultimo se quita un número al auxiliar para seguir el bucle
				aux = aux / 10;
			}
		
			//Condicional para el resultado
			if(num == inverso) { //Si el numero es igual al numero inverso se envia mensaje
				//Mensaje que es capicua
				System.out.println("Es capicúa");
			}else { //Si nada de lo anterior es cierto se envia mensaje
				//Mensaje que no es capicua
				System.out.println("No es capicúa");
			}
		}else { //Si el rango no es el solicitado manda mensaje de error
			//Mensaje de error
			System.err.println("ERROR");
		}
		
		//Cierre del Scanner
		sc.close();
	}
}
