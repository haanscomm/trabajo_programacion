package gestion.profesor;

import java.io.*;
import java.util.Scanner;

import ficheros.*; 

public class introducirNotasAlumnos {

	public static void main(String[] args) throws IOException {

	}

	public static void principal(String asignatura, int opcion) throws IOException {

		if (opcion == 1) {
			introducirNotas(asignatura);
		}else if (opcion == 2) {
			
			int media = calcularMedia(asignatura);
			System.out.println("La nota media es : " + media);
			
		} else if (opcion == 3) {
			calcularModa(asignatura);
		} else if (opcion == 4) {

			calcularNotaMasAlta(asignatura);

		} else {
			// int min = calcularNotaMasBaja(asignatura);
			// System.out.println("La nota minima es : " + min);
		}

	}

	public static void introducirNotas(String asignatura) throws IOException {

		Scanner l = new Scanner(System.in);
		String asignatura2 = asignatura + ".txt";
		File fichero = new File(asignatura2);
		File fichero1 = new File("alumnos.txt");
		PrintWriter salida;

		double[] notas = new double[contarLineasFichero(fichero1)];

		salida = new PrintWriter(new FileWriter(fichero));

		DNI_alumnos.dni_alumnos();

		Scanner lectura_fichero = new Scanner(fichero1);

		
		int totalLineas = 14; 
		int lineaActual = 0;
		
		int i = 0;
		while (lectura_fichero.hasNextLine()) {

			String datos = lectura_fichero.nextLine();

			// salida.print("Alumno DNI:");
			salida.print(datos + " ");

			System.out.println("Introduzca la nota para el alumno " + datos + ": ");
			double nota1 = l.nextDouble();

			if (nota1 >= 0 && nota1 <= 10) {

				notas[i] = nota1;
				// salida.println("nota;" + notas[i] + ";");
				salida.print(" " + notas[i]);
				
				if (lineaActual < totalLineas) {
			        salida.print("\n");
			    }
				
				lineaActual ++; 

				i++;

			} else {

				System.out.println("La nota tiene que ser entre 0 y 10");
				System.out.println("Introduzca la nota para el alumno " + datos + ": ");
				nota1 = l.nextDouble();
				notas[i] = nota1;
				salida.print(" " + notas[i] );

				if (lineaActual < totalLineas) {
			        salida.print("\n");
			    }
				
				lineaActual ++; 
				i++;

			}


			salida.print("Alumno con DNI:");
			salida.println(datos);
			for(int i = 1; i <= 15; i++) {
				System.out.println("Introduce la nota del alumno " + i + ": ");
				double nota = l.nextDouble();
				if(nota > 0 && nota < 10) {
				salida.print("La nota del alumno "+ i + " es: " +nota + "\n");
				} else {
					System.out.println("La nota tiene que ser entre 0 y 10");
					System.out.println("Introduce la nota del alumno " + i + ": ");
					nota = l.nextDouble();
				 }
				}
				Scanner leer = new Scanner(new FileReader(fichero));
				leer.close();
				salida.close();

		}

		lectura_fichero.close();
		salida.close();
	

		l.close();

	

	}

	public static void calcularNotaMasAlta(String asignatura) throws IOException {

		//String notasAsignatura = "ingles.txt";
		File fichero = new File("ingles.txt");

		double max = 0;
		String dniMaxNota = "";

		Scanner leer = new Scanner(fichero);
		Scanner leer1 = new Scanner(fichero);
		// primero leemos archivo

		while (leer1.hasNextLine()) {
			String linea = leer1.nextLine();
			System.out.println(linea);
		}
		leer1.close();

		// agrupamos para sacar el maximo DEL FICHERO

		while (leer.hasNextLine()) {
			
			String linea = leer.nextLine();
			String[] partes = linea.split(" ");
			
			//Coge el contenido del carácter q pongo

			String dni = partes[0];
			
			double nota = Double.parseDouble(partes[2]);
				if (nota > max) {
					max = nota;
					dniMaxNota = dni;
			}

		}
		leer.close();

		System.out.println("La nota mas alta es " + max + " con DNI:" + dniMaxNota);

	}

	
	
	
	
	
	
	
	public static int calcularNotaMasBaja(String asignatura) {

		/*int min = 0;

		for (int i = 0; i < notas.length; i++) {
			if (min > notas[i]) {
				min = notas[i];
			}

		}

		return min;*/
		
		//String notasAsignatura = "ingles.txt";
				File fichero = new File("ingles.txt");

				double min = 0;
				String dniMinNota = "";

				Scanner leer = new Scanner(fichero);
				Scanner leer1 = new Scanner(fichero);
				// primero leemos archivo

				while (leer1.hasNextLine()) {
					String linea = leer1.nextLine();
					System.out.println(linea);
				}
				leer1.close();

				// agrupamos para sacar el maximo DEL FICHERO

				while (leer.hasNextLine()) {
					
					String linea = leer.nextLine();
					String[] partes = linea.split(" ");
					
					//Coge el contenido del carácter q pongo

					String dni = partes[0];
					
					double nota = Double.parseDouble(partes[2]);
						if (nota > max) {
							max = nota;
							dniMaxNota = dni;
					}

				}
				leer.close();

				System.out.println("La nota mas alta es " + max + " con DNI:" + dniMaxNota);

			}
		
	}
	

	public static int calcularMedia(String asignatura) {

		int media = 0;
		int sumanotas = 0;
		for (int i = 0; i < notas.length; i++) {
			sumanotas += notas[i];
		}
		media = sumanotas / notas.length;
		return media;

	}

	public static void calcularModa(String asignatura) {
		
		

	}

	
	
	
	
	public static int contarLineasFichero(File fichero1) throws IOException {
		Scanner lectura_fichero = new Scanner(fichero1);
		int lineasTotal = 0;

		while (lectura_fichero.hasNextLine()) {
			lectura_fichero.nextLine();
			lineasTotal++;

		}

		lectura_fichero.close();

		return lineasTotal;
	}

}