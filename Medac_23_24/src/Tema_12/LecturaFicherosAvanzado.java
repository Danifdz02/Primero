package Tema_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicherosAvanzado {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nombreFichero = "Prueba.csv";
		File f = new File("C:\\Users\\danie\\OneDrive\\Escritorio\\Informatica DAW\\Programacion\\"+nombreFichero);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		String [] datos;
		while((linea=br.readLine()) !=null) {
			//System.out.println(linea);
			datos = linea.split(",");
			System.out.println(datos[0]+" "+datos[1]);
		}
		
		//1- Mostrar el numero de columnas int numColumnas()
		String [] cabecera = br.readLine().split(",");
		int columnas = cabecera.length;
		while ((linea = br.readLine()) !=null) {
			datos=linea.split(",");
			System.out.println(datos[0]+" "+datos[1]);
		}
		System.out.println("Numero de columnas "+columnas);

		//2- Mostrar el numero de filas (sin contar cabecera)
		int nFilas=0;
		while((linea = br.readLine()) !=null) {
			nFilas++;
		}
		System.out.println("Nº Filas "+nFilas+" SIN CAB "+(nFilas-1));
		
		//3- Mostrar todos los datos del fichero separados por ','
		while ((linea = br.readLine()) !=null) {
			datos=linea.split(",");
			for (int i = 0; i < datos.length ; i++) {
				if (i < datos.length -1) {
					System.out.print(datos[i]+",");
				}else {
					System.out.print(datos[i]+"\n");
				}
			}
		}
		
		//4- Obtener los valores de la columna 'B'
		
		String [] cabecera = br.readLine().split(",");
		int indice = 0;
		for (int i = 0; i < cabecera.length; i++) {
			if(cabecera[i].equals("B")) {
				indice = i;
				break;
			}
		}
		System.out.println("Indice "+indice);
		while ((linea = br.readLine()) !=null) {
			datos=linea.split(",");
			System.out.println(datos[indice]);
		}
		//Sumar todos los valores de la columna B
		int suma=0;
		while ((linea = br.readLine()) !=null) {
			datos=linea.split(",");
			System.out.println(datos[indice]);
			suma += Integer.parseInt(datos[indice]);
			
		}
		
		//5- Obtener la cabecera del fichero 
		
			
			System.out.println(br.readLine());
		}
		
		//6- Obtener los solo datos de la coluna denominada 'C'
		
		String [] cabecera = br.readLine().split(",");
		int indice = 0;
		for (int i = 0; i < cabecera.length; i++) {
			if(cabecera[i].equals("C")) {
				indice = i;
				break;
			}
		}
		System.out.println("Indice "+indice);
		while ((linea = br.readLine()) !=null) {
			datos=linea.split(",");
			System.out.println(datos[indice]);
		}
		
		//7- Guardar en String [][] datos todos los datos del fichero
		
		
		br.close();
		fr.close();
	} 

}
