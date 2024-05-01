package Tema_2;

import java.util.Scanner;

public class comparar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir dos cadenas por teclado
		//mostrar un mensaje si son iguales o son distintas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De qué color es tu camiseta?");
		String color1 = sc.nextLine();
		System.out.println("¿y tu pantalon?");
		String color2=sc.nextLine();
		sc.close();
		//Comparamos ambas variables tipo cadena con el metodo compareTo()
		int resultadoComparacion= color1.compareTo(color2);
		//Mostramos un mensaje si son iguales o son distintas
		if (resultadoComparacion == 0) {
			System.out.println("Son iguales!");
		}else {
			System.out.println("Son distintas");
		}
		//Si quisieramos ignorar las mayusculas y minuscular a la hora de comprobar usaremos compareToIgnoreCase()
		
	}

}
