package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;
	/*
	 * ENTRADA: 10| ESPERA: 4 números primos | OBTENIDO: En el rango 1..10, hay 4 números primos
	 * ENTRADA: 100 | ESPERA: 25 números primos | OBTENIDO: En el rango 1..100, hay 25 números primos
	 * ENTRADA: -5 | ESPERA: Introduce numero | OBTENIDO: Introduce numero (hasta que esté en el rango)
	 * ENTRADA: 9999 | ESPERA: 1229 números primos | OBTENIDO: En el rango 1..9999, hay 1229 números primos
	 * ENTRADA: h | ESPERA: Valor no correcto | OBTENIDO: El tipo de valor no es correcto, Introduce numero(0-∞): 
	 */
public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		Scanner sc = new Scanner(System.in);
		int j, num = -1, contPri = 0;
		boolean primo;
		
		//Gestion de instrucciones
		
		do {
			try {
				//Impresion de mensaje para introducir el valor del numero
				System.out.print("Introduce numero(0-∞): ");
				//Escaneo y guardado del valor introducido
				num = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("El tipo de valor no es correcto");
				sc.nextLine();
			}
		}while(num<0);
		//Bucle para incrementar una variable para que recorra los numeros desde el 2 hasta el que ha introducido el usuario para saber si la cifra es divisible o no
		for(int i=2;i<=num;i++){
			primo=true;
			j=2;
			//Bucle para incrementar la variable j para saber si j e i son divisibles y así saber si son primos o compuestos
			while (j<=i-1 && primo==true){
				if (i%j==0) {//Si son divisible no son primos, es decir es false
					primo=false;
				}
				j++;
			}
			if (primo){//En caso de ser true se incrementa el contador de numeros primos
				contPri++;
			}
		}
		//Impresion del mensaje final
		System.out.println("En el rango 1.." + num + ", hay "+ contPri + " números primos");
		//Cierre del escaner
		sc.close();
	}
}
