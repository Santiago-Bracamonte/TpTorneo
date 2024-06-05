package tpPoo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo {
    private String nombre;
    private String ciudad;
    private LinkedList<Persona> jugadores;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new LinkedList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCantidadTotalMiembros() {
    	return jugadores.size();
    }
    
    public LinkedList<Persona> getMiembros() {
    	return jugadores;
    }
    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }
    public void agregarMiembro(Persona persona) {
    	jugadores.add(persona);
    }
    
    public void eliminarMiembro(String nombre) {
        LinkedList<Persona> eliminarJugadores = new LinkedList<>(); // creo una lista para almacenar los jugadores a eliminar

        for (Persona jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                eliminarJugadores.add(jugador);
            }
        }
        jugadores.removeAll(eliminarJugadores); // elimino los jugadores encontrados de la lista original
    }
    
    public Persona buscarMiembroPorNombre(String nombre) {
    	for (Persona jugador : jugadores) {
    		if (jugador.getNombre().equalsIgnoreCase(nombre)) {
    			return jugador;
    		}
    	}
    	return null;
    }
}


