package tema9;

public class vehiculo {

	private String paisVehiculo;
	private double peso;
	
	public vehiculo () {
		this.paisVehiculo = "";
		this.peso = 0.0;
	}
	
	public vehiculo (String paisVehiculo, double peso) {
		this.paisVehiculo = paisVehiculo;
		this.peso = peso;
	}
	
	public void setpaisVehiculo (String paisVehiculo) {
		this.paisVehiculo=paisVehiculo;
	}
	
	public String getpaisVehiculo () {
		return this.paisVehiculo;
	}
	
	public void setPeso (double peso) {
		this.peso = peso;
		
	}
	
	public double getPeso () {
		return this.peso;
		
	}
	
	public void mostrarTipoVehiculo () {
		System.out.println("Soy un Vehículo. \nSe le va a cobrar el peaje al vehículo.");
	}
	
	public void mostrarCaracteristicas (String paisVehiculo, double peso) {
		System.out.println("Soy un coche de "+this.paisVehiculo+" y tengo un peso de "+this.peso+" kg.");
	}
}
