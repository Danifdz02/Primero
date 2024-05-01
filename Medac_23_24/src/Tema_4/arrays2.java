package Tema_4;

import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir un numero de elementos
		//inicializar un array de ese tamaño pidiendo los numeros por pantalla
		//crear un metodo mediaArray(double [] array) -> debe devolver la media
		//llamar a ese metodo en el main con el array creado
	}
	public static double mediaArray(double[]array) {
		Scanner sc=new Scanner(System.in);
		double [] arrayy=new double[5];
		double suma=0;
		System.out.println("Introduce el valor del primer indice:");
		arrayy[0]=sc.nextDouble();
		System.out.println("Introduce el valor del segundo indice:");
		arrayy[1]=sc.nextDouble();
		System.out.println("Introduce el valor del tercer indice:");
		arrayy[2]=sc.nextDouble();
		System.out.println("Introduce el valor del cuarto indice:");
		arrayy[3]=sc.nextDouble();
		System.out.println("Introduce el valor del quinto indice:");
		arrayy[4]=sc.nextDouble();
		for(int i= 0;i < arrayy.length;i++) {
			suma += arrayy[i];
		}
		double media= suma/arrayy.length;
		return media;
	}	
		
	

}
