package aparte;

import java.util.Scanner;

public class imprimirRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//h altura
		//l columnas
	
		int l= 0;
		int h = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce h");
		h = sc.nextInt();
		System.out.println("Introduce l");
		l= sc.nextInt();
		for( int i= 0; i<h; i++ ) {
			for(int j = 0; j < l; j++){
				System.out.print("* ");
			}
			System.out.println("");
		
		}
	}
}