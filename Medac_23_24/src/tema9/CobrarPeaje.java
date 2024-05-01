package tema9;

public class CobrarPeaje {
public static void main(String[] args) {
// TODO Auto-generated method stub

	vehiculo v = new vehiculo();
	v.mostrarTipoVehiculo();
	coche c = new coche();
	c.mostrarTipoVehiculo();
	c.datosCoche("Coupe", "Seat");
	moto m = new moto();
	m.mostrarTipoVehiculo();
	
	}
}
