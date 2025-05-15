package es.cesur.ejercicio1;

import java.util.Scanner;

public class FrasesPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Recogemos el nombre que escribamos
		// Utilizo el .trim para eliminar espacios en blanco y al final
		System.out.println("Escriba su nombre completo");
		String nombre = sc.nextLine().trim();
		
		// Despues se construye con la extension .txt
		String nombreFichero = nombre + ".txt";
		
		// Creamos la array con las frases
		String[] frases = {
				"El sol brilla intensamente hoy.",
	            "Me gusta aprender cosas nuevas cada día.",
	            "La programación es una habilidad muy útil.",
	            "A veces, los errores enseñan más que los aciertos.",
	            "Leer libros expande la mente."			
		};
		
		
		// Llamamos a los 3 metodos de la clase Frases para escribir, imprimir 
		// y mostrar cuantas palabras en el fichero
		Frases.escribirEnFichero(nombreFichero, frases);
		Frases.leerFichero(nombreFichero);
		
		int totalPalabras = Frases.contarPalabras(nombreFichero);
		
		System.out.println("Numero total de palabras en el fichero son:  " + totalPalabras);
		sc.close();
		

	}

}
