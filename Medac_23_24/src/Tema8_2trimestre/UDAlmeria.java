package Tema8_2trimestre;

public class UDAlmeria {
	
//primero he creado todos los constructores 
	
	private String Futbolista;
	private int edad;
	private double salario;
	private static int contador=0; //static ya que este va a ir variando
	private boolean booleano;
	private static final int edadretirada=37; //static final ya que el valor de este no va a variar
	
	
//Creamos el constructor por defecto
	
	public UDAlmeria() {
		this.Futbolista="Nombre no especificado.";
		this.edad=0;
		this.salario=0;
		this.booleano=false;
		contador++;
	}
	
//Creamos el constructor con los parámetros numéricos
	public UDAlmeria(int edad, double salario ) {
		this.edad=edad;
		this.salario=salario;
		contador++;
	}
//constructor con todos los atributos como parámetros menos el contador
	public UDAlmeria(String Futbolista, int edad, double salario, boolean booleano) {
		this.Futbolista=Futbolista;
		this.edad=edad;
		this.salario=salario;
		this.booleano=booleano;
		
	}

//creamos todos los getters, setters y toString
	public void setFutbolista (String Futbolista) {
		this.Futbolista=Futbolista;
	}
	
	public String getFutbolista () {
		return this.Futbolista;
		
	}
	
	public void setEdad (int edad) {
		this.edad=edad;
	}
	
	public int getEdad () {
		return this.edad;
		
	}
	
	public void setSalario (double salario) {
		this.salario=salario;
	}
	
	public double getSalario () {
		return this.salario;
	}
	
	public void setBooleano (boolean booleano) {
		this.booleano=booleano;
	}
	
	public boolean getBooleano () {
		return this.booleano;
	}
	
	@Override
	public String toString () {
		String cadena = "El nombre del futbolista es "+this.Futbolista+" su edad "
				+ "es "+this.edad+" su salario es "+this.salario;
		return cadena;
	}
	
//Metodo que devuelve un decimal
	public double Decimal () {
		double bonosalario = 254.69;
		double Decimal = this.salario+bonosalario;
		return Decimal;
	}
	
//Metodo que devuelve un String y contiene un if-else
	public String mensajeActivo() {
		if(this.edad >edadretirada) {
			return "Está retirado.";
		}else {
			return "No está retirado.";
		}
	}
	
//Metodo que calcule algo haciendo uso del primero
	public double operacionSalarioAnual () {
		double operacionSalarioAnual = 12*this.Decimal();
		return operacionSalarioAnual;
	}
	
//El metodo equals sirve para comprobar si dos objetos son iguales, este nos devuelve un dato de tipo boolean
// Por defecto, compara referencias de objetos, pero al sobrescribirlo, puedes realizar comparaciones personalizadas.
//Facilita la comparación de objetos complejos, como en aplicaciones de 
//gestión de datos o sistemas que requieren comparaciones personalizadas.

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UDAlmeria other = (UDAlmeria) obj;
		if (Futbolista == null) {
			if (other.Futbolista != null)
				return false;
		} else if (!Futbolista.equals(other.Futbolista))
			return false;
		if (edad != other.edad)
			return false;
		return true;
	}


}

