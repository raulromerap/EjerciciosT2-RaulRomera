package bucles;

import java.util.Scanner;
	/*
	 * ENTRADA: 23:59:40 INCREMENTA: 100 | ESPERA: 00:01:20 | OBTENIDO: 0:1:20
	 * ENTRADA: 14:20:59 INCREMENTA: 1 | ESPERA: 14:21:00 | OBTENIDO: 14:21:0
	 * ENTRADA: 25:19:21 INCREMENTA: 2 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 01:62:00 INCREMENTA: 50 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 02:30:01 INCREMENTA: -2 | ESPERA: ERROR | OBTENIDO: ERROR
	 */
public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Creacion del escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de las variables para las horas, los minutos, los segundos y los segundos que quiere sumar
		int hora, minuto, segundo, incremento;
		
		//Introduccion del mensaje para introducir el valor de las horas
		System.out.print("Inserte el valor de las horas: ");
		//Escaneo del valor para la variable de las horas
		hora = sc.nextInt();
		//Introduccion del mensaje para introducir el valor de los minutos
		System.out.print("Inserte el valor de los minutos: ");
		//Escaneo del valor para la variable de las horas
		minuto = sc.nextInt();
		System.out.print("Inserte el valor de los segundos: ");
		segundo = sc.nextInt();
		System.out.print("Inserte el valor que quiere incrementar los segundos: ");
		incremento = sc.nextInt();
		
		if(hora <= 23 && hora >= 0 && minuto >= 0 && segundo >= 0 && minuto < 60 && segundo < 60 && incremento > 0) {
			for(int cont = 0; cont < incremento; cont++) {
				segundo++;
				if(segundo >= 60) {
					segundo = 0;
					minuto += 1;
				}if(minuto >= 60) {
					minuto = 0;
					hora += 1;
					}if(hora >= 24) {
						hora = 0;}
			}
		}else {
			System.err.println("ERROR");
		}
		
		System.out.println(hora + " : " + minuto + " : " + segundo);
		sc.close();
	}

}
