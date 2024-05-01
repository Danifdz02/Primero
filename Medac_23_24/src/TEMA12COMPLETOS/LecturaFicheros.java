package Tema12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheros {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Usuario\\Desktop\\LECTURA.TXT");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		String cadena="";
		while((linea =br.readLine()) != null) {
			//System.out.println(linea);
			cadena += linea+"\n";
		}
		System.out.println(cadena);
		br.close();
		fr.close();
		//System.out.println(f.exists());

	}

}
