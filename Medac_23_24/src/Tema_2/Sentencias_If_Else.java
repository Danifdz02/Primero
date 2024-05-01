package Tema_2;

public class Sentencias_If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 18;
		if(n1 >= 18) {
			System.out.println("Eres mayor de edad");
		} 
		if (n1 < 18) {
			System.out.println("Eres menor de edad");
		}
		//else { puede hacerse con ELSE que quiere decir el contrario de IF
		//	System.out.println("Eres menor de edad");
		//}
		if (n1 >=18 && n1 <= 100) {
			System.out.println("Eres mayor de edad y menor de 100");
		}
	}

}
