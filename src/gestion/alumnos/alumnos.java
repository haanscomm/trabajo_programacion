package gestion.alumnos;

import java.io.IOException;
import java.util.Scanner;

import gestion.profesor.introducirNotasAlumnos;

public class alumnos {

	public static void main(String[] args)throws IOException {
		
		    Scanner leer = new Scanner(System.in);
			System.out.println("Introduzca el DNI del alumno: ");
			String DNI = leer.next();
			
			Scanner leer1 = new Scanner("alumnos.txt");
			while (leer1.hasNextLine()) {
				String linea = leer1.nextLine();
				System.out.println(linea);
			}
			
			leer1.close();
	}

	public static void mostrarMenu(String asignatura) throws IOException {

		Scanner l = new Scanner(System.in);

		int num;

		do {

			System.out.println("Elija una opcion:");
			System.out.println("1.Asignatura donde ha sacado mayor nota.");
			System.out.println("2.Asignatura en la que menor nota ha sacado.");
			System.out.println("3.Notas de todas las asignaturas.");
			System.out.println("4.La media global de todas las asignaturas.");

			num = l.nextInt();

		} while (num > 4 && num < 0);

		switch (num) {

		case 1:
			introducirDNIalumno.principal(asignatura, num);
			break;
			
		case 2:
			introducirDNIalumno.principal(asignatura, num);
			break;
			
		case 3:
			introducirDNIalumno.principal(asignatura, num);
			break;
			
		case 4:
			introducirDNIalumno.principal(asignatura, num);
			break;
			
		default:
			System.out.println("Introduce un la opcion válida\n");
			break;

		}

	}
}




