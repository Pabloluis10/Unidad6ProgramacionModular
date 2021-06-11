package src;

import java.util.*;

public class Tarea4{

	public static void main(String[] args){
		Tarea4 arreglo = new Tarea4();		
	}

	//varibles globales
	Scanner entrada = new Scanner(System.in);
	int [] array = new int[10];
	int numMayor;

	public Tarea4(){

		for(int i=0; i<array.length; i++){
			array[i] = llenarArreglo();
		}

		deducirDistancia();
	}

	public int llenarArreglo(){
		int num;
		
		System.out.print("Ingrese un número");
		num = entrada.nextInt();
		verificarMayor(num);

		return num;
	}

	public void verificarMayor(int num){
		if(num>numMayor){
			numMayor = num;
		}
	}

	public void deducirDistancia(){
		int distancia;

		for(int i=0; i<array.length; i++){
			distancia = numMayor - array[i];
			System.out.println("La distancia entre el número "+array[i]+" y el número mayor '"+numMayor+"' es: "+distancia);
		}
	}
}