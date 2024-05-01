package Tema_5;

public class Cuenta {

	private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }
    
    public Cuenta(String titular, double dinero) {
    	this.titular = titular;
    	this.cantidad = dinero;
    }
    
    public void setTitular(String nombre) {
    	this.titular=nombre;
    }
    public String getTitular() {
    	return this.titular;
    }
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public double getCantidad() {
		return this.cantidad;
	}
	public String toString() {
		String cadena = "El titular es "+this.titular+" con un saldo de "+this.cantidad;
		return cadena;
	}
	public void ingresar (double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
			System.out.println("Ha ingresado "+cantidad+" su saldo es "+this.cantidad);
		}else {
			System.out.println("La cantidad debe de ser mayor a 0");
		}
	}
	public void retirar (double dineroSacar) {
		if (dineroSacar <= this.cantidad) {
			this.cantidad -= dineroSacar; // ponemos -= por que queremos restar la cantidad que sacamos
			System.out.println("Ha sacado "+dineroSacar+" su saldo actual es de "+this.cantidad);
		}else {
			System.out.println("Saldo superado.");
			System.out.println("Se saca cantidad "+this.cantidad+" su cuenta esta a 0");
			this.cantidad = 0;

		} 
	}
}
