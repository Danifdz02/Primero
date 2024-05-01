package Tema_3;

import java.util.Scanner;

public class trianguloinvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		//pedimos al usuario las filas con el scanner
		
				System.out.println("Introduce las filas que deseas tener: ");
				int numerofilas = sc.nextInt();
						
				//usamos el primer for para marcar las filas que queremos usar, el primer for va a ser el principal
				//los demas for iran dentro del primero
						
				for(int fila=0; fila < numerofilas; fila++) {	//marcamos las filas 
					
					for(int saltos=0; saltos <= numerofilas-fila ; saltos++) { //imprimimos el for de los espacios, este debe ir antes de imprimir los asteriscos y tambien debemos restar el scanner con la variable fila ya que si no, no aparece de derecha a izquierda
						System.out.print(" ");       ////imprimimos los espacios, usamos un espacio dentro de los asteriscos para que aparezca de derecha a izquierda
							}
					for(int asteriscos=0; asteriscos <= fila; asteriscos++) { 	   //imprimimos los espacios
								System.out.print("*");			//hay que poner un espacio dentro de los asteriscos para que el asterisco salga de derecha a izquierda		
							}
								System.out.println(""); 			//utilizamos este sys.out para que haga el salto de linea en cada fila
					}
	}

}
