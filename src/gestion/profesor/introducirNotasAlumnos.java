package gestion.profesor;

import java.io.*;
import java.util.Scanner;

public class introducirNotasAlumnos {

	public static void main(String[] args) throws IOException {

	}

	public static void principal(String asignatura, int opcion) throws IOException {

		if (opcion == 1) {
			
			introducirNotas(asignatura);
			
		} else if (opcion == 2) {

			calcularMedia(asignatura);
			
		} else if (opcion == 3) {

			calcularModa(asignatura);

		} else if (opcion == 4) {

			calcularNotaMasAlta(asignatura);

		} else if(opcion == 5) {

			calcularNotaMasBaja(asignatura);

		} else {
			
			System.out.println("ERROR. Introduzca un número válido. ");
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

		//DNI_alumnos.dni_alumnos();

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

				lineaActual++;

				i++;

			} else {

				System.out.println("La nota tiene que ser entre 0 y 10");
				System.out.println("Introduzca la nota para el alumno " + datos + ": ");
				nota1 = l.nextDouble();
				notas[i] = nota1;
				salida.print(" " + notas[i]);

				if (lineaActual < totalLineas) {
					salida.print("\n");
				}

				lineaActual++;
				i++;

			}
			
		}

		lectura_fichero.close();
		salida.close();

		l.close();

	}

	public static void calcularNotaMasAlta(String asignatura) throws IOException {

		String asignatura2 = asignatura + ".txt";
		File fichero = new File(asignatura2);

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

			// Coge el contenido del carácter q pongo

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

	public static void calcularNotaMasBaja(String asignatura) throws IOException {

		

		// String notasAsignatura = "ingles.txt";
		File fichero = new File("ingles.txt");

		double min = Double.MAX_VALUE;
		String dniMinNota = "";

		Scanner leer = new Scanner(fichero);
		Scanner leer1 = new Scanner(fichero);
		// primero leemos archivo

		while (leer1.hasNextLine()) {
			String linea = leer1.nextLine();
			System.out.println(linea);
		}
		leer1.close();

		// agrupamos para sacar el mínimo DEL FICHERO

		while (leer.hasNextLine()) {

			String linea = leer.nextLine();
			String[] partes = linea.split(" ");

			// Coge el contenido del carácter q pongo

			String dni = partes[0];

			double nota = Double.parseDouble(partes[2]);
			if (nota < min) {
				min = nota;
				dniMinNota = dni;
			}

		}
		leer.close();

		System.out.println("La nota mas baja es " + min + " con DNI:" + dniMinNota);

	}

	public static void calcularMedia(String asignatura) throws IOException {
		
		
		    Scanner leer = new Scanner(new File("ingles.txt"));
		    double sumaNotas = 0;
		    int contadorNotas = 0;
		    
		    while(leer.hasNextLine()) {
		        String linea = leer.nextLine();
		        String[] partes = linea.split(" ");
		        double nota = Double.parseDouble(partes[2]);
		        sumaNotas += nota;
		        contadorNotas++;
		    }
		    
		    leer.close();
		    System.out.printf("La nota media es: %.2f" ,sumaNotas / contadorNotas);
		
	}

	public static void calcularModa(String asignatura) throws IOException {

		File fichero = new File("ingles.txt");
		
		Scanner leer = new Scanner(fichero);
		int[] contadorNotas = new int[15];
		double moda = 0;
		int repeticionesModa = 0;

		while (leer.hasNextLine()) {
			String linea = leer.nextLine();
			String[] partes = linea.split(" ");
			double nota = Double.parseDouble(partes[2]);
			contadorNotas[(int) nota]++;
		}

		for (int i = 0; i < contadorNotas.length; i++) {
			if (contadorNotas[i] > repeticionesModa) {
				moda = i;
				repeticionesModa = contadorNotas[i];
			}
		}

		System.out.println("La moda es: " + moda);
		leer.close();

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