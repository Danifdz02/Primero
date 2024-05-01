package tema9;

public class moto extends vehiculo{

	public moto () {
		super();
	}
	
	public moto (String paisVehiculo, double peso) {
		super (paisVehiculo, peso);
	}
	@Override
	public void mostrarTipoVehiculo () {
		System.out.println("Soy una moto. \nCobrar peaje moto.");
	}
}
