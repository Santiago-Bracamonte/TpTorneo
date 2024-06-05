package tpPoo;


import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorEquipo {
    private LinkedList<Equipo> equipos;

    public GestorEquipo() {
        this.equipos = new LinkedList<>();
    }
    
    public int getCantidadTotalEquipos() {
    	return equipos.size();
    }
    
    public LinkedList<Equipo> getEquipos() {
    	return equipos;
    }
    // métodos
    
    /* agrego equipo a la lista*/
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    /* elimino equipo de la lista*/

    public void eliminarEquipo(String nombreEquipo) {
        for (int i = 0; i < equipos.size(); i++) {
            Equipo equipo = equipos.get(i);
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                equipos.remove(i);
                break; 
            }
        }
    }
    /* busco equipo por nombre*/

    public Equipo buscarEquipoPorNombre(String nombreEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                return equipo;
            }
        }
        return null;
    }
    

    // Simula un partido
    public void jugarPartido(Equipo equipo1, Equipo equipo2) {
        int golesEquipo1 = (int) (Math.random() * 5); 
        int golesEquipo2 = (int) (Math.random() * 5);

        String resultado = "Resultado del partido: " + equipo1.getNombre() + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipo2.getNombre();
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    //modifico jugador y valido campos para que el equipo no sea null ni el nombre sea null
    public void modificarJugador(GestorEquipo gestorEquipo) {
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
        Equipo equipo = gestorEquipo.buscarEquipoPorNombre(nombreEquipo);
        if (equipo != null) {
            String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del jugador a modificar:");
            Persona miembro = equipo.buscarMiembroPorNombre(nombreJugador);
            if (miembro != null) {
                Jugador jugador = (Jugador) miembro;
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del jugador:");
                String nuevaPosicion = JOptionPane.showInputDialog("Ingrese la nueva posición del jugador:");
                int nuevoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo número de camiseta del jugador:"));
                int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del jugador:"));

                jugador.setNombre(nuevoNombre);
                jugador.setPosicion(nuevaPosicion);
                jugador.setNumeroCamiseta(nuevoNumero);
                jugador.setEdad(nuevaEdad);

                JOptionPane.showMessageDialog(null, "Jugador modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Jugador no encontrado o no es un jugador válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
        }
    }
    
    //elimino jugador y valido campos para que el miembro del equipo y el nombre del equipo no sea null

    public void eliminarJugador(GestorEquipo gestorEquipo) {
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo:");
        Equipo equipo = gestorEquipo.buscarEquipoPorNombre(nombreEquipo);
        if (equipo != null) {
            String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del jugador a eliminar:");
            Persona miembro = equipo.buscarMiembroPorNombre(nombreJugador);
            if (miembro != null) {
                equipo.eliminarMiembro(nombreJugador);
                JOptionPane.showMessageDialog(null, "Jugador eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Jugador no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
        }
    }
    
    //agrego equipo

    public void agregarEquipo(GestorEquipo gestorEquipo) {
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del nuevo equipo:");
        String ciudadEquipo = JOptionPane.showInputDialog("Ingrese la ciudad del nuevo equipo:");

        Equipo nuevoEquipo = new Equipo(nombreEquipo, ciudadEquipo);
        gestorEquipo.agregarEquipo(nuevoEquipo);

        JOptionPane.showMessageDialog(null, "Club agregado exitosamente.");
    }
    
    //elimino equipo
    public void eliminarClub(GestorEquipo gestorEquipo) {
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo a eliminar:");
        Equipo equipo = gestorEquipo.buscarEquipoPorNombre(nombreEquipo);
        if (equipo != null) {
            gestorEquipo.eliminarEquipo(nombreEquipo);
            JOptionPane.showMessageDialog(null, "Club eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Equipo no encontrado.");
        }
    }
    
    //muestro equipos armados
    public void mostrarEquipos(GestorEquipo gestorEquipo) {
        String equiposInfo = "";
        for (Equipo equipo : gestorEquipo.getEquipos()) {
            equiposInfo += equipo.getNombre() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Equipos:\n" + equiposInfo);
        String nombreEquipo = JOptionPane.showInputDialog(null, "Ingrese el nombre del equipo para ver sus jugadores (o deje vacío para cancelar):");
        if (nombreEquipo != null && !nombreEquipo.isEmpty()) {
            Equipo equipoSeleccionado = gestorEquipo.buscarEquipoPorNombre(nombreEquipo);

            if (equipoSeleccionado != null) {
                String jugadoresInfo="";
                for (Persona jugador : equipoSeleccionado.getMiembros()) {
                    jugadoresInfo += jugador + "\n";
                }
                JOptionPane.showMessageDialog(null, "Jugdores del equipo" + equipoSeleccionado.getNombre() +":\n" + jugadoresInfo);
            } else {
                JOptionPane.showMessageDialog(null, "Equipo no encontrado");
            }
        }
    }
    //simulo torneo
    public void simularTorneo(GestorEquipo gestorEquipo) {
        LinkedList<Equipo> equipos = new LinkedList<>(gestorEquipo.getEquipos());
        LinkedList<Equipo> ganadores = new LinkedList<>();

        JOptionPane.showMessageDialog(null, "Comienza el torneo!");

        for (int etapa = 0; etapa < 4; etapa++) { //etapa 0 hasta etapa 4, sería octavos de final, cuartos, semis y final
            int partidosEnEstaEtapa = equipos.size() / 2;
            for (int i = 0; i < partidosEnEstaEtapa; i++) {
                Equipo equipo1 = equipos.get(i * 2);
                Equipo equipo2 = equipos.get(i * 2 + 1);
                Equipo ganador = simularPartido(gestorEquipo, equipo1, equipo2);
                ganadores.add(ganador);
            }
            equipos.clear(); // elimino todosloselementos de la lista equipos
            equipos.addAll(ganadores);// al ser eliminados anteriormente, en esta linea añado los ganadores 
            ganadores.clear();// en esta linea se elimina la lista de ganadores para que se vuelva a generar y se pueda utilizar en la 
            				// etapa del toreno
        }

        Equipo ganadorTorneo = equipos.get(0); // El ganador del torneo es el último equipo restante
        JOptionPane.showMessageDialog(null, "El ganador del torneo es: " + ganadorTorneo.getNombre());
    }

    public  Equipo simularPartido(GestorEquipo gestorEquipo, Equipo equipo1, Equipo equipo2) {
        gestorEquipo.jugarPartido(equipo1, equipo2);
        return equipo1; //  devolvemos el equipo1 como ganador     }
}

}

 