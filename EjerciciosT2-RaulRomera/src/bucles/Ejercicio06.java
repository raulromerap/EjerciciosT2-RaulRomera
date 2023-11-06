package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduzca un número: ");
	    n = sc.nextInt();
	    
	    if(n>=0 && n<=20) {
		    for(int i=1;i<=n;i++){
		    	for(int j=1;j<=i;j++){
		    		System.out.print(i);
		        }
		        System.out.println();
		    }
	    }
	    sc.close();
		
	}

}
