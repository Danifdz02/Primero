package Tema_1;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un programa con una variable tipo texto, una tipo nº entero,
		//una tipo nº decimal y otra que sea un check tipo V/F y otra caracter
		//Crear una cadena con toda esta informacion e imprimirla
		String nombre = "Dani";
		int edad = 21;
		double estatura = 1.91;
		boolean mayorEdad = true;
		char numeroCamiseta = '9';
		System.out.println(edad);
		System.out.println(nombre);
		System.out.println(mayorEdad);
		System.out.println(numeroCamiseta);
		System.out.println(estatura);
		System.out.println(nombre+" es un jugador de futbol, ¿es mayor de edad? "+mayorEdad+" ,el tiene " +edad+ " ,su dorsal"
				+ " en la camiseta es el " +numeroCamiseta+ " y su estatura es de " +estatura);
		
		//cadena con toda la informacion e impresa
		String presentacion = nombre+" es un jugador de futbol, ¿es mayor de edad? "+mayorEdad+" ,el tiene " +edad+ " ,su dorsal"
				+ " en la camiseta es el " +numeroCamiseta+ " y su estatura es de " +estatura;
		System.out.println (presentacion);
		
		//segunda presentacion poniendo el \n para que salga en diferentes lineas
		String presentacion2 = nombre+" es un jugador de futbol "+"\n"+"¿es mayor de edad? "+mayorEdad+" ,el tiene " +edad+"\n"+ "su dorsal"
				+ " en la camiseta es el " +numeroCamiseta+ " y su estatura es de " +estatura;
		System.out.println (presentacion2);
		
		//mostrar la variable altura por pantalla en metros y cm
		System.out.print("Mi altura en metros es "+estatura+" y en centimetros es "+estatura*100);
	}

}
