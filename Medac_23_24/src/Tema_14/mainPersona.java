package Tema_14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class mainPersona {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		List<Persona> listadoPersonas = new ArrayList<Persona>();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i <= 5; i++) {
			System.out.println("Dime el nombre de la persona "+i);
			String nombre = sc.nextLine();
			System.out.println("Dime el apellido de la persona "+i);
			String apellidos = sc.nextLine();
			System.out.println("Dime el genero de la persona "+i);
			String genero = sc.nextLine();
			System.out.println("Dime la edad de la persona "+i);
			int edad = sc.nextInt();
			sc.nextLine(); //importante tras leer un entero para saltar de linea, sino da error
			listadoPersonas.add(new Persona(nombre,apellidos,genero,edad));
		}
		sc.close();
		System.out.println(listadoPersonas.toString());
		
		File f = new File ("C:\\Users\\danie\\OneDrive\\Escritorio"); //esta linea hasta la 36 es para leer el fichero
		List<Persona> personas=leerFichero(f);
		System.out.println(personas.toString());
		System.out.println(personas.size()); //me dice la cantidad de personas que hay
		System.out.println("Personas gº masculino "+personasGeneroMasculino(listadoPersonas));
		System.out.println("Personas gº femenino "+personasGeneroFemenino(listadoPersonas));
		System.out.println("Edad media: "+edadMedia(listadoPersonas));
		
	}
	
	//Realizar un metodo que permita retornar la cantidad de personas con genero masculino
	public static int personasGeneroMasculino(List<Persona> personas) {
		int nPersonas=0;
//		for(int i=0; i < personas.size(); i++) {
//			if(personas.get(i).getGenero().equals("Masculino")) {
//				nPersonas++;
//			}
//		}
		for (Persona p : personas) { //mismo metodo que el de antes pero en vez de un for lo hacemos con for each
			if(p.getGenero().equals("Masculino")) {
				nPersonas++;
			}
		}
		return nPersonas;
	}
	
	public static int personasGeneroFemenino(List<Persona> personas) {
		int nPersonas=0;
//		for(int i=0; i < personas.size(); i++) {
//		if(personas.get(i).getGenero().equals("Masculino")) {
//			nPersonas++;
//		}
//	}
		for (Persona p : personas) { //mismo metodo que el de antes pero en vez de un for lo hacemos con for each
			if(p.getGenero().equals("Masculino")) {
				nPersonas++;
			}
		}
		return nPersonas;
	}
	
	//Realizar un metodo que permita retornar el promedio de las edades (edad media)
	
	public static double edadMedia (List <Persona> personas) {
		double mediaEdad = 0.0;
		for (int i=0; i < personas.size(); i++) {
			mediaEdad += personas.get(i).getEdad();
		}
		return mediaEdad/personas.size();
				
	}
	
	//devolvera true si ha podido eliminar a la persona con mayor edad de la lista
	public static boolean eliminarMayor (List<Persona>personas) {
		int masMayor = 0;
		int indice =-1;
		for(int i=0; i<personas.size(); i++) {
			if(masMayor < personas.get(i).getEdad()) {
				masMayor = personas.get(i).getEdad();
				indice=i;
			}
		}
		return personas.remove(personas.get(indice));
				
	}
	
	//Eliminar de la lista todas las personas menores de 18 años --> devuelve el numPers eliminadas
	
	public static int eliminarMenor18 (List <Persona> personas) {
		int menores = 0;
		for (Persona p : personas) {
			if(p.getEdad()<18) {
				personas.remove(p);
				menores++;
			}
		}
		return menores;
	}
	
	//Leer un fichero de texto
	//Ana;Garcia;Femenino;65
	//Luis;Garcia;Masculino;25
	//...
	//El metodo debe devolver un LinkedList<Persona> con los datos del fichero
	//File me lo pasan como parametro
	
	public static List<Persona> leerFichero (File fichero) throws NumberFormatException, IOException{
	
		List<Persona> personas = new LinkedList<Persona>();
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea = "";
		while ((linea=br.readLine()) !=null) {
			String [] pers = linea.split(";");
			personas.add(new Persona(pers[0],pers[1],pers[2], Integer.parseInt(pers[3])));
		}
		br.close();	
		return personas;
	}
	
}
