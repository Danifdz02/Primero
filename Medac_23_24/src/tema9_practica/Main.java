package tema9_practica;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear instancias de las clases
		
		Estudiante estudiante = new Estudiante("Juan", "Calle Almería", "612345678",
				"juan@gmail.com", "Grado");
		Profesor profesor = new Profesor("Carlos", "Calle Paseo", "987654321",
				"carlos@gmail.com", "Despacho 1", 50000.0, new GregorianCalendar(2022, 0, 1), "Lunes 10-12", "Catedrático");
		Administrativo administrativo = new Administrativo("Ana", "Calle Cádiz", "555555555",
				"ana@gmail.com", "Despacho 2",
				35000.0, new GregorianCalendar(2022, 0, 1), "Unidad 1");
		
		// Utilizar los métodos de las clases
		
		estudiante.saludar();
		
		profesor.saludar();
		
		administrativo.saludar();
		
		estudiante.presentarse();
		
		profesor.presentarse();
		
		administrativo.presentarse();
		
		administrativo.toString();
		}
}

