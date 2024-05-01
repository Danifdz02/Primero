package aparte;

public class arraypersonasnombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//Asi se haria para hacer un recuento de personas con el mismo nombre en un Array, la clase deberia llamarse como el array
// este ejemplo sale como error pero estaria bien hecho
		public int numPersonas_mismoNombre (Persona [] personas, String nombre) {
			int contador = 0;
			for (int i = 0; i < personas.length; i++) {
				if (personas[i]getNombre().equals(nombre)) {
					contador++;
				}
			}
			return contador;
		}
	}

}
