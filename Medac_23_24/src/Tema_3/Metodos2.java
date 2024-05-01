package Tema_3;

public class Metodos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Al crear un programa con un metodo llamado tusDatos
		//al que le demos los datos nombre edad peso
		//devuelva una cadena Hola (nombre) tu IMC es (IMC) IMC=peso/(altura)^2
		
		String datosIMC_Personal = resultado("Jose", 30, 70, 1.80);
		System.out.println(datosIMC_Personal);
		
	}
	
	public static String resultado(String nombre,int edad, double peso, double altura){
		double IMC= (peso/(altura*altura)); //El elevado tambien se haria así Math.pow(altura, 2)
		String cadena = "Hola "+nombre+" tu IMC es "+IMC;
		//llamada al metodo calcularIMC(...)
		//if else para componer la cadena
		return cadena;
	}
	

}
		
	
	

