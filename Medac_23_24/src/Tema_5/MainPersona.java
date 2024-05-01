package Tema_5;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		persona p1 = new persona();
		p1.mostrarInformacionPersona();
		
		persona p2=new persona("Dani", 20, 80, 1.90);
		p2.mostrarInformacionPersona();
		
		String nombre = "Ana";
		int edad= 19;
		double peso= 80;
		double estatura = 1.8;
		persona p3 = new persona(nombre, edad, 75, estatura);
		p3.mostrarInformacionPersona();
		
		
		p2.calcularIMC();
		//System.out.println("El IMC de "+p2.nombre+" es de "+p2.calcularIMC());
	}

}
