package Tema12;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class LecturaFicherosAvanzada {

	private static final Integer Intenger = null;
	public static void main(String[] args) throws IOException {
		
		/*
		File f = new File("C:\\Users\\Usuario\\Desktop\\Prueba.csv");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		br.close();
		fr.close();
		*/
		System.out.println(nFilas("C:\\Users\\Usuario\\Desktop\\Prueba.csv"));
		System.out.println(nColumnas("C:\\Users\\Usuario\\Desktop\\Prueba.csv"));
		datosSeparados("C:\\Users\\Usuario\\Desktop\\Prueba.csv");
		valoresB("C:\\Users\\Usuario\\Desktop\\Prueba.csv");
		cabecera("C:\\Users\\Usuario\\Desktop\\Prueba.csv");
		datosC("C:\\Users\\Usuario\\Desktop\\Prueba.csv");

	}	
	 //1.Mostrar N Columnas
	public static int nColumnas (String archivo) throws IOException {
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		String cabecera [] = linea.split(";");
		br.close();
		fr.close();
		return cabecera.length;
	}
	 //2.N Filas (Sin cabecera)
	public static int nFilas (String archivo) throws IOException {
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		int filas = 0;
		while ((linea = br.readLine()) != null) {
			filas++;
		}
		br.close();
		return filas-1;
	}
	 //3.Todos los datos separados por ,
	public static void datosSeparados (String archivo) throws IOException {
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		String datos [];
		while((linea = br.readLine()) != null) {
			datos = linea.split(";");
			for (int i = 0; i < datos.length; i++) {
				if(i < datos.length - 1) {
					System.out.print(datos[i]+",");
				} else {
					System.out.println(datos[i]);
				}
			}
		}
		br.close();
	}
	 //4.Todos los valores (B)
	public static void valoresB (String archivo) throws IOException {
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		String [] cabecera = br.readLine().split(";");
		int indice = 0;
		for(int i = 0; i < cabecera.length; i++) {
			if(cabecera[i].equals("B")) {
				indice = i;
				break;
			}
		}
		int acumulado = 0;
		String datos [];
		while ((linea = br.readLine()) != null) {
			datos = linea.split(";");
			System.out.println(datos[indice]);
			int a = Integer.parseInt(datos[indice]);
			acumulado += a;
		}
		System.out.println("Acumulado:"+acumulado);
		br.close();
	}
	 //5.Cabecera del fichero
	public static void cabecera (String archivo) throws IOException{
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
	}
	 //6.Todos solo los Datos (C)
	public static void datosC (String archivo) throws IOException{
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea; String datos [];
		while((linea = br.readLine()) != null) {
			datos = linea.split(";");
			System.out.println(datos[3]);
		}
		br.close();
	}
	 //7.En array bidimensional tipo String guardar todos los datos del fichero
	public String [][] leerDatosFichero (String archivo) throws IOException{
		String [][]datos=null;
		File f = new File(archivo);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea= br.readLine(); //lee la cabecera que no la queremos guardar
		int fila=0;
		while ((linea=br.readLine()) !=null) {
			String[]datosLinea =linea.split(";");
			for(int i=0; i < datos.length; i++) {
				datos[fila][i]=datosLinea[i];
			}
		}
		br.close();
		fr.close();
		return datos;
	}

}
