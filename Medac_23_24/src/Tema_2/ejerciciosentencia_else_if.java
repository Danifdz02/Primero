package Tema_2;

import java.util.Scanner;

public class ejerciciosentencia_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es tu edad");
		int edad = -1;
		edad = sc.nextInt();
		sc.close();
		if (edad >=0 && edad <5) {
			System.out.println("Eres un bebe.");
		} else if (edad >=5 && edad <14) {
			System.out.println("Eres un niño.");
		} else if (edad >=14 && edad <20) {
			System.out.println("Eres un adolescente");
		} else if (edad >= 20) {
			System.out.println("ERROR");
		}
		
		
		
		
	}

}
