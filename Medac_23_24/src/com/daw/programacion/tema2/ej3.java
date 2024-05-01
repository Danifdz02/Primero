package com.daw.programacion.tema2;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3�. 	a) 	Teneis que crear 4 variables mas. Una de cada tipo indicado en el ejercicio 1
		 * 		b)	Teneis que crear 4 sentencias if donde useis los comparadores logicos "complejos" (& y |)
		 * 		c) 	Dentro de cada if, teneis que imprimir por pantalla dos mensajes, uno que indique que la condicion se ha cumplido
		 * 				y otro que indique que la condicion no se ha cumplido
		 * 
		 * 		2 puntos
		 */
		
		System.out.println("------------------------\n EJERCICIO 3\n------------------------");
		int entero1 = 18;
		int entero2 = 21;
		int entero3= 50;
		double double1 = 100000;
		double double2 = 1000000;
		double double3 = 50000;
		boolean v = true, f = false, verdad = true;
		String nombre = "Daniel";
		String apellido = "Fernandez";
		String ciudad = "Almeria";
		
		if (entero2 >= entero1 && entero2 <= entero3 ) {
			System.out.println("La condicion se ha cumplido.");
		}else {
			System.out.println("No se ha cumplido la condicion.");
		}
		
		if (double1>= double2 || double3 >= double2) {
			System.out.println("La condicion se ha cumplido.");
		}else {
			System.out.println("La condicion no se ha cumplido.");
		}
		
		if (v && verdad) {
			System.out.println("La condicion se ha cumplido.");
		}else if (v || f) {
			System.out.println("La condicion no se ha cumplido.");
		}
		
		if (nombre == apellido && nombre == ciudad) {
			System.out.println("La condicion se ha cumplido.");
		}else {
			System.out.println("La condicion no se ha cumplido.");
		}
		
		
		
	}

}
