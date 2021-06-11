package src;

import java.util.*;

public class Tarea8{

	public static void main(String[] args){
		Tarea8 arreglo = new Tarea8();		
	}

	//varibles globales
	String [] array1 = new String[5];
	String [] array2 = new String[5];
	Scanner entrada = new Scanner(System.in);

	public Tarea8(){
		llenarArray();
		compararArrays();
	}

	public void llenarArray(){
		String palabra;
		int tamaño;

		for(int i=0; i<5; i++){
			System.out.print("Ingrese una palabra para el array 1: ");	
			palabra = entrada.next();
			array1[i] = palabra;
			System.out.print(" Ingrese una palabra para el array 2: ");	
			palabra = entrada.next();
			array2[i] = palabra;
		}
	}

	public void compararArrays(){
		String palabra1;
		String palabra2;

		for(int i=0; i<5; i++){
			palabra1 = array1[i];
			palabra2 = array2[i];

			if(palabra1.length() == palabra2.length()){
				System.out.println("indice en los arrays '"+i+"'");
				System.out.println("Tamaño de la palabra del arreglo 1 "+palabra1.length()+" Tamaño de la palabra del arreglo 1"+palabra2.length());
				System.out.println("''Son Iguales''");
			}else {
				System.out.println("indice en los arrays '"+i+"'");
				System.out.println("Tamaño de la palabra del arreglo 1 "+palabra1.length()+" Tamaño de la palabra del arreglo 1"+palabra2.length());
				System.out.println("''No Son Iguales''");
			}
		}
	}	
}