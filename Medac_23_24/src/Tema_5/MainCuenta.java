package Tema_5;

public class MainCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1= new Cuenta("Pepe");
		System.out.println(c1.toString());
		c1.ingresar(100.99);
		Cuenta c2 = new Cuenta("Jose", 766);
		System.out.println(c2.toString());
	}

}
