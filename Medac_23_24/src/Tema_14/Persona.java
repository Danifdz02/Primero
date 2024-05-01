package Tema_14;

public class Persona {

	private String nombre;
	private String apellidos;
	private String genero;
	private int edad;
	
	public Persona () {
		this.nombre="";
		this.apellidos="";
		this.genero="";
		this.edad=0;
	}
	
	public Persona (String nombre, String apellidos, String genero, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.genero=genero;
		this.edad=edad;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos () {
		return this.apellidos;
	}
	
	public void setApellidos (String apellidos) {
		this.apellidos=apellidos;
	}
	public String getGenero () {
		return this.genero;
	}
	
	public void setGenero (String genero) {
		this.genero=genero;
	}
	public int getEdad () {
		return this.edad;
	}
	
	public void setEdad (int edad) {
		this.edad=edad;
	}
	public String toString() {
		return "Persona nombre"+nombre+" apellido "+apellidos+" genero "+genero+" edad "+edad;
	}
}
