package Tema_3;

public class Ejercicio_DO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir los numeros del 10 hasa el 1
		int contador=10;
		do {
			System.out.println("El numero es "+contador);
			contador --;
		} while (contador > 0);
		//imprimir los numeros pares del 1 al 100
		contador= 1;
		do {
			if(contador % 2 == 0) {
				System.out.println("El numero es "+contador);
			}
			contador++;
		}while(contador <= 100);
	}

}
