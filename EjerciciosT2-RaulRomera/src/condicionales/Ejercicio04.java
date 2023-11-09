package condicionales;

import java.util.Scanner;

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
		num = sc.nextInt();
		
		primerDigito = num/10;
		segundoDigito = num%10;
		
		if(num > 0 && num < 100) {
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
		switch(primerDigito) {
		case 0:
			numero2 = "";
			break;
			case 1:
				switch(segundoDigito) {
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
				switch(segundoDigito) {
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
		}else {
			System.err.println("ERROR");
		}
		if((num <= 10 || num >=15) && (num <= 30 || num % 10 == 0)) {
			System.out.println(numero2 + numero1);
		}else if(num > 10 && num < 15) {
			System.out.println(numero1);
		}else {
			System.out.println(numero2 + " y " + numero1);
		}
		sc.close();
	}

}
