package com.daw.programacion.tema2;

import java.util.Scanner;

public class Tema2Actividad1 {

	public static void main(String[] args) {
		// Tema 2 Actividad 1. Declarando variables y evaluando condiciones.
		// Daniel Fernandez Munoz
		// Desarrollo de Aplicaciones Web (DAW)
		/*
		 * 1�. Crear 8 variables. �TODAS LAS TENEIS QUE INICIALIZAR A ALGO!
		 * 		2 de tipo entero (int)
		 * 		2 de tipo n�mero real (double)
		 * 		2 de tipo booleano (boolean)
		 * 		2 de tipo String (String)
		 * 
		 * 		1 punto
		 */
		System.out.println("------------------------\n EJERCICIO 1\n------------------------");
		int entero1 = 18;
		int entero2 = 21;
		double double1 = 100000;
		double double2 = 1000000;
		boolean v = true, f = false;
		String nombre = "Daniel";
		String apellido = "Fernandez";
		System.out.println("¿Cual es tu nombre? "+nombre+" ¿y tu apellido? "+apellido);
		System.out.println("¿Cuanto dinero tienes? "+double1+" ¿Cuanto te gustaria tener? "+double2);
		System.out.println("¿Cual es la edad de tu hermano? "+entero1+" ¿y la tuya? "+entero2);
		System.out.println("Te gustaria tener un perro "+v+", ¿y un gato? "+f);
		

		/*
		 * 2�. 	Ten�is que crear 8 sentencias if donde compar�is cada par de variables que hab�is creado en el apartado 1.
		 * 		Dentro de cada if ten�is que imprimir por pantalla 2 mensajes, uno que indica que la condici�n s� se ha cumplido,
		 * 		y otro que indique que la condici�n no se ha cumplido.
		 * 		Ten�is que usar todos los operadores l�gicos simples (==, !=, >, <, >=, <=) AL MENOS 1 VEZ.
		 * 		Para comparar 2 Strings, POD�IS MIRAR EL DOCUMENTO DE AYUDA QUE OS HE PROPORCIONADO.
		 * 		
		 * 		1 punto
		 */
		System.out.println("------------------------\n EJERCICIO 2\n------------------------");
		int entero11 = 18; // edad hermano
		int entero22 = 21; // edad yo
		double double11 = 100000; // dinero x
		double double22 = 1000000; // dinero y
		boolean vv = true, ff = false;
		String nombree = "Daniel";
		String apellidoo = "Fernandez";

		if (entero11 < entero22) {
			System.out.println("Eres mayor que tu hermano");
		} else {
			System.out.println("Eres menor que tu hermano");
		}

		if (double11 > double22) {
			System.out.println("Tienes mas dinero");
		} else {
			System.out.println("Tienes menos dinero");
		}

		if (entero11 >= 18 && entero11 <= 22) {
			System.out.println("Eres un adolescente");
		} else if (entero11 > 22 && entero11 <= 70) {
			System.out.println("Eres un adulto");
		}
		
		int resultadoComparacion= nombree.compareTo(apellidoo);
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
		
		
		/*
		 * 3�. 	a) 	Teneis que crear 4 variables m�s. Una de cada tipo indicado en el ejercicio 1
		 * 		b)	Teneis que crear 4 sentencias if donde us�is los comparadores logicos "complejos" (& y |)
		 * 		c) 	Dentro de cada if, ten�is que imprimir por pantalla dos mensajes, uno que indique que la condici�n se ha cumplido
		 * 				y otro que indique que la condici�n no se ha cumplido
		 * 
		 * 		2 puntos
		 */
		System.out.println("------------------------\n EJERCICIO 3\n------------------------");
		int entero111 = 18;
		int entero222 = 21;
		int entero3= 50;
		double double111 = 100000;
		double double222 = 1000000;
		double double3 = 50000;
		boolean vvv = true, fff = false, verdad = true;
		String nombreee = "Daniel";
		String apellidooo = "Fernandez";
		String ciudad = "Almeria";
		
		if (entero222 >= entero111 && entero222 <= entero3 ) {
			System.out.println("La condicion se ha cumplido.");
		}else {
			System.out.println("No se ha cumplido la condicion.");
		}
		
		if (double1>= double222 || double3 >= double222) {
			System.out.println("La condicion se ha cumplido.");
		}else {
			System.out.println("La condicion no se ha cumplido.");
		}
		
		if (vvv && verdad) {
			System.out.println("La condicion se ha cumplido.");
		}else if (v || f) {
			System.out.println("La condicion no se ha cumplido.");
		}
		
		int resultado= nombreee.compareTo(apellidooo);
		if (resultado==0) {
			System.out.println("Coinciden");
		}else {
			System.out.println("No coinciden");
		}
			
		
		
		/*
		 * 4�	a)	Teneis que crear 2 variables mas. Una de tipo entero y otra de tipo String
		 * 		b)	Teneis que crear 2 trozos de codigo que pida al usuario que introduzca datos por teclado. Uno para introducir String y otro para introducir numeros.
		 * 		c)	Teneis que crear 2 sentencias if que comparen lo que el usuario ha introducido por teclado con ALGUNA DE VUESTRAS VARIABLES ANTERIORMENTE INICIALIZADAS.
		 * 
		 * 		2 puntos
		 */
		System.out.println("------------------------\n EJERCICIO 4\n------------------------");
		Scanner sc =new Scanner(System.in);
		int entero1111 = 18;
		int entero2222 = 21;
		int entero33= 50;
		int edadusuario = -1;
		double double1111 = 100000;
		double double2222 = 1000000;
		double double33 = 50000;
		boolean vvvv = true, ffff = false, verdadd = true;
		String nombreeee = "Daniel";
		String apellidoooo = "Fernandez";
		String ciudadd = "Almeria";
		String nombreusuario = "";
		
		System.out.println("¿Cual es tu nombre?");
		nombreusuario = sc.nextLine();
		int resultadoComparacion1= nombreusuario.compareTo(nombreeee);
		if (resultadoComparacion1 == 0) {
			System.out.println("Te llamas igual que yo!");
		}else {
			System.out.println("Encantado, yo soy Daniel.");
		}
		
		System.out.println("¿Y cual es tu edad?");
		edadusuario = sc.nextInt();
		if (edadusuario == entero2222) {
			System.out.println("Yo también tengo 21 años!");
		}else {
			System.out.println("Yo tengo 21!");
		}
		

		
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
		int nota = -1;
		
		System.out.println("¿Cual ha sido tu nota en el examen?");
		nota = sc.nextInt();
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
		
		
		
		/*
		 * 6�	1. Dados dos n�meros que el usuario introducir�a por teclado, elaborar un algoritmo que sume ambos n�meros y te muestre el resultado por pantalla.
		 * 		2. Dado un a�o que el usuario introducir�a por teclado, hay que averiguar a qu� siglo pertenecer�a dicho a�o y mostrar dicho siglo por pantalla.
		 * 
		 * 		Ejemplo: Dado el a�o 1989 -> El programa nos mostrar�a por pantalla: Siglo 20.
		 * 		Ejemplo2: Dado el a�o 1800 -> El programa nos mostrar�a por pantalla: Siglo 18.
		 * 		*Nota aclaratoria. El siglo se empieza a contar a partir del a�o xx00 . Osea, el a�o 1700 es siglo 17. El a�o 1701 ser�a siglo 18.
		 * 
		 * 		1 punto
		 */
		System.out.println("------------------------\n EJERCICIO 6\n------------------------");
		double numero1 = -1;
		double numero2 = -1;
		System.out.println("A continuación va a introducir dos numeros, primer numero:");
		numero1 = sc.nextDouble();
		System.out.println("Y el segundo numero:");
		numero2 = sc.nextDouble();
		double suma=(numero1+numero2);
		System.out.println("La suma de los dos numero introducidos es: "+suma);
		
		int year=-1;
		int anno=-1;
		System.out.println("Introduce un año y sabras a que siglo pertenece:");
		year=sc.nextInt();
		 
		anno=(year/100);
			if(year%100!=0)
            anno=anno+1;
	        if(anno==1)
	            System.out.println("I");
	        if(anno==2)
	            System.out.println("II");
	        if(anno==3)
	            System.out.println("III");
	        if(anno==4)
	            System.out.println("IV");
	        if(anno==5)
	            System.out.println("V");
	        if(anno==6)
	            System.out.println("VI");
	        if(anno==7)
	            System.out.println("VII");
	        if(anno==8)
	            System.out.println("VIII");
	        if(anno==9)
	            System.out.println("IX");
	        if(anno==10)
	            System.out.println("X");
	        if(anno==11)
	            System.out.println("XI");
	        if(anno==12)
	            System.out.println("XII");
	        if(anno==13)
	            System.out.println("XIII");
	        if(anno==14)
	            System.out.println("XIV");
	        if(anno==15)
	            System.out.println("XV");
	        if(anno==16)
	            System.out.println("XVI");
	        if(anno==17)
	            System.out.println("XVII");
	        if(anno==18)
	            System.out.println("XVIII");
	        if(anno==19)
	            System.out.println("XIX");
	        if(anno==20)
	            System.out.println("XX");
	        if(anno==21)
	            System.out.println("XXI");
	        System.out.println("Es el siglo: " + anno);
		sc.close();
		
		
		/*
		 * 		Para entregar el ejercicio, ten�is que indicar al principio de todo:
		 * 		Nombre de la actividad
		 * 		Nombre y apellidos
		 * 		Nombre del m�dulo
		 * 
		 * 		Deb�is hacerlo poniendo 3 l�neas de comentarios usando los comentarios MULTIL�NEA.
		 * 		
		 * 		0.5 puntos
		 */

	}

}
