package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dias;
		double distancia, precioF, precioR;
		final double REDUCCION = 70/100, PRECIOKM = 2.5;
		
		System.out.print("¿Cuantos días va a quedarse?\n-");
		dias = sc.nextInt();
		System.out.print("¿Cuantos kilometros vas a recorrer?\n-");
		distancia = sc.nextDouble();
		
		precioF = distancia * PRECIOKM;
		
		if(dias >= 7 && distancia >= 800) {
			precioR = precioF * REDUCCION;
			System.out.println("El precio con el descuento es: " + precioR + "€");
		}else{
			System.out.println("El precio total es: " + precioF + "€");
		}
		sc.close();
	}

}
