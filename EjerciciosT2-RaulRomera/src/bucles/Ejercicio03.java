package bucles;

import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	       
		int n;
	        
	    System.out.print("Introduzca un número: ");
	    n = sc.nextInt();
	    for(int i=1;i<=n;i++){
	    	for(int espacio = 1; espacio <= n - i; ++espacio) {
	    		System.out.print(" ");
	    	}
	    	for(int j=1;j<=i;j++){
	    		System.out.print("* ");
	        }
	        System.out.println();
	    }
	    sc.close();
	}

}
