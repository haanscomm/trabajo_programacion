package gestion.profesor;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class profesor {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		 
		System.out.println("Introduzca la asignatura que desee gestionar:");
		System.out.println(" MATÉMATICAS LENGUA FÍSICA  QUÍMICA  HISTORIA  INGLES");
		
		String asignatura = leer.next(); 
		System.out.println(" ");
		asignatura.toUpperCase();
		
		mostrarMenu(asignatura);
		System.out.println("Prueba");
		
	}
	
	public static void mostrarMenu(String asignatura) throws FileNotFoundException {
		
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
			introducirNotasAlumnos.introducirNotas(asignatura);
			break; 
		case 2: 
			calcularAlumnos.calcularMedia();
			break; 
		case 3: 
			calcularAlumnos.calcularModa();
			break; 
		case 4: 
			introducirNotasAlumnos.calcularNotaMasAlta();
			break; 
		case 5: 
			introducirNotasAlumnos.calcularNotaMasBaja();
			break; 
		default: 
			System.out.println("Introduce un la opcion válida\n");
			
	
		
		}
		
		
	}
	
	

	
}
