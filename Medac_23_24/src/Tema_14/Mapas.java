package Tema_14;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		treeMap.put(1, "Hola");
		treeMap.put(2, "Segundo elemento");
		System.out.println(tm.toString());
		for(Integer keys: tm.keySet()) { //Devuelve un conjunto de todas las claves
			System.out.println(keys);
			
		}
		for(String valores: tm.values()) { //Devuelve los valores, estos son de tipo string
			System.out.println(valores);
		}
		
		
		
		Map<Integer, String> hm= new HashMap<Integer, String>();
		
	}

}
