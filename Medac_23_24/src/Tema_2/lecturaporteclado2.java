package Tema_2;

import java.util.Scanner;

public class lecturaporteclado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("FORMULARIO DE ALTA");
		System.out.println("************************");
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine(); //PARA STRING EN LECUTRA DE TECLADO USAR SIEMPRE NEXTLINE
		System.out.println("Introducte tu edad: ");
		int edad = sc.nextInt();
		System.out.println("Introduzca su peso: ");
		double peso = sc.nextDouble();
		System.out.println("¿Alta (true) o baja (false)? ");
		boolean tipoOperacion = sc.nextBoolean();
		sc.close(); //Para cerrar Scanner
		
		System.out.println("DATOS DEL USUARIO \nNombre del usuario: "+nombre+
				"\nEdad del usuario: "+edad+"\nPeso del usuario: "+peso+
				"\n¿Es un alta? "+tipoOperacion);
		
		
	}

}
