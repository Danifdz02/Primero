package Tema_2;

import java.util.Scanner;

public class ejercicio_lecturateclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ALTA DE USUARIO
		// leer nombre, peso y edad. 
		//una validación true -> dado de alta F-> Baja
		System.out.println("************************");
		System.out.println("FORMULARIO DE ALTA");
		System.out.println("************************");
		
		double peso = -1;
		System.out.println("Introduce tu peso: ");
		peso = sc.nextDouble();
		System.out.println("Tu peso es de "+peso);
		
		String nombre = "";
		System.out.println("¿Cual es tu nombre? ");
		nombre = sc.nextLine();
		System.out.println("Tu nombre es "+nombre);
				
		int edad = -1;
		System.out.println("¿Cual es tu edad? ");
		edad = sc.nextInt();
		System.out.println("Tu edad es "+edad+" años.");
		
		boolean ALTA = true;
		boolean BAJA = false;
		System.out.println("Escribe ALTA si quieres darte de alta en el producto, escribe BAJA si quieres dar de baja el producto. ");
		ALTA = sc.nextBoolean(); 
		BAJA = sc.nextBoolean();
		System.out.println("Has sido dado de "+ALTA);
		
		}

}
