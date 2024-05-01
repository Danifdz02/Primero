package Tema8_2trimestre;

public class MainUDAlmeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Este seria por defecto sin añadirle ningun valor
		UDAlmeria f1 = new UDAlmeria();
		System.out.println(f1.toString());
		
		System.out.println("------------------------------------------------------------------------------------");

		//Aqui he añadido los valores del constructor con todos los atributos
		UDAlmeria f2 = new UDAlmeria ("Robertone", 55, 18000, false);
		System.out.println(f2.toString());
		System.out.println(f2.mensajeActivo());
		
		System.out.println("------------------------------------------------------------------------------------");

		//En este caso añado dos valores del constructor con parametros numericos, en este caso la edad y el salario mensual
		UDAlmeria f3 = new UDAlmeria(25, 45000);
		System.out.println(f3.toString());
		System.out.println("El salario mensual con la suma del bono salario es de "+f3.Decimal());
		System.out.println("El salario anual es de "+f3.operacionSalarioAnual());
		System.out.println(f3.mensajeActivo());
		System.out.println(f3.equals(f2));
		
		System.out.println("------------------------------------------------------------------------------------");

		//Este Syso sirve para que aparezca mi mensaje hecho en el metodo estatico
		System.out.print(estatico());
	}
	//Aqui he creado el metodo estatico que se pide en el main, lo he hecho con String para que aparezca un mensaje
	public static String estatico() {
		String estatico = "Este es mi metodo";
		return estatico;
	}
	
}
