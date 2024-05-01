package Tema_2;

public class Ejercicio_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear dos boolean uno V y otro F
		//Hacer las operaciones logicas AND, OR y NOT
		boolean V = true, F = false;
		boolean and = V && F;
		System.out.println ("Operador and "+and);
		System.out.println ("Operador and "+!(and)); //añadimos ! delante de la variable si lo queremos negar
		
		boolean or = V || F;
		System.out.println("Operador or "+or);
		System.out.println("Operador or "+!(or));
		
		boolean not = !V;
		System.out.println("Operador not "+not);
		System.out.println("Operador not "+!(not));
		
	}

}
