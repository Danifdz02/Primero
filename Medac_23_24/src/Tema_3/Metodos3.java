package Tema_3;
/**
 * Este codigo nos calcula el IMC de la altura y peso que introduzcamos.
 * @author daniel
 * @since 31/10/2023
 *
 */
public class Metodos3 {
/**
 * 
 * @param args Este parametro nos recoge el codigo escrito dentro del main.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un metodo para calcular el IMC, ademas si es menor de 20
		//debe imprimir delgado y si es mayor o igual gordo
		
		
			//El elevado tambien se haria así Math.pow(altura, 2)
			//llamada al metodo calcularIMC(...)
			//if else para componer la cadena
			tusDatos("Jose", 25, 80, 2.10);
	}
	/**
	 *  Este metodo calcula el IMC
	 * @param peso - Nos recoge el valor de peso
	 * @param altura - Nos recoge el valor de altura
	 * @return - retorna un valor doble el cual será el resultado del IMC
	 */
	public static double calcularIMC(double peso, double altura) {
		return peso/(altura*altura);
	}
	/**
	 * Aqui nos devolverá todos los datos introducidos
	 * @param nombre - Nos devuelve el nombre
	 * @param edad - Nos devuelve el edad
	 * @param peso - Nos devuelve el peso
	 * @param altura - Nos devuelve la altura
	 */
	public static void tusDatos(String nombre, int edad, double peso, double altura) {
		double imc = calcularIMC(peso, altura);
		if(imc < 20) {
			System.out.println("Tu nombre es "+nombre+" y tu edad "+edad+" tu IMC es "+imc+" debes engordar.");
		}else {
			System.out.println("Tu nombre es "+nombre+" y tu edad "+edad+" tu IMC es "+imc+" debes adelgazar.");
		}
		
	}
	
}
