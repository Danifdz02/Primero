package Tema_4;

/**
 * @author daniel
 */
public class arrays {
/**
 * @param args Este parametro recoge el main.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definir un array de enteros de tamaño 5
		//inicializarlo con 1, 5, 7, 6, 1
		//mostrar por pantalla el tamaño del array
		//mostrar por pantalla el indice 2 y el 5.

		double [] array = {1, 5, 7, 6, 1};
		
		System.out.println("El tamaño del array es "+array.length);
		System.out.println("El valor del indice 2 es "+array[2]);
		System.out.println("El valor del indice 5 es "+array[4]);

		//bucle for que sume todos los valores de mi array
		//debe mostrar el total de sumar los 5 indices

		double total= 0;
		for (int i = 0; i<array.length; i++){
		total=total+array[i];
		}
		System.out.println("La suma de todos los valores es "+total);			
		
		
	}

}
