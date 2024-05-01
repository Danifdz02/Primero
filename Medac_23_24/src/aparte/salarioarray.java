package aparte;

public class salarioarray {
	
	public double maxSalario (double [] salarios) { //para recorrer un array y nos devuelva el valor maximo
		double max = 0.0;
		
		for (int i = 0; i< salarios.length ; i++) {
			if (max < salarios [i]) { // si mi maximo es menor que salarios[i] se actualizará el maximo con el max = salarios [i]
				max = salarios [i];
			}
		}
		
		return max;
	}
	
	public void posicionmil (double[]Salario) {
		for (int i=0; i<Salario.length ; i++) {
			if (Salario [i] == 1000) {
				System.out.println("La posicion"+i);
			}
		}
	}
}
 

