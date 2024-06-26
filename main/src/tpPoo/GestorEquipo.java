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
    public Equipo jugarPartido(Equipo equipo1, Equipo equipo2) {
        int golesEquipo1 = (int) (Math.random() * 5); 
        int golesEquipo2 = (int) (Math.random() * 5);

        LinkedList<EventoPartido> eventos = EventoPartido.generarEventosPartido(equipo1, equipo2);

        while (golesEquipo1 == golesEquipo2) {
            JOptionPane.showMessageDialog(null, "Empate! Vamos a penales.");
            golesEquipo1 = (int) (Math.random() * 5); 
            golesEquipo2 = (int) (Math.random() * 5);
        }

        String resultado = "Resultado del partido: " + equipo1.getNombre() + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipo2.getNombre();
        JOptionPane.showMessageDialog(null, resultado);

        for (EventoPartido evento : eventos) {
        	JOptionPane.showMessageDialog(null, "Eventos del partido: \n " + evento.toString());
        }

        if (golesEquipo1 > golesEquipo2) {
            return equipo1;
        } else {
            return equipo2;
        }
    }
 
    
    //modifico jugador y valido campos para que el equipo no sea null ni el nombre sea null
    public void modificarJugador(GestorEquipo gestorEquipo) {
        Equipo equipo = gestorEquipo.buscarEquipoPorNombre(JOptionPane.showInputDialog("Ingrese el nombre del equipo:"));
        if (equipo != null) {
            Persona miembro = equipo.buscarMiembroPorNombre(JOptionPane.showInputDialog("Ingrese el nombre del jugador a modificar:"));
            if (miembro != null) {
                Jugador jugador = (Jugador) miembro;
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del jugador:");
                if (!esNombreValido(nuevoNombre)) {
                    JOptionPane.showMessageDialog(null, "El nombre del jugador solo debe contener letras.");
                    return;
                }
                String nuevaPosicion = JOptionPane.showInputDialog("Ingrese la nueva posición del jugador:");
                if (nuevaPosicion.equalsIgnoreCase("portero")) {
					JOptionPane.showMessageDialog(null, "No se puede añadir dos porteros a un mismo equipo");
					return;
				}
                int nuevoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo número de camiseta del jugador:"));
                int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del jugador:"));
                if (nuevoNombre.isEmpty() || nuevaPosicion.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Los campos de nuevo nombre, posición y edad no pueden estar vacíos.");
                    return;
                }
                if (nuevaEdad > 40) {
                    JOptionPane.showMessageDialog(null, "La edad del jugador no puede ser mayor a 40 años");
                    return;
                }
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
    

    public boolean esNombreValido(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return false;
        }
        for (char c : nombre.toCharArray()) {
            if (Character.isDigit(c)) {  // Verifica si el carácter es un dígito
                return false;
            }
        }
        return true;
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
        Equipo equipo = gestorEquipo.buscarEquipoPorNombre(JOptionPane.showInputDialog("Ingrese el nombre del equipo a eliminar:"));
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

        JOptionPane.showMessageDialog(null, "¡Comienza el torneo!");

        String[] etapas = {"OCTAVOS DE FINAL", "CUARTOS DE FINAL", "SEMIFINALES", "FINAL"};

        for (int etapa = 0; etapa < 4; etapa++) {
            JOptionPane.showMessageDialog(null, "ESTAMOS EN " + etapas[etapa]);

            int partidosEnEstaEtapa = equipos.size() / 2;
            for (int i = 0; i < partidosEnEstaEtapa; i++) {
                Equipo equipo1 = equipos.get(i * 2);
                Equipo equipo2 = equipos.get(i * 2 + 1);	
                String[] opciones = {equipo1.getNombre(), equipo2.getNombre()};
                int apuesta = JOptionPane.showOptionDialog(null,
                        "¿Quién ganará el partido entre " + equipo1.getNombre() + " y " + equipo2.getNombre() + "?",
                        "Apuesta",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                Equipo ganador = jugarPartido(equipo1, equipo2);
                ganadores.add(ganador);

                if ((apuesta == 0 && ganador == equipo1) || (apuesta == 1 && ganador == equipo2)) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Tu apuesta fue correcta.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lo siento, tu apuesta fue incorrecta.");
                }
            }
            
            equipos.clear();
            equipos.addAll(ganadores);
            ganadores.clear();
        }

        JOptionPane.showMessageDialog(null, "El campeón del torneo es: " + equipos.getFirst().getNombre());
    }
}