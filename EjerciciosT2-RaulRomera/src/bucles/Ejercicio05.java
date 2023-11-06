package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, mcm = 1, i = 2;
		
		System.out.print("Introduce un número: ");
		a = sc.nextInt();
		System.out.print("Introduce otro número: ");
		b = sc.nextInt();
		
		while(i<=a || i<=b) {
			if(a%1==0 || b%1==0) {
				mcm = mcm*i;
				if(a%i==0)
					a=a/i;
				if(b%i==0)
					b=b/i;
			}else
				i=i+1;
		}
		System.out.println("El MCM de los dos números es:" + mcm);
		sc.close();
	}

}
