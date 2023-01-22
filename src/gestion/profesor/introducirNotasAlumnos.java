package gestion.profesor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import ficheros.*;

public class introducirNotasAlumnos {


	public static void introducirNotas(String asignatura) throws IOException {
		
		Scanner l = new Scanner (System.in);
		File fichero = new File("notas_alumnos.txt");
		PrintWriter escribir = new PrintWriter(fichero);
		
		
		//creamos el fichero dni_alumnos
		DNI_alumnos.dni_alumnos();
		
		for(int i = 1; i <= 15; i++) {
		System.out.println("Introduce la nota del alumno " + i + ": ");
		double nota = l.nextDouble();
		if(nota > 0 && nota < 10) {
		escribir.print("La nota del alumno "+ i + " es: " +nota + "\n");
		} else {
			System.out.println("La nota tiene que ser entre 0 y 10");
			System.out.println("Introduce la nota del alumno " + i + ": ");
			nota = l.nextDouble();
		 }
		}
		Scanner leer = new Scanner(new FileReader(fichero));
		leer.close();
		escribir.close();
		
		//creamos un array de la asignatura 
		
		//Exploramos fichero dni_alumnos 
		
		
		
	}
	
	public static void calcularNotaMasAlta() {
		//HOLA BUENAS
		
	}
	
	public static void calcularNotaMasBaja() {
		
	}

}