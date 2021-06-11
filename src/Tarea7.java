package src;

import java.util.*;

public class Tarea7{

	public static void main(String[] args){
		Tarea7 arreglo = new Tarea7();		
	}

	//varibles globales
	int [][] matriz = new int[4][3];
	Random aleatorio = new Random();

	public Tarea7(){

		llenarMatriz();
		mostrarMatriz();
		sumarFilasPar();
	}

	public void llenarMatriz(){
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				int num = aleatorio.nextInt(556);
				matriz[i][j] = num;
			}
		}
	}

	public void mostrarMatriz(){
		System.out.println("La matriz es: \n");
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				System.out.print("|  "+matriz[i][j]+"  |");
			}
			System.out.println("");
		}
	}

	public void sumarFilasPar(){
		int suma=0;

		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				if(((i+1)%2)==0){
					suma += matriz[i][j];
				}
			}
		}
		System.out.println("La suma de las filas par es: "+suma);
	}
		
}