package aparte;

import java.util.Scanner;

public class imprimirCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el lado");
		int lado = 0;
		lado = sc.nextInt();
		for( int i= 0; i<lado; i++ ) {
			for(int j = 0; j < lado; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
}	