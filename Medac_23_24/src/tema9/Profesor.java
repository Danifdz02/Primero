package tema9;

public class Profesor extends Persona{ 	//Herede de persona

	int codProfesor;
	int experiencia;
	
	//Crear el constructor vacio
	
	public Profesor () {
		super();
		this.codProfesor = 0;
		this.experiencia = 0;
	}
	
	//Crear el constructor con todos los parámetros
	
	public Profesor (String nombre, String apellido, int edad, int codProfesor, int experiencia) {
		super (nombre, apellido, edad);
		this.codProfesor = codProfesor;
		this.experiencia = experiencia;
	}
	
	//Sobrescribir el metodo toString
	
	@Override
	public String toString () {
		String cadena = super.toString()+"\nEres profesor y tienes el cod "+this.codProfesor+" y "+this.experiencia+" años trabajados.";
		return cadena;
	}
}
