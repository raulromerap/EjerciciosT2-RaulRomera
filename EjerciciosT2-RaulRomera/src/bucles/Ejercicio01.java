package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 23:59:40 INCREMENTA: 100 | ESPERA: 00:01:20 | OBTENIDO: 0:1:20
	 * ENTRADA: 14:20:59 INCREMENTA: 1 | ESPERA: 14:21:00 | OBTENIDO: 14:21:0
	 * ENTRADA: 25:19:21 INCREMENTA: 2 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 01:62:00 INCREMENTA: 50 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 02:30:01 INCREMENTA: -2 | ESPERA: ERROR | OBTENIDO: ERROR
	 */

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables para las horas, los minutos, los segundos y los segundos que quiere sumar
		int hora=-1, minuto=-1, segundo=-1, incremento=-1;
		
		//Gestion de instrucciones
		
		do {
			try {
				//Introduccion del mensaje para introducir el valor de las horas
				System.out.print("Inserte el valor de las horas: ");
				//Escaneo del valor para la variable de las horas
				hora = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("El tipo de valor no es correcto");
				sc.nextLine();
			}
		}while(hora<0||hora>23);
		do {
			try {
				//Introduccion del mensaje para introducir el valor de los minutos
				System.out.print("Inserte el valor de los minutos: ");
				//Escaneo del valor para la variable de los minutos
				minuto = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("El tipo de valor no es correcto");
				sc.nextLine();
			}
		}while(minuto<0||minuto>59);
		do {
			try {
				//Introduccion del mensaje para introducir el valor los segundos
				System.out.print("Inserte el valor de los segundos: ");
				//Escaneo del valor para la variable de los segundos
				segundo = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("El tipo de valor no es correcto");
				sc.nextLine();
			}
		}while(segundo<0||segundo>59);
		do {
			try {
				//Introduccion del mensaje para introducir el valor los segundos que quiere sumar
				System.out.print("Inserte el valor que quiere incrementar los segundos: ");
				//Escaneo del valor para la variable de los segundos incrementados
				incremento = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("El tipo de valor no es correcto");
				sc.nextLine();
			}
		}while(incremento<0);
		
		//Condicion para saber si los valores estan en el rango indicado
		if(hora <= 23 && hora >= 0 && minuto >= 0 && segundo >= 0 && minuto < 60 && segundo < 60 && incremento > 0) {
			//Bucle para empezar a contar segundo por segundo hasta el valor que ha introducido el usuario
			for(int cont = 0; cont < incremento; cont++) {
				segundo++;
				//Si los segundos llegan a 60 se vuelve a 0 y a los minutos se les suma 1
				if(segundo >= 60) {
					segundo = 0;
					minuto += 1;
				//Si los minutos llegan a 60 se vuelve a 0 y a las horas se les suma 1
				}if(minuto >= 60) {
					minuto = 0;
					hora += 1;
				//Si los segundos llegan a 24 se vuelve a 0
				}if(hora >= 24) {
					hora = 0;}
			}
		}else { //Si el valor no está en el rango se le muestra mensaje de error
			System.err.println("ERROR");
		}
		
		//Impresion de mensaje para mostrar el valor final
		System.out.println(hora + " : " + minuto + " : " + segundo);
		//Cierre del escaner
		sc.close();
	}

}
