package aparte;

public class personamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona();
		p1.presentacion(null);
		p1.esMayorEdad();
		p1.esJubilado();
		
		
		
		String dni = "84938473";
		String nombre = "Daniel";
		String apellidos = "Fernandez Muñoz";
		int edad = 21;
		double[]salariosMensuales = {100.10,300.99,500.0};
		Persona p2 = new Persona (dni, nombre, apellidos, edad, salariosMensuales);
		p2.presentacion(null);
		System.out.println("Es mayor de edad? "+p2.esMayorEdad());
		System.out.println("Esta jubilado? "+p2.esJubilado());		
		p2.validarDNI(dni);
		
		Persona p3 = new Persona ("49392733L", "Jose", "Muñoz", 17, null );
		p3.presentacion(null);
		p3.esMayorEdad();
		p3.diferenciaEdad(p2);
		p3.validarDNI(dni);
	}

}
