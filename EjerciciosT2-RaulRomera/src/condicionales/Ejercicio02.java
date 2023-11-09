package condicionales;

import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 1234678 | ESPERA: Z | OBTENIDO: A su DNI le pertenece la letra: Z
	 * ENTRADA: 0010004 | ESPERA: ERROR | OBTENIDO: ERROR 
	 * ENTRADA: 10000000 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 65489561 | ESPERA: M | OBTENIDO: A su DNI le pertenece la letra: M
	 * ENTRADA: 0441171 | ESPERA: ERROR | OBTENIDO: ERROR
	 */

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		//Gestión de variables
		
		//Creacion de la variable del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables para el número del DNI y el módulo que pertence el usuario
		int dni, modulo;
		
		//Creacion de la variable para la letra del DNI
		String letra = null;
		
		//Gestion de instrucciones
		
		//Impresion del mensaje para que el usuario introduzca su DNI
		System.out.print("Introduzca su DNI: ");
		//Escaneo y guardado del numero del DNI
		dni = sc.nextInt();
		//Calculo del modulo que pertenece el usuario
		modulo = dni%23;
		
		//Condicional para saber si el numero está en el rango indicado
		if(dni <99999999 && dni>11111111) {
			switch(modulo){ //Condicional que calcula la letra del DNI
				case 0 ->{
					letra = "T";
				}
				case 1 ->{
					letra = "R";
				}
				case 2 ->{
					letra = "W";
				}
				case 3 ->{
					letra = "A";
				}
				case 4 ->{
					letra = "G";
				}
				case 5 ->{
					letra = "M";
				}
				case 6 ->{
					letra = "Y";
				}
				case 7 ->{
					letra = "F";
				}
				case 8 ->{
					letra = "P";
				}
				case 9 ->{
					letra = "D";
				}
				case 10 ->{
					letra = "X";
				}
				case 11 ->{
					letra = "B";
				}
				case 12 ->{
					letra = "N";
				}
				case 13 ->{
					letra = "J";
				}
				case 14 ->{
					letra = "Z";
				}
				case 15 ->{
					letra = "S";
				}
				case 16 ->{
					letra = "Q";
				}
				case 17 ->{
					letra = "V";
				}
				case 18 ->{
					letra = "H";
				}
				case 19 ->{
					letra = "L";
				}
				case 20 ->{
					letra = "C";
				}
				case 21 ->{
					letra = "K";
				}
				case 22 ->{
					letra = "E";
				}
			}
			
			//Una vez hecho el calulo se introduce el mensaje correspondiente para saber su letra
			System.out.println("A su DNI le pertenece la letra: " + letra);
		}else { //Si el numero introducido está fuera del rango, se imprime un mensaje de error
			System.err.println("ERROR");
		}
		
		//Cierre del escaner
		sc.close();
	}
}
