package Tema_1;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear dos variables numericas
		//sumarlas
		//restarlas
		//dividirlas
		//multiplicarlas
		//sacar el resto de num1/num2
		double num2 = 2;
		double num3 = 3;
		System.out.println(num2+num3);
		System.out.println(num2-num3);
		System.out.println(num2/num3);
		System.out.println(num2*num3);
		System.out.println(num2%num3);
		///////Tambien se puede hacer asi
		double suma = num2+num3;
		System.out.println("La suma de "+num2+" + "+num3+" es "+suma);
		///y tambien asi
		System.out.println("La suma de "+num2+" + "+num3+" es "+(num2+num3));
	}

}
