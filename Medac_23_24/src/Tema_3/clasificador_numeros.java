package Tema_3;

import java.util.Scanner;

public class clasificador_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que solicite 5 numeros al usuario (usando for y while)
		//Al final debe mostrar el recuentos de numeros positivos
		//Ceros y numeros negativos
		
		Scanner sc =new Scanner(System.in);
		int contPositivos = 0, contNegativos = 0, contCeros = 0;
		int numerosLeidos=1;
		while(numerosLeidos <=5) {
			System.out.println("Introduzca el num "+numerosLeidos);
			int numero = sc.nextInt();
			numerosLeidos++;
			if(numero>0) {
				contPositivos++;
				System.out.println("Se lee un numero positivo.");
			}else if(numero ==0 ){
				contCeros++;
				System.out.println("Se lee un 0.");
			}else {
				contNegativos++;
				System.out.println("Se lee un numero negativo");
			}
		}
		sc.close();
		System.out.println("Hay "+contPositivos+" numeros positivos, "+contNegativos
				+" numeros negativos y el resto ceros "+contCeros);
		
		
		
		
	}

}
