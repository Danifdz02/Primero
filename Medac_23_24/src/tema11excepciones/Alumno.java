package medacformacion.excepciones.resuelto;

public class Alumno {

	private String nombre;
	private String apellido;
	private Integer anyos;
	
	public Alumno() {}
	
	public Alumno(String nombre) {
		this(nombre, null, null);
	}
	
	public Alumno(String nombre, String apellido, Integer anyos) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.anyos = anyos;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getAnyos() {
		return anyos;
	}

	/**
	 * Método para setear los años del alumno
	 * @param anyos
	 * @throws CustomException cuando la edad es menor de 18 años 
	 * @throws NullPointerException cuando el parámetro  es nulo
	 */
	public void setAnyos(Integer anyos) throws CustomException, NullPointerException {
		
		if(anyos==null) {
			throw new NullPointerException("La edad no puede ser nula");
		}
		
		if(anyos < 18) {
			throw new CustomException("La edad no puede ser menor a 18 años");
		}
		
		this.anyos = anyos;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", anyos=" + anyos + "]";
	}
	
}