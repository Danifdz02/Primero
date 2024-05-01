package medacformacion.excepciones.resuelto;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Pepe");
		
		try {
			System.out.println(12/0);
		}catch(ArithmeticException e) {
			System.out.println("Ha ocurrido una excepción al realizar la división");
		}
		
		try {	
			if(alumno1.getAnyos() > 18) {
				System.out.println(alumno1.getNombre() + "Tiene más de 18 años");
			}
		}catch(NullPointerException e) {
			System.out.println("Se ha producido una excepción al obtener la edad del alumno " + alumno1);
			System.out.println(e.getMessage());
		}
		
		try {
			alumno1.setAnyos(15);
		}catch(NullPointerException | CustomException e) {
			System.out.println("Se ha producido una excepción");
			System.out.println(e.getMessage());
		} 
		
		try {
			alumno1.setAnyos(null);
		}catch(NullPointerException | CustomException e) {
			System.out.println("Se ha producido una excepción");
			System.out.println(e.getMessage());
		} 
		
		try {
			alumno1.setAnyos(null);
		}catch(NullPointerException | CustomException e) {
			if(e instanceof NullPointerException) {
				System.out.println("Se ha producido una excepción null pointer");
			}
		} 
		
	}
}