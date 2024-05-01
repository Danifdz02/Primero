package tema9;

public class ejercicioHerenciaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("Maria", "Sanchez", 34);
		System.out.println(p1.toString());
		
		Profesor prof1 = new Profesor();
		System.out.println(prof1.toString());
		
		Profesor prof2 = new Profesor ("Maria", "Sanchez", 34, 0123423, 6);
		System.out.println(prof2.toString());
	}

}
