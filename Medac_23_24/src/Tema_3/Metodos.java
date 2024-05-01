package Tema_3;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 2.5;
		double suma1 = suma(num1, 3, 7);
		double suma2 = suma(50, 4, 3.2);
		System.out.println("La suma 1 + 2 es "+(suma1+suma2));
		String nombre= "Daniel";
		String ciudad= "Almeria";
		String present = presentacion(nombre, ciudad);
		System.out.println(present);
		System.out.println(presentacion("Dani", "Adra"));
	}

	public static double suma(double n1, double n2, double n3) {
		double sumaNumeros = n1+n2+n3;
		System.out.println("La suma es "+sumaNumeros);
		return sumaNumeros;
	}
	
	public static String presentacion(String nombre, String ciudad) {
		String cadena = "Tu nombre es "+nombre+" y tu ciudad es "+ciudad;
		return cadena;	
	}
	
	
}
