package Tema_2;

public class Ejercicio_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = 100.58;
		// int numeroEntero = numero; // da error, para que no de error añadimos (int) detras del numero, esto se llama Casting
		int numeroEntero = (int)numero;
		System.out.println(numeroEntero);
		System.out.println((double)numeroEntero); //para tener los decimales añadimos el double
		
		String num = "157";
		int n = Integer.parseInt(num);
		System.out.println("De cadena a int y resto 2" + (n-2));
		
		
	}

}
