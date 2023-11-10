package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner (System.in);
		
		//Creacion de las variables para el primer y segundo numero y el numero mayor de los dos
		int a = 0, b = 0, mayor = 0 ;
		
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
		
		//Condicion para saber cual es el mayor y calcular el MCM
		if(a>0&&b>0) {
			//Si el primer numero es mayor al segundo se le aplica el valor de este a la variable mayor
			if(a>b) {
				mayor=a;
			}else {//En caso de que el segundo sea el mayor se le aplicará el valor de este otro
				mayor=b;
			}
			//Bucle para calcular cuando es divisible al mismo tiempo el mayor por los divores a y b, incrementando mayor uno a uno
			while(mayor%a!=0 || mayor%b!=0) {
				mayor++;
			}
			//Imoresion del mensaje final
			System.out.println("El MCM de los dos números es: " + mayor);
			
		}else { //Si la condicion no es correcta se le aplica un mensaje de error
			System.err.println("ERROR");
		}
		//Cierre del escaner
		sc.close();
	}

}
