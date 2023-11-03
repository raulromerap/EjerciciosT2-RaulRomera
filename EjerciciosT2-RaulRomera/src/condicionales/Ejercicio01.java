package condicionales;

import java.util.Scanner;

	//Caso de prueba
	//numero = 121 |Espera:"Es capicúa"

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, unidad = 0, decena = 0, centena = 0, mil=0;
		
		System.out.print("Introduce un número entre 0 y 9999: ");
		num = sc.nextInt();
		if (num>0 && num<10){
			System.out.println("Es capicúa");
		}else if (num>9 && num<100) {
			unidad = num%10;
			decena = num/10;
			if(unidad == decena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		}else if (num>99 && num<1000) {
			unidad = num%10;
			centena = num/100;
			if(unidad == centena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
		}else if (num>999 && num<=9999) {
			unidad = num%10;
			decena = (num/10)%10;
			centena = (num/100)%10;
			mil = num/1000;
			if(unidad == mil && decena == centena) {
				System.out.println("Es capicúa");
			}else {
				System.out.println("No es capicúa");
			}
				
		}else {
			System.err.println("ERROR");
		}
		sc.close();
	}
}

