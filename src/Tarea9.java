package src;

import java.util.*;

public class Tarea9{

	public static void main(String[] args){
		Tarea9 arreglo = new Tarea9();		
	}

	//varibles globales
	int [][] matriz1 = new int[3][3];
	int [][] matriz2 = new int[3][3];
	Scanner entrada = new Scanner(System.in);

	public Tarea9(){
		llenarArray();
		mostrarMatrices();
		sumarMatrices();
	}

	public void llenarArray(){
		int num;

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("Ingrese un número para la matriz 1: ");	
				num = entrada.nextInt();
				matriz1[i][j] = num;
				System.out.print("Ingrese un número para la matriz 2: ");	
				num = entrada.nextInt();
				matriz2[i][j] = num;
			}
		}
	}

	public void mostrarMatrices(){
		System.out.println("La matriz uno es: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("|  "+matriz1[i][j]+"  |");
			}
		System.out.println("");
	}

	System.out.println("La matriz dos es: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("|  "+matriz2[i][j]+"  |");
			}
			System.out.println("");
		}
	}	

	public void sumarMatrices(){
		int [][] suma = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				suma[i][j] = matriz1[i][j]+matriz2[i][j];
			}
		}
		System.out.println("\nLa suma de las dos matrices da como resultado: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("|  "+suma[i][j]+"  |");
			}
			System.out.println("");
		}
	}
}