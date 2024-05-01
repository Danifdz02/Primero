package tema9_practica;

import java.util.GregorianCalendar; //Vuelvo a importar GregorianCalendar

public class Profesor extends Empleado{ //Esta subclase hereda de Empleado

	//Creo los dos nuevos atributos necesarios para profesor
	String horarioTutorias;
	String categoria;

	//Creo el constructor vacío que incluye los atributos de la clase Empleado y muy importante tambien los de la clase Persona
	public Profesor (String nombre, String direccion, String telefono, String correoElectronico, 
			String despacho, double salario, GregorianCalendar fechacontratacion) {
		super (nombre, direccion, telefono, correoElectronico, despacho, salario, fechacontratacion);
		this.horarioTutorias = "";
		this.categoria="";
	}
	
	//Creo el constructor con los valores ya definidos, estos atributos deben de seguir siempre el mismo orden sino fallará
	public Profesor(String nombre, String direccion, String telefono, String correoElectronico, String despacho, double salario, 
			GregorianCalendar fechacontratacion, String horarioTutorias, String categoria) {
		super (nombre, direccion, telefono, correoElectronico, despacho, salario, fechacontratacion);
		this.horarioTutorias = horarioTutorias;
		this.categoria = categoria;
	}
	
	//Creo los getter & setter necesarios
	public String getHorarioTutorias() {
        return this.horarioTutorias;
    }

    public void setHorarioTutorias(String horarioTutorias) {
        this.horarioTutorias = horarioTutorias;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    //Override necesario para sobreescribir el saludo, en este caso es el saludo al ser profesor
    @Override
    public void saludar () {
		System.out.println("Hola, soy un Empleado.");
	}
    
    //Override que sobreescribe la presentacion, en este caso es el saludo que mostrará al ser profesor
	@Override
	public void presentarse () {
		System.out.println("Me llamo "+this.nombre+". Soy un profesor de "+this.categoria);
	}
	//Este override sobreescribirá al por defecto en caso de que lo llamen
    @Override
    public String toString() {
        return super.toString() + "Soy un profesor. Mi horario es " + horarioTutorias + " y mi categoria es " + categoria;
    }
	
}
