package Tema_3;

import java.util.Scanner;

public class bucles_2_hecho_con_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Una persona adquirio un producto para pagar en 20 meses. El primer mes pago 10€,
		 * el segundo 20€, el tercero 40€ y asi sucesivamente. Realizar un programa para
		 * determinar cuanto debe pagar mensualmente y el total de lo que pagara despues
		 * de los 20 meses. Este programa puede servir para calcular otras compras
		 * y con diferentes plazos.
		 */
		
		int pagoTotal = 0;
		System.out.println("¿Cual es el pago inicial?");
		Scanner sc = new Scanner(System.in);
		int pagoMensual = sc.nextInt();
		System.out.println("¿Cuantos meses?");
		int meses = sc.nextInt();
		sc.close();
		int contador = 0;
		int pagoMesAnterior = 0;
		for (int i = 0; i < meses; i++) {
			pagoTotal += pagoMensual; //pagoTotal = pagoTotal + pagoMensual
			pagoMesAnterior = pagoMensual;
			pagoMensual = pagoMesAnterior*2;
			contador++;
		}
		System.out.println("El pago total tras "+meses+" es de "+pagoTotal);
		
		
		
		
	}

}
