package Tema_10;

public class Circulo extends FiguraGeometrica {

	private double radio;
	
	public Circulo () {
		super();
		this.radio = 0.0;
	}
	
	public Circulo (double radio, String color) {
		super(color);
		this.radio = radio;
	}

	// Getter & Setter
	@Override
	public String toString () {
		return super.toString() + " la figura es un circulo de radio "+this.radio
				+"\nEl perimetro es "+this.getPerimetro()+" el area es "+this.getArea();
	}
	@Override
	public float getPerimetro() {
		double perimetro = 2*Math.PI*this.radio;
		return (float)perimetro;
	}

	@Override
	public float getArea() {
		
		return (float)(Math.PI*Math.pow(radio, 2));
	}
}
