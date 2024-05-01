package Tema_3;

import java.util.Scanner;

public class ejercicio_figuras_con_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Di el tamaño de tu cuadrado");
		int base = sc.nextInt();
		sc.close();
		int contador= 0;
		for(int filas= 0; filas < base; filas++) {
			for(int col=0; col<base; col++) {
				contador++;
				System.out.print(contador+" ");
			}
			System.out.println();
		}
	}

}
