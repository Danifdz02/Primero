package tema9_practica;
import java.util.GregorianCalendar; //Importamos el GregorianCalendar necesario para el calendario
public class Empleado extends Persona { //Heredamos de la clase Persona

	//Creamos los nuevos atributos de empleado
	String despacho;
	double salario;
	GregorianCalendar fechacontratacion;
	//Creo estos tres nuevos atributos para el calendario Gregorian
	int año;
	int mes;
	int dia;
	
	//Creo el primer constructor con los parámetros sin definir e incluyo los atributos de la clase padre
	public Empleado (String nombre, String direccion, String telefono, String correoElectronico) {
		super(nombre, direccion, telefono, correoElectronico);
		this.despacho = "";
		this.salario = 0.0;
		this.fechacontratacion = new GregorianCalendar(); //Creo un nuevo GregorianCalendar con el nombre fechacontratacion 
		año = fechacontratacion.get(GregorianCalendar.YEAR); //Al atributo creado al principio de la clase le doy el valor de año
		mes = fechacontratacion.get(GregorianCalendar.MONTH); //Doy el valor de mes
		dia = fechacontratacion.get(GregorianCalendar.DAY_OF_MONTH); //Doy el valor de dia

	}
	//Creo el constructor con los parámetros ya definidos
	public Empleado (String nombre, String direccion, String telefono, String correoElectronico, 
			String despacho, double salario, GregorianCalendar fechacontratacion) {
		super(nombre, direccion, telefono, correoElectronico);	
		this.despacho=despacho;
		this.salario=salario;
		this.fechacontratacion= fechacontratacion;
	}
	//Creacion de los getters & setters necesarios
	public String getDespacho() {
        return this.despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public GregorianCalendar getFechaContratacion() {
        return this.fechacontratacion;
    }

    public void setFechaContratacion(GregorianCalendar fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }
    //Incluyo los getters de los atributos que cree para el GregorianCalendar, no necesitan setters
    public int getMes () {
    	return mes;
    }
    
    public int getAño () {
    	return año;
    }
    
    public int getDia () {
    	return dia;
    }
    //Este override sobreescribirá el saludo por defecto de la clase Persona
    @Override
    public void saludar () {
		System.out.println("Hola, soy "+this.nombre+".");
	}
    //Este override sobreescribirá la presentacion por defecto de la clase Persona
	@Override
	public void presentarse () {
		System.out.println("Me llamo "+this.nombre);
	}
	//Este seria el syso del toString en caso de que se solicitase, incluye el uso de gregorian calendar
    @Override
    public String toString() {
        return super.toString() + "Soy un empleado en el despacho " + despacho + ", mi salario es " + this.salario +
                " y mi fecha de contratacion es " + this.getAño()+ "/"+this.getMes()+"/"+this.getDia();
    }
    
}
