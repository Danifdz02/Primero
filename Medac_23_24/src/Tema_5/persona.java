package Tema_5;

public class persona {

	//Primero definimos los atributos
	String nombre;
	int edad;
	private double peso;
	double estatura;
	
	//Creamos el constructor por defecto
	
	public persona () {
		this.nombre = "Sin nombre asignado";
		this.edad = 0;
		this.setPeso(0.0);
		this.estatura = 0.0;
	}
	//Constructor con todos los parametros
	
	public persona (String nombre, int años, double peso, double tamaño) { //no hace falta que los valores se llamen igual que arriba
		this.nombre = nombre;
		this.edad = años;
		this.setPeso(peso);
		this.estatura = tamaño;
		
	}

	//Metodo mostrar caracteristicas persona
	public void mostrarInformacionPersona() {
		System.out.println("El nombre es "+this.nombre+" su edad es "+this.edad+" el peso es "+this.getPeso()+
				" y la estatura "+this.estatura);
		
		
	}
	//Calcular IMC = Peso (kg) / Estatura al cuadrado (Mt).
	public double calcularIMC() {
		double imc = (getPeso()/Math.pow(estatura, 2));
		System.out.println("El IMC de "+this.nombre+" es de "+imc);

		return imc; //siempre return en estos casos para que nos lo devuelva el resultado
		
	}
	public persona (persona copiapersona) { //para copiar la clase persona, podemos llamarlo de cualquier forma
		this.nombre = copiapersona.nombre;
		this.edad = copiapersona.edad;
		this.setPeso(copiapersona.getPeso());
		this.estatura = copiapersona.estatura;
		
	}

	double getPeso() {
		return peso;
	}

	void setPeso(double peso) {
		this.peso = peso;
	}

}
