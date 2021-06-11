package src;

import java.util.*;

public class Tarea2{

	public static void main(String[] args){
		Tarea2 arreglo = new Tarea2();		
	}

	//varibles globales
	Random aleatorio = new Random();
	int [] array = new int[10];
	int numMayor=0;
	int repetido=0;

	public Tarea2(){

		for(int i=0; i<array.length; i++){
			array[i] = generarNum();
		}

		mostrarDatos();
	}

	public int generarNum(){
		int num;

		num = aleatorio.nextInt(99);
		
		contarRepitencia(num);
		comprobarMayor(num);

		return num;
	}

	public void mostrarDatos(){
		System.out.println("Los números que contiene el arreglo son:");
		for(int i=0; i<array.length; i++){
			System.out.println("Número: "+array[i]);
		}
		System.out.println("El número mayor en el arreglo es: "+numMayor);
		System.out.println("EL número mayor se repite "+repetido+" veces en el arreglo");
	}

	public void comprobarMayor(int num){
		if(num > numMayor){
			numMayor = num;
		}
	}

	public void contarRepitencia(int num){
		if(numMayor == num){
			repetido++;
		}
	}
}