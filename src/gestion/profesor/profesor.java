package gestion.profesor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class profesor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		 
		System.out.println("Introduzca la asignatura que desee gestionar:");
		System.out.println(" MATÉMATICAS LENGUA FÍSICA  QUÍMICA  HISTORIA  INGLES");
		
		String asignatura = leer.next(); 
		System.out.println(" ");
		asignatura.toUpperCase();
		
		mostrarMenu(asignatura);
		
		
	}
	
	public static void mostrarMenu(String asignatura) throws IOException {
		
		Scanner l = new Scanner(System.in);
		
		System.out.println("Elija una opcion:");
		System.out.println("1.Introducir notas de los alumnos");
		System.out.println("2.Calcular la media de la asignatura");
		System.out.println("3.Calcular la moda de la asignatura");
		System.out.println("4.El DNI de la nota más alta");
		System.out.println("5.El DNI de la nota más baja");
		
		int num = l.nextInt();
		
		switch(num) {
		
		case 1: 
			introducirNotasAlumnos.main(asignatura, num);
			break; 
		case 2: 
			introducirNotasAlumnos.main(asignatura, num);
			break; 
		case 3: 
			introducirNotasAlumnos.main(asignatura, num);
			break; 
		case 4: 
			introducirNotasAlumnos.main(asignatura, num);
			break; 
		case 5: 
			introducirNotasAlumnos.main(asignatura, num);
			break; 
		default: 
			System.out.println("Introduce un la opcion válida\n");
			
	
		
		}
		
		
	}
	
	

	
}
