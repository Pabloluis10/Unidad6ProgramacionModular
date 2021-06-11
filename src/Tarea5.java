package src;

import java.util.*;

public class Tarea5{

	public static void main(String[] args){
		Tarea5 arreglo = new Tarea5();		
	}

	//varibles globales
	Scanner entrada = new Scanner(System.in);
	int [] notas = new int[100];
	int numMayor;

	public Tarea5(){

		llenarNotas();
		obtenerPromedio();
	}

	public void llenarNotas(){
		int nota;

		System.out.println("puede ingresar hasta 100 notas o escriba -50 para ya no ingresar notas");
		
		int i=0;
		do{
			System.out.print("Ingrese la nota entre (0 y 10): ");
			nota = entrada.nextInt();
			notas[i] = nota;
			i++;
		}while((nota != -50) && i<100);
	}

	public void obtenerPromedio(){
		int cantNotas=0;
		int promedioNotas=0;
		int contador=0;

		while((notas[contador] !=- 50) && contador<100){
			promedioNotas += notas[contador];
			cantNotas++;
			contador++;
		}

		if(contador>0){
			promedioNotas /= cantNotas;
			System.out.println("El promedio de las notas ingresadas es: "+promedioNotas);	
		}else{
			System.out.println("No ingreso ningúna nota");
		}
		
	}
}