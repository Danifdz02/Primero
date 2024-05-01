package Tema_4;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [3][3];
		int suma = 1;
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz [i][j] = suma;
				suma++;
			}
		}
	//Imprimir matriz
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");			//Quitamos println y lo pasamos a print para que salga asi 123
			}
			System.out.println();
		}
		
		
		
	}

}
