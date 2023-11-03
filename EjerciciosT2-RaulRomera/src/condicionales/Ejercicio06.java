package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int num1, num2, resultadoU, resultadoR;
		num1 = r.nextInt(1,100);
		num2 = r.nextInt(1,100);
		
		System.out.println("¿Cuál es el resultado de la siguiente suma? " + num1 + " + " + num2);
		resultadoU = sc.nextInt();
		resultadoR = num1 + num2;
		
		if(resultadoU == resultadoR) {
			System.out.println("Acertaste!!!");
		}else {
			System.out.println("Fallaste, el resultado es: " + resultadoR);
		}
		sc.close();
		
	}

}
