package es.cesur.ejercicio2;

import java.io.Serializable;


// Implementamos Serializable para que los objetos sean convertidos en una secuencia de bytes
public class Listin  implements Serializable {
	
	// El serialVersionUID sirve para garantizar la version de objeto Serializable
	private static final long serialVersionUID = 1L;
	
	// Añadimos los atributos
	private String nombre;
    private String direccion;
    private String telefono;
    
    
    public Listin(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    // Creamos los get y set para que accedan a los datos
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }

}
