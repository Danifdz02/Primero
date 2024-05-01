package com.daw.programacion.tema2;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5�	1. Dada una nota de un examen, elaborar un algoritmo que muestre por pantalla un mensaje dependiendo de la nota que se haya
		 *		introducido por teclado.
		 * 		
		 * 		Si la nota es menor que un 5 -> Mostrar por pantalla "Sigue estudiando noob"
		 *		Si es de un 5 hasta un 7 (sin incluir el 7) -> Mostrar "Aprobado por los pelos"
		 * 		De 7 a 9 (sin incluir el 9) -> "Notable, not bad!"
		 *		De 9 a 10(sin incluir el 10) -> "Sobresaliente, enhorabuena campe�n"
		 *		Un 10 -> "Matricula de honor, eres un/a masquet�s"
		 * 
		 * 		1 punto
		 */
		System.out.println("------------------------\n EJERCICIO 5\n------------------------");
		Scanner scan =new Scanner(System.in);
		int nota = -1;
		
		System.out.println("¿Cual ha sido tu nota en el examen?");
		nota = scan.nextInt();
		if (nota < 5) {
			System.out.println("Sigue estudiando noob");
		} else if (nota >=5 && nota <7) {
			System.out.println("Aprobado por los pelos");
		} else if (nota >=7 && nota <9) {
			System.out.println("Notable, not bad!");
		} else if (nota >=9 && nota <10) {
			System.out.println("Sobresaliente, enhorabuena campeon");
		}else if (nota == 10){
			System.out.println("Matricula de honor, eres un/a masquetas");
		}
		scan.close();
	}

}
