package src;

import java.util.*;

public class Tarea1{

	public static void main(String[] args){
		Tarea1 datos = new Tarea1();		
	}

	//varibles globales
	int [] array = new int[5];
	Scanner entrada = new Scanner(System.in);

	public Tarea1(){

		for(int i=0; i<5; i++){
			array[i] = pedirNumero();
		}

		mostrarDatos();
	}

	public int pedirNumero(){
		int num;
		System.out.print("Ingrese un número: ");
		num = entrada.nextInt();
		return num;
	}

	public void mostrarDatos(){
		for(int i=0; i<array.length; i++){
			System.out.println("El indice es "+i+" y el volor que contiene es: "+array[i]);
		}
	}
}