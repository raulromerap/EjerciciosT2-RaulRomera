package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double kilos, comida, raciones = 0, restante = 0;
		
		int animales;
		
		System.out.print("Introduce la cantidad de comida comprada: ");
		comida = sc.nextDouble();
		System.out.print("Introduce la cantidad de kilos de comida que comen tus animales: ");
		kilos = sc.nextDouble();
		System.out.print("Introduce la cantidad de animales que tienes: ");
		animales = sc.nextInt();

		restante = comida - kilos;
		if (comida < kilos){
			System.out.println("No hay suficiente comida comprada");
		}else if (animales < 1 && kilos < 0 && comida < 0) {
			if (restante > 0) {
				raciones = restante/(double)animales;
				
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
