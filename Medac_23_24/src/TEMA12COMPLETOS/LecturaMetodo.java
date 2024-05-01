package Tema12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Tema9.Persona;

public class LecturaMetodo {

	public boolean abrirFichero(String ruta) throws IOException {
		File f = new File(ruta);
		if(f.exists()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void escribirPersona(String ruta, Persona p) throws IOException {
		String cad = leerFichero(ruta);
		File f = new File(ruta);
		FileWriter wr = new FileWriter(f);
		PrintWriter pw = new PrintWriter(wr);
		pw.write(cad);
		pw.write(p.toString());
		pw.close();
		wr.close();
	}
	
	public String leerFichero (String ruta) throws IOException {
		String cadena = "";
		File f = new File(ruta);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while((linea = br.readLine()) != null) {
			cadena += linea.split(",");
		}
		br.close();
		return cadena;
		
	}
	
}
