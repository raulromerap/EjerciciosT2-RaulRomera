package condicionales;

import java.util.Random;
import java.util.Scanner;

	/* Casos de prueba
	 * PREGUNTA: 95 + 70 ENTRADA: 165 | ESPERA: Acierto | OBTENIDO: Acertaste!!!
	 * PREGUNTA: 61 + 82 ENTRADA: 143 | ESPERA: Acierto | OBTENIDO: Acertaste!!!
	 * PREGUNTA: 36 + 3 ENTRADA: 40 | ESPERA: Fallo | OBTENIDO: Fallaste, el resultado es: 39
	 * PREGUNTA: 83 + 42 ENTRADA: 125 | ESPERA: Acierto | OBTENIDO: Acertaste!!!
	 * PREGUNTA: 25 + 73 ENTRADA: 99 | ESPERA: Fallo | OBTENIDO: Fallaste, el resultado es: 98
	 */

public class Ejercicio06 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion de la variable del escaner
		Scanner sc = new Scanner(System.in);
		//Creacion de la variable del numero aleatorio
		Random r = new Random();
		
		//Creacion de las variables para los dos numeros aleatorios, el resultado dado por el usuario y el resultado real
		int num1, num2, resultadoU, resultadoR;
		
		//Gestion de instrucciones
		
		//Creacion del primer numero aleatorio, comprendido entre 1 y 99
		num1 = r.nextInt(1,100);
		//Creacion del segundo numero aleatorio, comprendido entre 1 y 99
		num2 = r.nextInt(1,100);
		
		//Impresion del mensaje para que el usuario ponga la solucion de la suma
		System.out.println("¿Cuál es el resultado de la siguiente suma? " + num1 + " + " + num2);
		//Escaneo y guardado del valor aportado por el usuario
		resultadoU = sc.nextInt();
		
		//Calculo del resultado real
		resultadoR = num1 + num2;
		
		//Condicional para hacer saber al usuario si ha acertado o no
		if(resultadoU == resultadoR) { //En caso de que los resultados sean iguales se manda el mensaje de acierto
			System.out.println("Acertaste!!!");
		}else {//En caso de que no sean iguales se manda el mensaje de fallo y revelacion del resultado real
			System.out.println("Fallaste, el resultado es: " + resultadoR);
		}
		//Cierre del escaner
		sc.close();
		
	}

}
