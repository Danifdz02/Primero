package com.daw.programacion.tema2;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Teneis que crear 8 sentencias if donde compareis cada par de variables que
		 * habeis creado en el apartado 1. Dentro de cada if ten�is que imprimir por
		 * pantalla 2 mensajes, uno que indica que la condicion se ha cumplido, y otro
		 * que indique que la condicion no se ha cumplido. Teneis que usar todos los
		 * operadores logicos simples (==, !=, >, <, >=, <=) AL MENOS 1 VEZ. Para
		 * comparar 2 Strings, POD�IS MIRAR EL DOCUMENTO DE AYUDA QUE OS HE
		 * PROPORCIONADO.
		 * 
		 * 1 punto
		 */
		System.out.println("------------------------\n EJERCICIO 2\n------------------------");
		int entero1 = 18; // edad hermano
		int entero2 = 21; // edad yo
		double double1 = 100000; // dinero x
		double double2 = 1000000; // dinero y
		boolean v = true, f = false;
		String nombre = "Daniel";
		String apellido = "Fernandez";

		if (entero1 < entero2) {
			System.out.println("Eres mayor que tu hermano");
		} else {
			System.out.println("Eres menor que tu hermano");
		}

		if (double1 > double2) {
			System.out.println("Tienes mas dinero");
		} else {
			System.out.println("Tienes menos dinero");
		}

		if (entero1 >= 18 && entero1 <= 22) {
			System.out.println("Eres un adolescente");
		} else if (entero1 > 22 && entero1 <= 70) {
			System.out.println("Eres un adulto");
		}
		
		int resultadoComparacion= nombre.compareTo(apellido);
		if (resultadoComparacion == 0) {
			System.out.println("Coinciden!");
		}else {
			System.out.println("No coinciden!");
		}
		
		if (resultadoComparacion != 0) {
			System.out.println("Coinciden!");
		}else {
			System.out.println("No coinciden!");
		}
		
		if (v && f) {
			System.out.println("Coinciden");
		}else {
			System.out.println("No coinciden");
		}
		
	}
}
