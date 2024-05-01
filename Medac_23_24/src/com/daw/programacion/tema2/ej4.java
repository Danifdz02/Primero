package com.daw.programacion.tema2;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4�	a)	Teneis que crear 2 variables mas. Una de tipo entero y otra de tipo String
		 * 		b)	Teneis que crear 2 trozos de c�digo que pida al usuario que introduzca datos por teclado. Uno para introducir String y otro para introducir numeros.
		 * 		c)	Teneis que crear 2 sentencias if que comparen lo que el usuario ha introducido por teclado con ALGUNA DE VUESTRAS VARIABLES ANTERIORMENTE INICIALIZADAS.
		 * 
		 * 		2 puntos
		 */
		System.out.println("------------------------\n EJERCICIO 4\n------------------------");
		Scanner scan =new Scanner(System.in);
		int entero1 = 18;
		int entero2 = 21;
		int entero3= 50;
		int edadusuario = -1;
		double double1 = 100000;
		double double2 = 1000000;
		double double3 = 50000;
		boolean v = true, f = false, verdad = true;
		String nombre = "Daniel";
		String apellido = "Fernandez";
		String ciudad = "Almeria";
		String nombreusuario = "";
		
		System.out.println("¿Cual es tu nombre?");
		nombreusuario = scan.nextLine();
		int resultadoComparacion= nombreusuario.compareTo(nombre);
		if (resultadoComparacion == 0) {
			System.out.println("Te llamas igual que yo!");
		}else {
			System.out.println("Encantado, yo soy Daniel.");
		}
		
		System.out.println("¿Y cual es tu edad?");
		edadusuario = scan.nextInt();
		if (edadusuario == entero2) {
			System.out.println("Yo también tengo 21 años!");
		}else {
			System.out.println("Yo tengo 21!");
		}
		scan.close();
		
		
		
		
		
		
		
	}

}
