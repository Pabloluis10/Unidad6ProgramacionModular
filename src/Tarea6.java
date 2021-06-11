package src;

import java.util.*;

public class Tarea6{

	public static void main(String[] args){
		Tarea6 arreglo = new Tarea6();		
	}

	//varibles globales
	int [][] matriz = new int[3][3];

	public Tarea6(){

		llenarMatriz();
		multiplicarMatriz();
	}

	public void llenarMatriz(){
		matriz[0][0] = 5;
		matriz[0][1] = 6;
		matriz[0][2] = 13;
		matriz[1][0] = 14;
		matriz[1][1] = 2;
		matriz[1][2] = 4;
		matriz[2][0] = 21;
		matriz[2][1] = 7;
		matriz[2][2] = 6;

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("|"+matriz[i][j]+"| ");
			}
			System.out.println("");
		}
	}

	public void multiplicarMatriz(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				matriz[i][j] *= 2;			
			}
		}
		System.out.println("La matriz multiplicada por 2 es:");

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("|"+matriz[i][j]+"| ");
			}
			System.out.println("");
		}
	}
}