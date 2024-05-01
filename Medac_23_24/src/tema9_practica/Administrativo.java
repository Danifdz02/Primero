package tema9_practica;

import java.util.GregorianCalendar; //Volvemos a importar GregorianCalendar

public class Administrativo extends Empleado { //Heredamos la clase Empleado

	//Creamos el nuevo atributo solicitado
	private String unidadDestino;

	//Creo el constructor vacío heredando los atributos de persona y empleado, estos añadidos en el super
    public Administrativo(String nombre, String direccion, String telefono, String correoElectronico, 
			String despacho, double salario, GregorianCalendar fechacontratacion) {  	
		super (nombre, direccion, telefono, correoElectronico, despacho, salario, fechacontratacion);
		this.unidadDestino = "";
    }
    //Creo el constructor con los atributos ya definidos, tambien se añaden los atributos de persona y empleado.
    public Administrativo(String nombre, String direccion, String telefono, String correoElectronico, String despacho, 
    		double salario, GregorianCalendar fechacontratacion, String unidadDestino) {
    	super (nombre, direccion, telefono, correoElectronico, despacho, salario, fechacontratacion);
        this.unidadDestino = unidadDestino;
    }
    //Creo getter & setter del nuevo atributo
    public String getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(String unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    
    //Override para sobreescribir el syso de saludo en caso de ser empleado
    @Override
    public void saludar () {
		System.out.println("Hola, soy un Empleado.");
	}
    
    //Override para sobreescribir el syso de presentación en caso de ser empleado
	@Override
	public void presentarse () {
		System.out.println("Me llamo "+this.nombre+". Soy un administrativo de "+this.unidadDestino);
	}
	
    //Override para sobreescribir el syso de toString con el mensaje en caso de que sea solicitado
    @Override
    public String toString() {
        return super.toString() + "Soy un administrativo y mi unidad de destino es "+this.unidadDestino;
    }
}
