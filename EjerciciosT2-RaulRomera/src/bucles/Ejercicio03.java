package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
	/* Casos de prueba
	 * ENTRADA: 4 | ESPERA: 	*    	| OBTENIDO: El MCD de los numeros es:	   *
							   * *											 	  * * 
							  * * * 											 * * * 
							 * * * * 											* * * * 
							
	 * ENTRADA: -1 | ESPERA: Introduce el valor de la pirámide: | OBTENIDO: Introduce el valor de la pirámide: 
	 * ENTRADA: 10 | ESPERA: 			*  			| OBTENIDO: 			*
	 								   * *								   * *
	 								  * * * 							  * * *
							 		 * * * * 							 * * * * 
							 		* * * * *							* * * * *
							 	   * * * * * *						   * * * * * *
							 	  * * * * * * * 					  * * * * * * *
							 	 * * * * * * * *					 * * * * * * * *
							 	* * * * * * * * *					* * * * * * * * *
							   * * * * * * * * * * 				   * * * * * * * * * *
							 					
							  				
							 
	 * ENTRADA: 2 | ESPERA:  * 	| OBTENIDO:  *
	  						* *			  	* *
	
	 * ENTRADA: p | ESPERA: Error | OBTENIDO: Tipo de valor incorrecto
	 */
public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
	    
		//Creacion de la variable del numero del usuario
		int n = -1;
	    
		//Gestion de instrucciones
		
		do {
			try {
				//Impresion del mensaje par que el usuario introduzca el valor que desea darle a la pirámide
			    System.out.print("Introduzca el valor de la pirámide: ");
			    //Escaneo y guardado del valor del numero
			    n = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El tipo de valor es incorrecto");
				sc.nextLine();
			}
		}while(n<0);
		
	    //Bucle para ir fila por fila de la piramide
	    for(int i=1;i<=n;i++){
	    	//Bucle para hacer los espacios entre el borde de la pantalla y la piramide
	    	for(int espacio = 1; espacio <= n - i; ++espacio) {
	    		System.out.print(" ");
	    	}
	    	//Bucle para insertar los asteriscos
	    	for(int j=1;j<=i;j++){
	    		System.out.print("* ");
	        }
	        System.out.println();
	    }
	    //Cierre de escaner
	    sc.close();
	}

}
