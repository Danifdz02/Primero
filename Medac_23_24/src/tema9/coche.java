package tema9;

public class coche extends vehiculo {

	public String tipoCoche;
	public String marca;
	
	public coche () {
		super();
		this.tipoCoche = "";
		this.marca = "";
	}
	
	public coche (String tipoCoche, String marca, String paisVehiculo, double peso) {
		super(paisVehiculo, peso);
		this.tipoCoche = tipoCoche;
		this.marca = marca;
	}
	@Override
	public void mostrarTipoVehiculo () {
		System.out.println("Soy una coche. \nCobrar peaje coche.");
	}
	
	public void datosCoche(String tipoCoche, String marca) {
		System.out.println("El coche es un "+tipoCoche+" su marca es "+marca
				+" el peso es "+super.getPeso()+" y del pais "+super.getpaisVehiculo());
	}
	
}
