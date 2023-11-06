package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int j, num, contPri = 0;
		boolean primo;
		
		System.out.print("Introduce numero: ");
		num = sc.nextInt();
		
		for(int i=2;i<=num;i++){
			primo=true;
			j=2;
			while (j<=i-1 && primo==true){
				if (i%j==0) {
					primo=false;
				}
				j++;
			}
			if (primo==true){
				contPri++;
			}
		}
		System.out.println("En el rango 1.." + num + ", hay "+ contPri + " números primos");
		sc.close();
	}
}
