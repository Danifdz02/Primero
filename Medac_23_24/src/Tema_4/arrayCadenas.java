package Tema_4;

import java.util.Scanner;

public class arrayCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir a un usuario la cantidad de palabras
		//Solicitar esas palabras
		//almacenar en un array las palabras
		
		Scanner sc= new Scanner(System.in);	
		
		int numPalabras=0;
		
		System.out.println("¿Cuantas palabras quieres que contenga tu array?");
		numPalabras=sc.nextInt();
		
		String [] listaPalabras=new String[numPalabras];
		sc.nextLine();  //<--Sirve para limpiar el scanner IMPORTANTE
		for(int i=0; i < listaPalabras.length; i++) {
			System.out.println("Ingrese la palabra "+(i+1)+": ");
			String palabra = sc.nextLine();
			listaPalabras[i] = palabra;
		}
		
		for(int i=0; i < listaPalabras.length; i++) {
		System.out.println("Palabra "+(i+1)+" es: "+listaPalabras[i]);	
		
		}
		
		
	}
	
}
