package ficheros;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class asignaturas {

	public static void main(String[] args) throws IOException {
	

		File fichero = new File ("asignaturas.txt");
		
		PrintWriter escribir = new PrintWriter(fichero);
		
		String [] asignaturas = {"MATÉMATICAS", "LENGUA", "FÍSICA", "QUÍMICA", "HISTORIA", "INGLES" };
		
		escribir.println("Existen " + asignaturas.length + " asignaturas: ");
		
		for (int i = 0; i < asignaturas.length; i++) {
			
			escribir.println(i + "." + asignaturas[i]);
			escribir.print(" ");
		
		}
		
		escribir.close();
			
	}

}
