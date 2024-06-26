package tpPoo;

import java.util.LinkedList;

public class EventoPartido {
    private String tipoEvento;
    private String equipo;
    private String jugador;
    private int minuto;

    public EventoPartido(String tipoEvento, String equipo, String jugador, int minuto) {
        this.tipoEvento = tipoEvento;
        this.equipo = equipo;
        this.jugador = jugador;
        this.minuto = minuto;
        
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getJugador() {
        return jugador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

    @Override
	public String toString() {
		return tipoEvento + " del equipo " + equipo + " al " + jugador + " en el minuto"
				+ minuto;
	}

	public static LinkedList<EventoPartido> generarEventosPartido(Equipo equipo1, Equipo equipo2) {
        String[] tiposEvento = {"Penal", "Tarjeta Amarilla", "Tarjeta Roja", "Falta"};
        int numeroEventos = (int) (Math.random() * 5); 
        
        LinkedList<EventoPartido> eventos = new LinkedList<>();

        for (int i = 0; i < numeroEventos; i++) {
            String tipoEvento = tiposEvento[(int) (Math.random() * tiposEvento.length)];
            String equipo;
            if (Math.random() > 0.5) {
                equipo = equipo1.getNombre();
            } else {
                equipo = equipo2.getNombre();	
            }
            String jugador = "Jugador" + (int) (Math.random() * 11 + 1);
            int minuto = (int) (Math.random() * 90 + 1);

            EventoPartido evento = new EventoPartido(tipoEvento, equipo, jugador, minuto);
            eventos.add(evento);
        }

        return eventos;
    }
} 

