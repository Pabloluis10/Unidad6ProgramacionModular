package src;

import java.util.*;

public class Tarea11{

	public static void main(String[] args){
		Tarea11 arreglo = new Tarea11();		
	}

	//varibles globales
	String [] nombres = new String[6];
	double [] notas = new double[6];
	String [] calificacion = new String[6];
	Scanner entrada = new Scanner(System.in);

	public Tarea11(){
		ingresardatos();
		mostrarDatos();
	}

	public void ingresardatos(){
		String nombre;
		double nota;
		System.out.println("Ingrese los siguientes datos");
		for(int i=0; i<6; i++){
			System.out.print("Ingrese el nombre del alumno: ");
			nombre = entrada.nextLine();
			System.out.print("Ingrese la nota entre (0 y 10): ");
			nota = entrada.nextDouble();
	
			while(nota<0 || nota >10){
				System.out.print("Usted ingreso una nota incorrecta vuelva a ingresar la nota: ");
				nota = entrada.nextDouble();
			}
			entrada.nextLine();
			nombres[i] = nombre;
			notas[i] = nota;

			if(nota<5){
				calificacion[i] = "Suspenso";
			} else if(nota<7) {
				calificacion[i] = "Bien";
			} else if (nota <9){
				calificacion[i] = "Notable";
			} else {
				calificacion[i] = "Sobresaliente";
			}
		}
	}

	public void mostrarDatos(){
		System.out.println("Los datos de los alumnos son: ");

		for(int i=0; i<6; i++){
			System.out.println("Alumno: "+nombres[i]+", nota: "+notas[i]+", resultado: "+calificacion[i]);
		}
	}
}