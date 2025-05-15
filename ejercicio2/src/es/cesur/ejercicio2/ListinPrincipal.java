package es.cesur.ejercicio2;

import java.io.*;
import java.util.Scanner;


public class ListinPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Creamos un array Listin para 2 personas
		Listin[] agenda = new Listin[2];
		
		
		// Utilizo el bucle for para rellenar el array agenda con el objeto tipo Listin
		 for (int i = 0; i < agenda.length; i++) {
	            System.out.println("Introduce los datos de la persona " + (i + 1) + ":");

	            System.out.print("Nombre: ");
	            String nombre = sc.nextLine();

	            System.out.print("Dirección: ");
	            String direccion = sc.nextLine();

	            System.out.print("Teléfono: ");
	            String telefono = sc.nextLine();

	            agenda[i] = new Listin(nombre, direccion, telefono);
	        }
		 
		 // Guarda el array en un fichero binario
	        try {
	        	// Crea el archivo y se envian los datos binarios
	            FileOutputStream fos = new FileOutputStream("ivanjaenListin.bin");
	            
	            // Se envuelve en un buffer para almacenar temporalmente los datos antes de enviarse
	            BufferedOutputStream bos = new BufferedOutputStream(fos);
	            
	            // Se traducen los objetos a binarios y enviarlos a traves del buffer
	            ObjectOutputStream oos = new ObjectOutputStream(bos);

	            // Se encaraga de escribir los datos en el array agenda
	            oos.writeObject(agenda);

	            oos.close();
	            bos.close();
	            fos.close();

	            System.out.println("\nFichero binario generado correctamente.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
	        // try catch para leer fichero binario y mostrar el contendo
	        try {
	            FileInputStream fis = new FileInputStream("ivanjaenListin.bin");
	            BufferedInputStream bis = new BufferedInputStream(fis);
	            ObjectInputStream ois = new ObjectInputStream(bis);
	            // Se crean flujos de entrada para leer objetos desde el archivo 
	            
	            Listin[] agendaLeida = (Listin[]) ois.readObject();
	            // Lee el array completo y lo convierte a Listin[] usando cast	            
	            
	            System.out.println("\nContenido del fichero:");
	            
	            // Recorremos el array y se imprime en la consola
	            for (Listin persona : agendaLeida) {
	                System.out.println(persona);
	            }

	            ois.close();
	            bis.close();
	            fis.close();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        sc.close();
	}

}
