package ficheros;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DNI_alumnos {

	public static void dni_alumnos() throws IOException {
		

		//Escribir 
		
		File fichero = new File ("alumnos.txt");
		
		PrintWriter escribir = new PrintWriter(fichero);
		
		int [] numeroDNI = new int [15];
	
		
		escribir.println("Existen " + numeroDNI.length + " alumnos");
		
		
		for (int i = 0; i < numeroDNI.length; i++) {
			
			numeroDNI[i] = obtenerDNI();
		//	escribir.print("DNI Alumno " + (i+1) + ": ");
			escribir.print(numeroDNI[i]);
			escribir.println(obtenerLetra(numeroDNI[i]));
		}
		
		escribir.close();
		
		
	}
	
	public static char obtenerLetra (int numeroDNI) {
		double DNI = numeroDNI;
		String letras = "QWERTYUIOPASDFGHJKLZXCVBNM";
		double resto = DNI % 23;
		return (letras.charAt((int) resto));
	}
	
	public static int obtenerDNI () {
		int DNI = (int) (Math.random()*(10000000-(100000000+1))+(100000000+1));		
		return DNI;
	}

}
