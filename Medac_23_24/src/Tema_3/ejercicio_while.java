package Tema_3;

public class ejercicio_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imprimir un numero del 1 al 10 usando un bucle
		int contador = 1;
		while(contador <= 10) {
			System.out.println("El numero es "+contador);
			contador= contador+1; // este codigo es igual que contador++
			contador++; 		  // este codigo es igual que contador= contador+1
		}
		//Imprimir los numeros del 10 hasa el 1
		contador = 10;
		while(contador > 0) {
			System.out.println("El numero es "+contador);
			contador--;
		}
			
		//imprimir los numeros pares del 1 al 100
		contador= 1;
		while(contador<=100) {
			if(contador % 2 == 0) {
				System.out.println("Tu numero es "+contador);
			}
			contador++;
		}
	
	}

}
