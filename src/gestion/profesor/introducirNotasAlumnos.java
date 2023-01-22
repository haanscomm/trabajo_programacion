package gestion.profesor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import ficheros.*;

public class introducirNotasAlumnos {


	public static void introducirNotas(String asignatura) throws FileNotFoundException {
		
		Scanner leer = new Scanner (System.in);
		File fichero = new File("notas_alumnos.txt");
		PrintWriter escribir = new PrintWriter(fichero);
		System.out.println();
		
		
		//creamos el fichero dni_alumnos
		DNI_alumnos.dni_alumnos();
		//creamos un array de la asignatura 
		
		//Exploramos fichero dni_alumnos 
		
		
		
	}
	
	public static void calcularNotaMasAlta() {
		
	}
	
	public static void calcularNotaMasBaja() {
		
	}

}
