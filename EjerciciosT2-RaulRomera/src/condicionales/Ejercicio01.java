package condicionales;

import java.util.Scanner;

	//Caso de prueba
	//

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Gestión de variables
		
		//Creacion de la variable del escaner
		Scanner sc = new Scanner(System.in);
		//Creacion de las variables para el numero del usuario, las unidades, las decenas, las centenas y los millares
		int num, unidad = 0, decena = 0, centena = 0, mil=0;
		
		//Gestión de desarrollo
		
		//Impresion del mensaje para la introduccion del numero del usuario
		System.out.print("Introduce un número entre 0 y 9999: ");
		//Escaneo y guardado del numero del usuario
		num = sc.nextInt();
		
		if (num>0 && num<10){ //Condicional para saber si el numero se encuentra entre 0 y 9
			//Si se cumple la condicion se introduce el mensaje
			System.out.println("Es capicúa");
		}else if (num>9 && num<100) { //Condicional para saber si el numero se encuentra entre 10 y 99
			//Calculo para sacar la unidad
			unidad = num%10;
			//Calculo para sacar la decena
			decena = num/10;
			if(unidad == decena) { //Condicional para saber si la unidad y la decena son iguales o no
				//Caso que sea cierto, se escribe el mensaje
				System.out.println("Es capicúa");
			}else {
				//Caso que no sea cierto, se escribe este otro
				System.out.println("No es capicúa");
			}
		}else if (num>99 && num<1000) { //Condicional para saber si el numero se encuentra entre 100 y 999
			//Calculo para sacar la unidad
			unidad = num%10;
			//Calculo para sacar la centena
			centena = num/100;
			if(unidad == centena) { //Condicional para saber si la unidad y la centena son iguales o no
				//Caso que sea cierto, se escribe el mensaje
				System.out.println("Es capicúa");
			}else {
				//Caso que no sea cierto, se escribe este otro
				System.out.println("No es capicúa");
			}
		}else if (num>999 && num<=9999) { //Condicional para saber si el numero se encuentra entre 1000 y 9999
			//Calculo para sacar la unidad
			unidad = num%10;
			//Calculo para sacar la decena
			decena = (num/10)%10;
			//Calculo para sacar la centena
			centena = (num/100)%10;
			//Calculo para sacar el millar
			mil = num/1000;
			if(unidad == mil && decena == centena) { //Condicional para saber si la unidad y el millar, y la decena y la centena son iguales o no
				//Caso que sea cierto, se escribe el mensaje
				System.out.println("Es capicúa");
			}else {
				//Caso que no sea cierto, se escribe este otro
				System.out.println("No es capicúa");
			}
				
		}else { //Si el numero no está en el rango se le da un mensaje de error
			System.err.println("ERROR");
		}
		//Cierre del escaner
		sc.close();
	}
}

