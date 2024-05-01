package Tema_4;

import java.util.Scanner;

public class cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el lado");
		int lado = sc.nextInt();
		
		for(int i=0; i<lado; i++);{
			for(int j = 0; j < lado; j++);{
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Introduce la altura");
		int altura = sc.nextInt();
		sc.close();
		for(int fila = 0; fila < altura; fila++) {
			for(int col=0; col< lado; col++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
