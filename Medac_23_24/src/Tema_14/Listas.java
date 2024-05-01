package Tema_14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista2 = new LinkedList<String>();
		lista2.add("ADD en LinkedList");
		System.out.println("El tamaño de la linkedlist es "+lista2.size());
		lista2.add(0, "ADD Index");
		System.out.println(lista2.toString());
		//lista2.set(0, null);
		System.out.println(lista2.toString());
		System.out.println(lista2.contains("ADD Index"));
		System.out.println(lista2.contains("ADD"));
		String cad = "ADD Index";
		if(!lista2.contains(cad)) { //tambien se puede asi if(lista2.contains("ADD Index") == false)
			lista2.add(cad);
		}
		List<String> lista= new ArrayList<String>();
		lista.add("Hola");
		lista.add("Segundo");
		lista.add("tercer");
		lista.add(1, "Indice 1");
		System.out.println(lista.toString());
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(20);
		listaNumeros.add(2, 32); //Esto añade el numero 32 en la posicion 2 y si habia numero en esa posicion moveria todos los numeros a la derecha es decir el que estaba en el 2 pasa al 3, el 3 al 4 etc...
		listaNumeros.add(0,1);
		System.out.println(listaNumeros.toString());
		
		//listaNumeros.clear(); //esto borra el array
		//System.out.println(listaNumeros.toString());
		
		listaNumeros.remove(0); //esto borra el primer hueco del array
		listaNumeros.remove(listaNumeros.size()-1);
		System.out.println(listaNumeros.toString());
		
		System.out.println(listaNumeros.get(1));
		System.out.println(listaNumeros.get(1)+listaNumeros.get(2));
		System.out.println(listaNumeros.contains(2)); //devuelve V o F si está o no está esa columna
		if(listaNumeros.contains(32)) {
			System.out.println(listaNumeros.indexOf(32));
		}
		System.out.println(listaNumeros.isEmpty()); //si esta vacio devuelve true
	}

}
