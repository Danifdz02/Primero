package Tema_2;

import java.util.Scanner;

public class Ejercicio_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer un programa que pida guardar dos numeros por pantalla
		//Imprima su num1 elevado a num2
		//La raiz cuadrada de la suma de ambos num
		//Redondear la division de num1 / num2
		//Decir el minimo
		//System.out.println(Math.sqrt());
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un primer numero: ");
		double num1 = sc.nextDouble();
		System.out.println("primer numero introducido correctamente, ahora introduce un segundo numero: ");
		double num2 = sc.nextDouble();
		System.out.println("Tus números introducidos son "+num1+" y "+num2);
		
		System.out.println("El resultado al elevar "+num1+" y "+num2+" es: "+Math.pow(num1,num2));
		
		double suma = (num1 + num2);
		System.out.println("La raiz cuadrada de la suma de ambos numero es: "+Math.sqrt(suma));
		System.out.println("El redondeo de tu division entre "+num1+" y "+num2+" es: "+Math.round(num1/num2));
		System.out.println("El mínimo entre tus numeros es: "+Math.min(num1, num2));
		
	}

}
