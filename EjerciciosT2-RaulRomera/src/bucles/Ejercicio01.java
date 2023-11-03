package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora, minuto, segundo, incremento;
		
		System.out.println("Inserte el valor de las horas: ");
		hora = sc.nextInt();
		System.out.println("Inserte el valor de los minutos: ");
		minuto = sc.nextInt();
		System.out.println("Inserte el valor de los segundos: ");
		segundo = sc.nextInt();
		System.out.println("Inserte el valor que quiere incrementar los segundos: ");
		incremento = sc.nextInt();
		
		if(hora <= 23 && hora >= 0 && minuto >= 0 && segundo >= 0 && minuto < 60 && segundo < 60) {
			for(int cont = 0; cont < incremento; cont++) {
				segundo++;
				if(segundo >= 59) {
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
