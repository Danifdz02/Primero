package Tema_2;

import java.util.Scanner;

public class lectura_por_teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para leer datos por teclado utilizamos el Scanner
		Scanner sc = new Scanner(System.in); //MUY IMPORTANTE SIEMPRE PONER ESTE COMANDO
		int edad = -1;
		
		System.out.println("Introduce tu edad ");
		edad = sc.nextInt();
		
		System.out.println("Tu edad es "+edad);
	}

}
