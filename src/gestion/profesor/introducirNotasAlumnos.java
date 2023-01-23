package gestion.profesor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import ficheros.*;

public class introducirNotasAlumnos {

	public static void main(String asignatura, int opcion) throws IOException {

		File fichero1 = new File("alumnos.txt");
		int[] notas = new int[contarLineasFichero(fichero1)];

		notas = introducirNotas(asignatura, notas);

		if (opcion == 2) {

			int media = calcularMedia(asignatura, notas);
			System.out.println("La nota media es : " + media);
		} else if (opcion == 3) {

			calcularModa(asignatura, notas);
		} else if (opcion == 4) {

			int max = calcularNotaMasAlta(asignatura, notas);
			System.out.println("La nota maxima es : " + max);
		} else {
			int min = calcularNotaMasBaja(asignatura, notas);
			System.out.println("La nota minima es : " + min);
		}

	}

	public static int[] introducirNotas(String asignatura, int[] notas) throws IOException {

		Scanner l = new Scanner(System.in);
		String asignatura2 = asignatura + ".txt";
		File fichero = new File(asignatura2);
		File fichero1 = new File("alumnos.txt");
		PrintWriter salida;

		salida = new PrintWriter(new FileWriter(fichero));

		DNI_alumnos.dni_alumnos();

		Scanner lectura_fichero = new Scanner(fichero1);

		int i = 0;
		while (lectura_fichero.hasNextLine()) {

			String datos = lectura_fichero.nextLine();
			salida.print("Alumno DNI:");
			salida.print(datos + " ");

			System.out.println("Introduzca la nota para el alumno " + datos + ": ");
			double nota1 = l.nextDouble();

			if (nota1 >= 0 && nota1 <= 10) {

				notas[i] = (int) nota1;
				salida.println("nota:" + notas[i]);

				i++;

			} else {

				System.out.println("La nota tiene que ser entre 0 y 10");
				System.out.println("Introduzca la nota para el alumno " + datos + ": ");
				nota1 = l.nextDouble();
				notas[i] = (int) nota1;
				salida.println("nota:" + notas[i]);

				i++;

			}

		}

		lectura_fichero.close();
		salida.close();

		l.close();

		return notas;

	}

	public static int calcularNotaMasAlta(String asignatura, int[] notas) throws IOException {
		int max = 0;

		for (int i = 0; i < notas.length; i++) {
			if (max < notas[i]) {
				max = notas[i];
			}

		}

		return max;

	}

	public static int calcularNotaMasBaja(String asignatura, int[] notas) {

		int min = 0;

		for (int i = 0; i < notas.length; i++) {
			if (min < notas[i]) {
				min = notas[i];
			}

		}

		return min;
	}

	public static int calcularMedia(String asignatura, int[] notas) {

		int media = 0;
		int sumanotas = 0;
		for (int i = 0; i < notas.length; i++) {
			sumanotas += notas[i];
		}
		media = sumanotas / notas.length;
		return media;

	}

	public static void calcularModa(String asignatura, int[] notas) {

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