package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 4 | ESPERA: 1    | OBTENIDO: El MCD de los numeros es: 	1
							22											22
							333											333
							4444 										4444
							
	 * ENTRADA: -1 | ESPERA: Introduce el valor de la figura: | OBTENIDO: Introduce el valor de la figura: 
	 * ENTRADA: 10 | ESPERA: 1  					| OBTENIDO: 1
							 22									22
							 333								333
							 4444								4444
							 55555								55555
							 666666								666666
							 7777777							7777777
							 88888888							88888888
							 999999999							999999999
							 10101010101010101010 				10101010101010101010 
							 
	 * ENTRADA: 2 | ESPERA: 1 | OBTENIDO: 1
	  						22			  22

	 * ENTRADA: p | ESPERA: Error | OBTENIDO: Tipo de valor incorrecto
	 */

public class Ejercicio06 {

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
		}while(n<0||n>20);
	    
		//Condicion para saber si el numero está en el rango indicado
	    if(n>=0 && n<=20) {
	    	//Se crea un bucle el cual le dará la altura al triangulo
		    for(int i=1;i<=n;i++){
		    	//Se crea un bucle el cual pondrá los numeros correspondientes a cada fila
		    	for(int j=1;j<=i;j++){
		    		System.out.print(i);
		        }
		        System.out.println();
		    }
	    }
	    //Cierre del escaner
	    sc.close();
		
	}

}
