package src;

import java.util.*;

public class Tarea3{

	public static void main(String[] args){
		Tarea3 arreglo = new Tarea3();		
	}

	//varibles globales
	Scanner entrada = new Scanner(System.in);
	Random aleatorio = new Random();
	int [] array = new int[8];

	public Tarea3(){

		for(int i=0; i<array.length; i++){
			array[i] = generarNum();
		}

		buscar();
	}

	public int generarNum(){
		int num;
		num = aleatorio.nextInt(99);
		return num;
	}

	public void buscar(){
		int num;
		boolean encontrado = false;
		System.out.print("Ingrese el número a buscar en el arreglo: ");
		num = entrada.nextInt();

		int contador=0;
		while(!encontrado && contador<array.length){
			if(array[contador] == num){
				encontrado = true;
			} else{
				contador++;
			}
		}
		System.out.println("¿Número encontrado? \n"+encontrado);
	}
}