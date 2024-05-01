package Tema_3;

import java.util.Scanner; 

public class daniel_fernandez_Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------Ejercicio 1----------------------");
		
		Scanner sc=new Scanner(System.in);
		int num= 0;
		int suma= 0;
		
		do {
			suma=suma+num;				//MUY IMPORTANTE esta formula debe de ir arriba del scanner del numero para que no cuente el numero negativo
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
		} while (num >= 0);				//while mayor igual que cero para cuando haya un numero negativo se acabe la formula
			
			System.out.println("La suma de los numeros que has introducido es "+suma);
		
		/////////////////////////////////////////////////////////////////////////////////	
			
		System.out.println("----------------------Ejercicio 2----------------------");
		
 
        int primer_num = 0;			
        int segundo_num = 0;		
 
        boolean salir = true;		//creamos boolean para poder salir de la calculadora
 
        while(salir) 				//el while debe ser la primera variable para que despues de realizar una formula elegida te devuelva al menu de eleccion
        {
          System.out.println("1 - Suma\n2 - Resta\n3 - Multiplicación\n4 - Dividir\n5 - Salir");
 
          switch(sc.nextInt()) 		//introducimos el escaner dentro del switch para cuando el usuario elija un numero de los que se les muestra en la pantalla este se dirija al caso que le tengamos asignado
          {
              case 1:
                System.out.println("Introduce primer numero: ");
                primer_num = sc.nextInt();
                System.out.println("Introduce segundo numero: ");
                segundo_num = sc.nextInt();
                System.out.println("El resultado de la suma es: " + (primer_num+segundo_num) + "\n");
                break;
              case 2:
                System.out.println("Introduce primer numero: ");
                primer_num = sc.nextInt();
                System.out.println("Introduce segundo numero: ");
                segundo_num = sc.nextInt();
                System.out.println("El resultado de la resta es: " + (primer_num-segundo_num) + "\n");
                break;
              case 3:
                System.out.println("Introduce primer numero: ");
                primer_num = sc.nextInt();
                System.out.println("Introduce segundo numero: ");
                segundo_num = sc.nextInt();
                System.out.println("El resultado de la multiplicacion es: " + (primer_num*segundo_num) + "\n");
                break;
              case 4:
                System.out.println("Introduce primer numero: ");
                primer_num = sc.nextInt();
                System.out.println("Introduce segundo numero: ");
                segundo_num = sc.nextInt();
                System.out.println("El resultado de la division es: " + (primer_num/segundo_num) + "\n");
                break;
              case 5:
                salir = false;
                System.out.println("Saliendo del programa...");
                break;
              default:
                System.out.println("No existe esa funcion en la calculadora\n");		//añadimos el default para que cuando elijamos un caso que no exista (mas de 5 o menos de 0 en este caso) nos diga que no existe esa opcion
                break;
          }
 
        }
		
		System.out.println("----------------------Ejercicio 3----------------------");
		
		//pedimos al usuario las filas con el scanner
		
		System.out.println("Introduce las filas que deseas tener: ");
		int numerofilas = sc.nextInt();
				
		//usamos el primer for para marcar las filas que queremos usar, el primer for va a ser el principal
		//los demas for iran dentro del primero
				
		for(int fila=0; fila < numerofilas; fila++) {	//marcamos las filas 
			
			for(int saltos=0; saltos <= numerofilas-fila ; saltos++) { //imprimimos el for de los espacios, este debe ir antes de imprimir los asteriscos y tambien debemos restar el scanner con la variable fila ya que si no, no aparece de derecha a izquierda
				System.out.print("  ");       ////imprimimos los espacios, usamos un espacio dentro de los asteriscos para que aparezca de derecha a izquierda
					}
			for(int asteriscos=0; asteriscos <= fila; asteriscos++) { 	   //imprimimos los espacios
						System.out.print("*");			//hay que poner un espacio dentro de los asteriscos para que el asterisco salga de derecha a izquierda		
					}
						System.out.println(); 			//utilizamos este sys.out para que haga el salto de linea en cada fila
			}
		
		
		
		
		
	}

	}
