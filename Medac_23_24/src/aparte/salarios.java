package aparte;

public class salarios {
	public void minSalario (double [] salarios) {
		//imprime el minimo salario y nº salarios leidos
		double min = salarios[0];
		for(int i = 0; i < salarios.length; i++) {
			if (min > salarios [i]) {
				min = salarios [i];
			}
		}
	}
}
