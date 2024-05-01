package tema9_practica;

public class Estudiante extends Persona{ //Primer paso heredar de la clase Persona con el codigo "extends"

	//creo el unico atributo adicional de la clase, en este caso nivel.
	public String nivel;
	
	//Creo el constructor vacío
	public Estudiante () {
		super();
		this.nivel="";
	}
	//Creo el constructor con los parámetros de la clase padre más la adicional.
	public Estudiante (String nombre, String direccion, String telefono, String correoElectronico, String nivel) {
		super(nombre, direccion, telefono, correoElectronico);
		this.nivel = nivel;
		
	}
	//Añado los getters & setter necesarios
	public String getNivel () {
		return this.nivel;
	}
	
	public void setNivel (String nivel) {
		this.nivel = nivel;
	}
	//Creo el syso del saludo que hará al ser el estudiante una persona.
	public void saludar () {
		System.out.println("Hola, soy una Persona.");
	}
	//Creo el syso de presentacion al ser un estudiante.
	public void presentarse () {
		System.out.println("Me llamo "+this.nombre+". Soy un estudiante de "+this.nivel);
	}
	//Syso del toString que sobreescribirá en el caso de solicitarlo al de la clase padre.
	@Override
    public String toString() {
        return super.toString() + "Soy un Estudiante de "+this.nivel;
    }
	
}
