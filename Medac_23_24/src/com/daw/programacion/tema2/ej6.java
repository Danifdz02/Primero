package com.daw.programacion.tema2;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Scanner sc =new Scanner(System.in);
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
	}

}
