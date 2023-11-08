package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Gestión de variables
		
		//Creacion de la variable del escaner
		Scanner sc = new Scanner(System.in);
		//Creacion de las variables para la cantidad de comida que comen los animales, los kilos de comida comprada, las raciones que tiene que repartir y la comida restante
		double kilos, comida, raciones = 0, restante = 0;
		//Creacion de las variables para la cantidad de animales que tiene el usuario
		int animales;
		
		//Gestion de instrucciones
		
		//Impresion del mensaje para que el usuario introduzca la cantidad de comida comprada
		System.out.print("Introduce la cantidad de comida comprada: ");
		//Escaneo y guardado del valor introducido por el usuario
		comida = sc.nextDouble();
		//Impresion del mensaje para que el usuario introduzca la cantidad comida que comen sus animales
		System.out.print("Introduce la cantidad de kilos de comida que comen tus animales: ");
		//Escaneo y guardado del valor introducido por el usuario
		kilos = sc.nextDouble();
		//Impresion del mensaje para que el usuario introduzca la cantidad de animales que tiene
		System.out.print("Introduce la cantidad de animales que tienes: ");
		//Escaneo y guardado del valor introducido por el usuario
		animales = sc.nextInt();

		//Calculo de la comida restante que le queda
		restante = comida - kilos;
		//Condicional para saber si los animales comen más que la comida que ha comprado
		if (comida < kilos){
			//En el caso que sea cierto inserta mensaje
			System.out.println("No hay suficiente comida comprada");
		}else if (animales > 1 && kilos > 0 && comida > 0) { //Si los valores entra en el rango se calcula las raciones que hay que darle a los animales
			//Condicional para saber si hay comida restante o no
			if (restante > 0) {
				//En caso de ser cierto se calcula de las raciones
				raciones = restante/(double)animales;
				
				//Condicional para saber 
				if(raciones > 0) {
					System.out.println("A cada animal le pertenece: " + raciones + " kilos de comida");
				}else {
					System.out.println("No hay suficiente comida");
				}
			}else{
				System.err.println("ERROR");
			}
		}
		sc.close();
	}

}
