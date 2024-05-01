package Tema_3;

import java.util.Scanner;
/**
 * Se va a hacer un ejercicio el cual nos permite elegir el dia 
 * de la semana utilizando un numero del 1 al 7
 * @author daniel
 * @since 31/10/2023
 * @category ejercicios switch
 */
public class switchactividad {

	/**
	 * 
	 * @param args Nos recoge los parametros dentro del main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un menu que pida el numero del dia de la semana
		//Debe imprimir el valor p.e El dia 1 es Lunes | El dia 2 es Martes ...
/**
 * @param num El numero que elijamos nos dirá que dia de la semana hemos elegido (1-lunes, 7-domingo)
 *
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce con un numero del 1 al 7 el dia de la semana que deseas elegir.");
		int num = sc.nextInt();
		switch (num) {
		case 1 : {
			System.out.println("El dia "+num+" es Lunes.");
			break;
		}
		case 2 : {
			System.out.println("El dia "+num+" es Martes.");
			break;
		}
		case 3 : {
			System.out.println("El dia "+num+" es Miercoles.");
			break;
		}
		case 4 : {
			System.out.println("El dia "+num+" es Jueves.");
			break;
		}
		case 5 : {
			System.out.println("El dia "+num+" es Viernes.");
			break;
		}
		case 6 : {
			System.out.println("El dia "+num+" es Sabado.");
			break;
		}
		case 7 : {
			System.out.println("El dia "+num+" es Domingo.");
			break;
		}
		default: System.out.println("Error "+num+" no es un día de la semana.");
		}
		sc.nextLine(); //este codigo aqui sirve para dar un salto a la proxima prpegunta.
		//ALTA -- SE VA A DAR DE ALTA
		//BAJA -- SE VA A DAR DE BAJA
		//En otro caso -- error
		System.out.println("Escribe ALTA para dar de alta un usuaria y escribe BAJA para dar de baja un usuario.");
		String pal = sc.nextLine();
		switch (pal) {
		case "ALTA": {
			System.out.println("Se va a dar de alta un usuario.");
			break;
		}
		case "BAJA":{
			System.out.println("Se va a dar de baja un usuario.");
			break;
		}
		default:
			System.out.println("Error.");
		}
				
	}

}
