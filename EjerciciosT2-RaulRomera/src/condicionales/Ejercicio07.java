package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora, minuto, segundo, valor = 0;
		
		System.out.println("Dime el valor de la hora: ");
		hora = sc.nextInt();
		System.out.println("Dime el valor de los minutos: ");
		minuto = sc.nextInt();
		System.out.println("Dime el valor de los segundos: ");
		segundo = sc.nextInt();
		
		if(hora <= 23 && hora >= 0 && minuto >= 0 && segundo >= 0 && minuto < 60 && segundo < 60) {
			if(segundo >= 59) {
				segundo = 0;
				minuto += 1;
				if(minuto >= 60) {
					minuto = 0;
					hora += 1;
					if(hora >= 24) {
						hora = 0;
					}
				}
			}
		}else {
			System.err.println("ERROR");
		}
		
		System.out.println(hora + " : " + minuto + " : " + valor);
		sc.close();
	}
}
