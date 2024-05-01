package aparte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class trycatch<Bufferedreader> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
	}
	//obtener el numero de columnas con try-catch
	public int obtenerNumeroColumnas(){	
		String ruta = "C:\\MEDAC\\PROGRAMACION\\examen.txt";
		try {
			BufferedReader br= new BufferedReader(new FileReader(new File(ruta)));
			String linea = br.readLine();
			int numColumnas = linea.split(";").length;
			return numColumnas;
		}catch(IOException e){
			e.printStackTrace();
			return -1;
		} finally { 
	        try {
	        	br.close();
	            fr.close();
	            System.out.println("Cerrado con exito");
	        } catch (Exception e2) {
	            System.out.println("Error al cerrar.");
	        }
	    }
	
	//Obtener columnas///////////////////////////////////
	}
	public String [] getColumna(FileReader fr, int indice){
		String [] columnaN=null;
		try(BufferedReader br = new BufferedReader(fr)){
			String linea = br.readLine();
			int i = 0;
			while((linea=br.readLine())!=null) {
				String [] columnas=linea.split(";");
				columnaN[i]=columnas[indice];
			} 
			return columnaN;
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					br.close();
					fr.close();
				}catch(Exception e2) {
					e2.toString();
				}
			}
		}
	
	
	//con try catch: implementa el siguiente metodo
	public int numeroFilass (String ruta) {
		int numFilas;
			try {
				BufferedReader br= new BufferedReader(new FileReader(new File(ruta)));
				String linea;
			while((linea=br.readLine())!=null) {
				numFilas++;
			}
			return numFilas;
			}catch(IOException e){
				e.printStackTrace();
				return -1;
			}finally {
				try {
					br.close();
					fr.close();
					System.out.println("Cerrado con exito.");
				}catch (IOException e2) {
					System.out.println("Error al cerrar");
				}
			}
	}

	//Obtener cabecera del fichero, inicializar un array y mostrar todos los valores de la cabecera recorriendo el array
	
	public String [] cabecerax(String ruta) {
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(new File(ruta)));
			String [] cabecera = br.readLine().split(";");
			for(int i=0; i<cabecera.length; i++) {
				System.out.println(cabecera[i]);
			}
			return cabecera;
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			br.close();
			fr.close();
				System.out.println("Cerrado correctamente");
			}catch(Exception e2){
				System.out.println(e2.toString());
			}
		}
	}
	
	
	
	///////////////////catch try suma total de los valores que contiene la columna peso///////////////////////////
	public void sumaPesoo(BufferedReader br) {
		int indice;
		String linea;
		try {
			String [] cabecera = br.readLine().split(";");
			for(int i=0; i<cabecera.length; i++) {
				if(cabecera[i].equals("PESO")) {
					indice=i;
					break;
				}
			}
			double peso=0;
			while((linea=br.readLine())!=null) {
				String[]datos=linea.split(";");
				peso+=Double.parseDouble(datos[indice]);
			}
			System.out.println(peso);
		}catch(IOException e) {
				e.printStackTrace();
				System.out.println("Error "+e.getMessage());
		}finally {
			try {
				br.close();
				fr.close();	
			}catch (Exception e2) {
				System.out.println(e2.toString());
			}
		}
			
	}
		
		
	
	
	//devolver la media total de edad.
	public double mediaEdad(FileReader fr) {
		BufferedReader br= new BufferedReader(fr);
		int indice = -1;
		String [] cabecera = br.readLine().split(";");
		for (int i=0; i<cabecera.length; i++) {
			if(cabecera[i].equals("EDAD")) {
			indice = i;
			break;
			}
		}
		int nFilas=0;
		int sumaEdad=0;
		String linea;
		while((linea=br.readLine())!=null) {
			String[]datos=linea.split(";");
			sumaEdad += Integer.parseInt(datos[indice]);
			nFilas++;				
		}
		br.close();
		fr.close();
		return (double)sumaEdad/nFilas;
	}