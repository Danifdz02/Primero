package tema9_practica;

public class Persona {
	
	//Creacion de la clase persona, creamos los atributos necesarios
	public String nombre;
	public String direccion;
	public String telefono;
	public String correoElectronico;

	//Creo el constructor vacío
	public Persona() {
		this.nombre = "";
		this.direccion = "";
		this.telefono = "";
		this.correoElectronico = "";
	}
	//Creo el constructor que acepta todos los parámetros
	public Persona (String nombre, String direccion, String telefono, String correoElectronico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}
	//Creacion de todos los getters & setter
	public String getNombre () {
		return this.nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono () {
		return this.telefono;
	}
	
	public void setTelefono (String telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreoElectronico () {
		return this.correoElectronico;
	}
	
	public void setCorreoElectronico (String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	//Creo el syso de saludar el cual en este caso imprime hola, soy + el nombre 
	public void saludar () {
		System.out.println("Hola, soy "+this.nombre+".");
	}
	//Creo el syso de saludar el cual en este caso imprime Me llamo + nombre
	public void presentarse () {
		System.out.println("Me llamo "+this.nombre);
	}
	//Creo el metodo toString con @Override para que más adelante pueda sobreescribirse
	@Override
	public String toString() {
		return "Me llamo "+this.nombre+",  mi telefono es "+this.telefono+" mi direccion es "+this.direccion+
				" y mi correo electronico es "+this.correoElectronico;
	}
	
}