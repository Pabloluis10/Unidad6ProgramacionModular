package src;

import java.util.*;

public class Tarea10{

	public static void main(String[] args){
		Tarea10 arreglo = new Tarea10();		
	}

	//varibles globales
	int [][] matriz = new int[3][4];
	int [][] matrizTranspuesta = new int[4][3];
	Scanner entrada = new Scanner(System.in);

	public Tarea10(){
		llenarMatriz();
		obtenerTranspuesta();
		mostrarMatrices();
	}

	public void llenarMatriz(){
		int num;
		System.out.println("LLene la matriz ");
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				System.out.print("("+i+")("+j+"): ");	
				num = entrada.nextInt();
				matriz[i][j] = num;
			}
		}
	}
	

	public void obtenerTranspuesta(){
		
		for(int i=0; i<4; i++){
			int num;
			for (int j=0 ;j<3 ;j++) {
				num = matriz[j][i];
				matrizTranspuesta[i][j] = num;
			}
		}

	}

	public void mostrarMatrices(){
		System.out.println("La matriz ingresad a matriz matrizTranspuesta es: ");

		for(int i=0; i<3; i++){
			for (int j=0; j<4; j++) {
				System.out.print("| "+matriz[i][j]+" |");
			}
			System.out.println("");
		}

		for(int i=0; i<4; i++){
			for(int j=1; j<3; j++){
				System.out.print("| "+matrizTranspuesta+" |");
			}
			System.out.println("");
		}
	}
}