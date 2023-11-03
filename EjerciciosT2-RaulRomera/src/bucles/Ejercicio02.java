package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Variable
		//Creacion del scanner
		Scanner sc = new Scanner(System.in);
		//Creacion de las variables del numero del usuario y del contador
		int num, cont = 0;
				
		//Mensaje para insertar el numero
		System.out.print("Introduzca un números: ");
		//Scan del numero del usuario
		num = sc.nextInt();
				
		//Bucle para empezar a sumar cifras al contador para saber si es primo o no primo
		for(int n = 2; n<num; n++ ) {
			//Condicional para incrementar el contador
			if(num%n==0) {
				//Incrementa el contador
				cont++;
			}
		}
		//Condicional para saber cuando es primo y no
		if(cont > 0 || num == 1) { //Si el contador es mayor a 0 o igual a 1 manda mensaje
			//Mensaje para el decir que el numero es primo
			System.out.println("No es primo");
		}else { //sino manda este otro mensaje
			//Mensaje para el decir que el numero no es primo
			System.out.println("Es primo");
		}
		//Cierre del Scanner
		sc.close();
	}
}
