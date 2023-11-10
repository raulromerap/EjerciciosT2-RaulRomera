package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

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
