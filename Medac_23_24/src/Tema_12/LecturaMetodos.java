package Tema_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import aparte.Persona;

public class LecturaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SIN ACABAR
		public boolean abrirFichero(String ruta) {
		File f = new File (ruta);
		if(f.exists()) {
			
		}
			
		public void escribirPersonas (String ruta, Persona p) throws IOException {
			String cad = leerFichero (ruta);
			File f = new File (ruta);
			FileWriter fw = new FileWriter (f);
			PrintWriter pw = new PrintWriter(fw);
			pw.write(cad);
			pw.write(p.toString());
			pw.close();
			fw.close();
		}
			
		public String leerFichero(String ruta) throws IOException{
			String cadena = "";
			File f = new File(ruta);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea=br.readLine()) !=null) {
				cadena += linea + "\n";
				System.out.println(cadena);
			}
			br.close();
			fr.close();
	}

}
