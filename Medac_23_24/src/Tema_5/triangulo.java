package Tema_5;

public class triangulo {
	
	//Primero definimos los atributos
		private double base = 0.0;
		private double altura = 0.0;
		private double area = 0.0;
			
	//Creamos el constructor por defecto		
		public triangulo () {
			this.base = 0.0;
			this.altura = 0.0;
			this.area = 0.0;
	}
	
	private void calcularArea() {
		this.area = (this.base*this.altura)/2;
		System.out.println("El area del triangulo es "+this.area);
			
	}
	public double getBase() {
		return this.base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public double getArea() {
		calcularArea();
		return this.area;
	}
	
	public void setBase (double value) {
		this.base = value;
	}
	public void setAltura (double value) {
		this.altura = value;
	}
	public void setArea (double value) {
		this.area = value;
	}
	public void mostrarInfo () {
		calcularArea();
		System.out.println("El triangulo con base "+this.base+" altura "+this.altura+" su area es "+this.area);
	}
	
}