package gestion.profesor;

import java.io.IOException;
import java.util.Scanner;

public class profesor {

	public static void main(String[] args) throws IOException {
		

		Scanner leer = new Scanner(System.in);

		boolean opcion = false;

		do {
			System.out.println("Introduzca la asignatura que desee gestionar:");
			System.out.println(" MATEMATICAS LENGUA FISICA  QUIMICA  HISTORIA  INGLES");

			String asignatura = leer.next();
			System.out.println(" ");
			asignatura = asignatura.toUpperCase();

			if (!asignatura.equals("MATEMATICAS") && !asignatura.equals("LENGUA") && !asignatura.equals("FISICA")
					&& !asignatura.equals("QUIMICA") && !asignatura.equals("HISTORIA")
					&& !asignatura.equals("INGLES")) {
				System.out.println("ERROR. Introduce una asignatura válida");
				opcion = true;
			} else {
				mostrarMenu(asignatura);
			}

		} while (opcion);

	}

	 public static void mostrarMenu(String asignatura) throws IOException {

	        Scanner l = new Scanner(System.in);

	        System.out.println("Elija una opcion:");
	        System.out.println("1.Introducir notas de los alumnos");
	        System.out.println("2.Calcular la media de la asignatura");
	        System.out.println("3.Calcular la moda de la asignatura");
	        System.out.println("4.El DNI de la nota mas alta");
	        System.out.println("5.El DNI de la nota mas baja");

	        int num = l.nextInt();

	        switch(num) {

	        case 1: 
	            introducirNotasAlumnos.principal(asignatura, num);
	            break; 
	        case 2: 
	            introducirNotasAlumnos.principal(asignatura, num);
	            break; 
	        case 3: 
	            introducirNotasAlumnos.principal(asignatura, num);
	            break; 
	        case 4: 
	            introducirNotasAlumnos.principal(asignatura, num);
	            break; 
	        case 5: 
	            introducirNotasAlumnos.principal(asignatura, num);
	            break; 
	        default: 
	            System.out.println("Introduce un la opcion válida\n");



	        }


	    }




	}
