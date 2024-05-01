package aparte;

public class xxxxxxxxxxxxxxxx {

	    private final String dni;
	    private final String nombre;
	    private final String apellidos;
	    private final int edad;
	    private final double[] sueldosMensuales;
	    private static final int mayoriaEdad = 18;

	    public xxxxxxxxxxxxxxxx(String dni, String nombre, String apellidos, int edad, double[] sueldosMensuales) {
	        if (validarDNI(dni)) {
	            this.dni = dni;
	            this.nombre = nombre;
	            this.apellidos = apellidos;
	            this.edad = edad;
	            this.sueldosMensuales = sueldosMensuales;
	        } else {
	            System.out.println("Error: DNI no válido.");
	            this.dni = null;
	            this.nombre = null;
	            this.apellidos = null;
	            this.edad = 0;
	            this.sueldosMensuales = null;
	        }
	    }

	    public String getDni() {
	        return dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public double[] getSueldosMensuales() {
	        return sueldosMensuales;
	    }

	    public void presentacion() {
	        System.out.println("DNI: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad);
	    }

	    public boolean esMayorEdad() {
	        return edad >= mayoriaEdad;
	    }
	    public boolean esJubilado() {
	        return edad >= 65;
	    }

	    public int diferenciaEdad(Persona p) {
	        return Math.abs(this.edad - p.getEdad());
	    }

	    public double calcularTotalSalarios() {
	        double total = 0;
	        for (double sueldo : sueldosMensuales) {
	            total += sueldo;
	        }
	        return total;
	    }

	    public double calcularDiferenciaSalario(xxxxxxxxxxxxxxxx p) {
	        double mediaThis = calcularTotalSalarios() / sueldosMensuales.length;
	        double mediaP = p.calcularTotalSalarios() / p.getSueldosMensuales().length;
	        return Math.abs(mediaThis - mediaP);
	    }

	    public static boolean validarDNI(String dni) {
	        return dni.matches("\\d{8}[a-zA-Z]");
	    }
	}

	

