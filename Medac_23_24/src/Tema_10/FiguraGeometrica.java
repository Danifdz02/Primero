package Tema_10;

public abstract class FiguraGeometrica {

	private String color;
	
	public FiguraGeometrica() {
		this.color = "";
	}
	
	public FiguraGeometrica (String color) {
		this.color = color;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	@Override
	public String toString () {
		return "El color de la figura es "+this.color;
	}
	
	public abstract float getPerimetro ();
	
	public abstract float getArea();
	
}
