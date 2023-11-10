package condicionales;

import java.util.Scanner;

	/* Casos de prueba
	 * ENTRADA: 12 | ESPERA: Doce | OBTENIDO: doce
	 * ENTRADA: 55 | ESPERA: Cincuenta y cinco | OBTENIDO: cincuenta y cinco
	 * ENTRADA: -5 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 100 | ESPERA: ERROR | OBTENIDO: ERROR
	 * ENTRADA: 17 | ESPERA: Diecisiete | OBTENIDO: diecisiete
	 */

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Gestion de variables
		
		//Creacion de variable para el escaner
		Scanner sc = new Scanner(System.in);
		
		//Creacion de variable para el número del usuario, las decenas y las unidades
		int num, primerDigito = 0, segundoDigito = 0;
		//Creacion de las variables para poner las decenas y las unidades en forma de palabras
		String numero1 = "", numero2 = "";
		
		//Impresion de mensaje para introducir el numero del usuario
		System.out.print("Introduzca un numero entre 1 y 99: ");
		//Escaneo y guardado del valor paa la variable del numero
		num = sc.nextInt();
		
		//Calculo para sacar las decenas, ultiliza una division para dejar solo el digito de la izquierda
		primerDigito = num/10;
		//Calculo para sacar las unidades, utiliza el modulo para dejar solo el digito de la derecha
		segundoDigito = num%10;
		
		//Condicional para saber si el numero introducido está en el rango determinado
		if(num > 0 && num < 100) {
			//Utiliza el valor de las unidades para poner en su lugar el valor correspondiente en letras
			switch(segundoDigito) {
				case 1 ->
				numero1 = "uno";
				case 2 ->
				numero1 = "dos";
				case 3 ->
				numero1 = "tres";
				case 4 ->
				numero1 = "cuatro";
				case 5 ->
				numero1 = "cinco";
				case 6 ->
				numero1 = "seis";
				case 7 ->
				numero1 = "siete";
				case 8 ->
				numero1 = "ocho";
				case 9 ->
				numero1 = "nueve";
				default ->
				numero1 = "";
			};
			//Utiliza el valor de las decenas para poner en su lugar el valor correspondiente en letras
			switch(primerDigito) {
			case 0:
				numero2 = "";
				break;
				case 1:
					switch(segundoDigito) { //Si la decena es 1 debe sacar diferentes variantes del rango del 10 al 19 para poner correctamente el numero en letras
						case 0 ->
						numero1 = "diez";
						case 1 -> 
						numero1 = "once";
						case 2 ->
						numero1 = "doce";
						case 3 ->
						numero1 = "trece";
						case 4 ->
						numero1 = "catorce";
						case 5 ->
						numero1 = "quince";
						default ->
						numero2 = "dieci";
					};
					break;
				case 2 :
					switch(segundoDigito) {//Si la decena es 2 debe sacar diferentes variantes para 20 y (21-29) para poner correctamente el numero en letras
						case 0 ->
						numero2 = "veinte";
						default ->
						numero2 = "veinti";
					};
					break;
				case 3 :
					numero2 = "treinta";
					break;
				case 4 :
					numero2 = "cuarenta";
					break;
				case 5 :
					numero2 = "cincunta";
					break;
				case 6 :
					numero2 = "sesenta";
					break;
				case 7 :
					numero2 = "setenta";
					break;
				case 8 :
					numero2 = "ochenta";
					break;
				case 9 :
					numero2 = "noventa";
					break;
			};
		}else { //En caso de no estar en el rango manda mensaje de error
			System.err.println("ERROR");
		}
		//Condicional para imprimir el mensaje correspondiente a cada caso dado anteriormente
		if((num <= 10 || num >=15) && (num <= 30 || num % 10 == 0)) {
			System.out.println(numero2 + numero1);
		}else if(num > 10 && num < 15) {
			System.out.println(numero1);
		}else { //De no ser un caso "especial" se manda el mensaje determinado
			System.out.println(numero2 + " y " + numero1);
		}
		//Cierre del escaner
		sc.close();
	}

}
