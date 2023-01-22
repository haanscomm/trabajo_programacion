package gestion.profesor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import ficheros.*;

public class introducirNotasAlumnos {

	public static void introducirNotas(String asignatura) throws IOException {
		
		Scanner l = new Scanner (System.in);
		File fichero = new File("notas_alumnos.txt");
		File fichero1 = new File("alumnos.txt");
		PrintWriter salida;
		
		
		salida = new PrintWriter(new FileWriter(fichero));
		
		
		//creamos el fichero dni_alumnos
		DNI_alumnos.dni_alumnos();
		
		/*for(int i = 1; i <= 15; i++) {
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
		escribir.close();*/
		
		//creamos un array de la asignatura 
		
		
		//Exploramos fichero dni_alumnos y lo introducimos en uno nuevo
		Scanner lectura_fichero = new Scanner(fichero1); 
		
		int [] notas = new int [contarLineasFichero(fichero1)];
		
			
			int i = 0;
			while(lectura_fichero.hasNextLine()) {
				
				String datos = lectura_fichero.nextLine();
				salida.print("Alumno con DNI:");
				salida.println(datos);
				

				System.out.println("Introduzca la nota para el alumno " + datos + ": ");
				int nota1 = l.nextInt();
				
				notas[i] = nota1;
				salida.println("nota:" + notas[i]);
				
				i++;
				
			}
			
			lectura_fichero.close();
			salida.close();
			l.close();
		
			
		
		
		
	}

	public static void calcularNotaMasAlta() {
		// HOLA BUENAS

	}

	public static void calcularNotaMasBaja() {

	}

	public static int contarLineasFichero(File fichero1) throws IOException {
		Scanner lectura_fichero = new Scanner(fichero1); 
		int lineasTotal = 0; 
		
		while(lectura_fichero.hasNextLine()) {
			lectura_fichero.nextLine();
			lineasTotal++;
			
		}
		
		lectura_fichero.close();
		
		return lineasTotal;
	}

}