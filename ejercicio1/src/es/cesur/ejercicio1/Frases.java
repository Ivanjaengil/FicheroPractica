package es.cesur.ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Frases {

	// Metodo que escribe la array de frases en el fichero de texto
	public static void escribirEnFichero(String nombreFichero, String[] frases) {
		
		
		try {
			FileWriter  fw = new FileWriter(nombreFichero);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Utilizo un bucle for para escribir cada frase
			for (String frase : frases) {
                bw.write(frase);
                bw.newLine();
            }
			
			bw.close();
			fw.close();
			
			 System.out.println("Fichero " + nombreFichero + " generado correctamente.");
			 
			 
		} catch (IOException e) {
			// En caso de error al escribir en el archivo muestra un error
			e.printStackTrace(); 
			} 
		}
		
	// Metedo que lee y muestra por consola el contenido del fichero
	public static void leerFichero(String nombreFichero) {
		try {
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader br = new BufferedReader(fr);
			
			String linea;
			System.out.println("\nContenido del Fichero: ");
			
			// Con el bucle While imprime cada linea del fichero
			 while ((linea = br.readLine()) != null) {
	                System.out.println(linea);
	            }
			 
			 br.close();
			 fr.close();
		} catch (IOException e) {
			// Muestra un errror si no se puede leer
			e.printStackTrace();
		} 
	}
	
	// Metedo que cuenta el numero total de palabras en el fichero
	public static int contarPalabras(String nombreFichero) {
	int contador = 0;
	
	try {
		File file = new File(nombreFichero);
		Scanner scanner = new Scanner(file); // Usamos el Scanner para leer palabra por palabra
		
		// Usamos el bucle While para leer cada palabra implementado un contador
		 while (scanner.hasNext()) {
             scanner.next();
             contador++;
         }
		 
		 scanner.close();
		
	} catch (FileNotFoundException e ) {
		// Muestra el error si no encuentra el fichero
		e.printStackTrace();
	}
	
	// y al final devuelve el numero total de palabras
	return contador;
	}
}
