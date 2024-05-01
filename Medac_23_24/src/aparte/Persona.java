package aparte;

public class Persona {

//primero he creado todos los constructores que vamos a utilizar
private	String dni;
private	String nombre;
private	String apellidos;
private	int edad;
private	double [] sueldosMensuales;
static final int mayorEdad = 18;
	
	//Creamos el constructor por defecto
	public Persona() {
		this.dni="No especificado";
		this.nombre="No especificado";
		this.apellidos="No especificado";
		this.edad=0;

	}
	//Constructor con todos los parametros
	public Persona(String dni, String nombre, String apellidos,int edad, double[] sueldosMensuales) { 
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.sueldosMensuales = sueldosMensuales;
	}
	//A partir de aqui creamos todos los set/get necesarios
	
	public String getDni() {
		return this.dni;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre () {
		return this.nombre;
		
	}
	
	public void setApellidos (String apellidos) {
		this.apellidos=apellidos;
	}
	
	public String getApellidos () {
		return this.apellidos;
	}
	
	public void setEdad (int edad) {
		this.edad=edad;
	}
	
	public int getEdad () {
		return this.edad;
	}
	
	public double[] getSueldosMensuales() {
       return this.sueldosMensuales;
	}
	//Metodo para mostrar la presentacion de la persona
	public void presentacion (String presentacion) { //En la presentacion recogemos todos los datos que hemos aportado con los get/set anteriores
		System.out.println("Su DNI es "+dni+", su nombre es "+nombre+", sus apellidos son "+apellidos+" y su edad es "+edad);
	}
	//En este metodo para saber si es mayor de edad he usado el if/else, he creado un valor entero mayoredad=18 al principio del codigo para realizar el if aunque no es necesario.
	public boolean esMayorEdad () {
		return edad >= mayorEdad;
	}
	//Este metodo es igual que el anterior pero en este caso no he creado ningun valor entero para la edad de jubilado, simplemente he puesto la edad (65) a mano.
	public boolean esJubilado() {
		return edad >= 65;
	}
	//para calcular la diferencia de edad simplemente he creado un entero static final ya que lo pedia al final del ejercicio, el cual me hace la resta del this.persona que seria 
	//la persona la cual hemos dado valor y luego el p.getEdad coge la edad de la persona que querramos utilizar, esta se pondria entre parentesis, el ejemplo seria asi p3.diferenciaEdad(p2);

	public int diferenciaEdad(Persona p) {
		int diferenciaEdad = (this.edad-p.getEdad());
		System.out.println("La diferencia de edad es de "+diferenciaEdad+" años.");
		return diferenciaEdad;
	}
	
	public double calcularTotalSalarios() {		//para calcular los sueldos, al ser un array utilizamos el bucle for para que no nos de problemas
		double totalsalario = 0;				//creo una variable que va a ser la que recoga el total de los salarios
		for (double i = 0; i<sueldosMensuales; i++) {			//en este paso tenemos que pasarle los valores del array a una variable double, en este caso a la variable sumasueldos 
            totalsalario += sueldosMensuales[i].getSueldosMensuales;						//le estamos pasando los valores del array para que estos se sumen en esta ultima linea de codigo.
		}
		System.out.println("El total del salario es de "+totalsalario+" €.");
		return totalsalario;				//retornamos el valor de la variable totalsalario para mostrarnos la suma final.
	}
	
	public double calcularDiferenciaSalario(Persona p) { //para calcular la diferencia en los salarios deberiamos de saber el total de los salarios de cada persona,
														 // por lo tanto habria que sumar todos los salarios y conocer la media de cada uno, y ya de ahí restar ambas medias y saldria la diferencia de los salarios
		double mediapersonaX = (calcularTotalSalarios() / sueldosMensuales.length); //aqui calculamos la media del sueldo de una persona "x"
		double mediapersonaP = (calcularTotalSalarios() / p.sueldosMensuales.length); //aqui calculamos la media del sueldo de la persona P
		return Math.abs(mediapersonaX - mediapersonaP); 
	}
	
	public static boolean validarDNI(String dni) { 
		
		if (dni.length()!= 9) { //primero verificamos que tenga 9 caracteres el dni, si no los tiene ya comprueba que seria falso.
    		System.out.println("ERROR EN EL DNI");
			return false;
		}
		//para comprobar que los 9 primeros caracteres son numeros debemos utilizar un for
		for (int i = 0; i <= 9; i++) { //con este for leeremos los primeros 9 digitos
            if (!Character.isDigit(dni.charAt(i))) { //Este if lo que hace con el metodo Character.isDigit() leer que los caracteres sean numericos,
            										//por lo tanto pongo la exclamacion para que si no son numericos lo de como falso, 
            										//por ultimo el dni.charAt(i) lo que hace es coger mi constructor dni en este caso, y el metodo de java .charAt(i) lo que hace es leer el caracter i, la i gracias al for lee desde la posicion 1 hasta la 8
        		System.out.println("ERROR EN EL DNI");
            	return false; 
            }
        }
		char dniletra = dni.charAt(9); //en este caso creamos un char llamado dniletra y le vamos a dar el valor de la posicion 8 del dni
		System.out.println("DNI valido");
		return Character.isLetter(dniletra); //si el valor que ha cogido de la posicion 8 no es una letra, con el metodo Character.isLetter nos dará falso si no es una letra y verdadero si lo es
	}
	
}
