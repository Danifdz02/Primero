package Tema_3;

import java.util.Scanner;

public class bucles_condicionesmultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizad un programa que solicite al usuario su edad
		//Mientras no sea un numero entre 0 y 100 (Usando una condicion multiple)
		Scanner scan = new Scanner(System.in);
		int edad = -1;
		System.out.println("Introduce tu edad: ");
		edad = scan.nextInt();
		while (edad<0 || edad>100) {
			System.out.println("Error, introduce tu edad de nuevo.");
			edad=scan.nextInt();
		}
		System.out.println("La edad es "+edad);
		scan.close();
		
		
	}

}
