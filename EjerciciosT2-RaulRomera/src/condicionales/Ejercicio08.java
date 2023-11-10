package condicionales;

import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 2  500 | ESPERA: 1250€ | OBTENIDO: 1250.0€
	 * ENTRADA: 7  320 | ESPERA: 800€ | OBTENIDO: 800.0€ 
	 * ENTRADA: 10 1000 | ESPERA: 1750€ | OBTENIDO: 1750.0€
	 * ENTRADA: 5  950 | ESPERA: 2375€ | OBTENIDO: 2375.0€
	 * ENTRADA: 1 10| ESPERA: 25€ | OBTENIDO: 25.0€
	 */

public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion de la variable del escaner
		Scanner sc = new Scanner(System.in);
		//Creacion de la variable de los dias que se quedará el usuario
		int dias;
		//Creacion de la variable de la distancia que recorrerá, el precio final y el precio con la reduccion
		double distancia, precioF, precioR;
		//Creacion de las constantes del porcentaje de la reduccion y del precio por kilometro
		final double REDUCCION = 0.7, PRECIOKM = 2.5;
		
		//Gestion de instrucciones
		
		//Impresion del mensaje para que introduzca los dias que se quedará
		System.out.print("¿Cuantos días va a quedarse?\n-");
		//Escaneo y guardado del valor de los dias
		dias = sc.nextInt();
		//Impresion del mensaje para que introduzca la distancia que recorrerá
		System.out.print("¿Cuantos kilometros vas a recorrer?\n-");
		//Escaneo y guardado de la distancia
		distancia = sc.nextDouble();
		
		//Calculo del precio final, se multiplica la distancia por el precio por kilometro
		precioF = distancia * PRECIOKM;
		
		//Condicion para saber si los dias y la distancia son las que están en el rango para aplicarle el descuento
		if(dias >= 7 && distancia >= 800) {
			//Calculo del descuento, se calcula el precio final por el descuento del 30%
			precioR = precioF * REDUCCION;
			//Impresion del mensaje final con el precio reducido
			System.out.println("El precio con el descuento es: " + precioR + "€");
		}else{ //En caso de no cumplir los requisitos se le muestra el mensaje con el precio sin descuento
			System.out.println("El precio total es: " + precioF + "€");
		}
		//Cierre del escaner
		sc.close();
	}

}
