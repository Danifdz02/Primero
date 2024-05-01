package Tema_1;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imprime con un salto de linea
		System.out.println("Se va a ejecutar mi primer programa");
		//Variable nombre tipo texto
		String nombreUsuario = "Pepe";
		//imprimir variable, usamos el + para concatenar
		System.out.println("Mi nombre es: " + nombreUsuario);
		int edad = 20;
		System.out.println("Edad: "+edad);
		System.out.println("Mi nombre es " + nombreUsuario + " y mi edad es " + edad);
		//Creo una variable string con toda la frase anterior
		String presentacion = "Mi nombre es " + nombreUsuario + " y mi edad es " + edad;
		System.out.println (presentacion); 
		//para cambiar el dato de una variable
		edad = 25;
		System.out.println (edad);
		nombreUsuario = "Dani";
		System.out.println (nombreUsuario);
		String presentacion2 = "Mi nombre es "+nombreUsuario+ " y mi edad es "+edad;
		System.out.println (presentacion2);
	}

}
