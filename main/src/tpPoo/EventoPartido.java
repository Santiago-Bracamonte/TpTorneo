package tpPoo;
//ESTA CLASE AÚN NO ESTA EN USO, TENGO PENSADO UTILIZARLA EN EL FINAL-
//ESTA CLASE AÚN NO ESTA EN USO, TENGO PENSADO UTILIZARLA EN EL FINAL-
//ESTA CLASE AÚN NO ESTA EN USO, TENGO PENSADO UTILIZARLA EN EL FINAL-
//ESTA CLASE AÚN NO ESTA EN USO, TENGO PENSADO UTILIZARLA EN EL FINAL-
//ESTA CLASE AÚN NO ESTA EN USO, TENGO PENSADO UTILIZARLA EN EL FINAL-
//ESTA CLASE AÚN NO ESTA EN USO, TENGO PENSADO UTILIZARLA EN EL FINAL-

public class EventoPartido {
	  private String tipoEvento;
	    private int minuto;
	    private Equipo equipoAfectado;
		
	    public EventoPartido(String tipoEvento, int minuto, Equipo equipoAfectado) {
			super();
			this.tipoEvento = tipoEvento;
			this.minuto = minuto;
			this.equipoAfectado = equipoAfectado;
		}
	    
		public String getTipoEvento() {
			return tipoEvento;
		}

		public void setTipoEvento(String tipoEvento) {
			this.tipoEvento = tipoEvento;
		}

		public int getMinuto() {
			return minuto;
		}

		public void setMinuto(int minuto) {
			this.minuto = minuto;
		}

		public Equipo getEquipoAfectado() {
			return equipoAfectado;
		}

		public void setEquipoAfectado(Equipo equipoAfectado) {
			this.equipoAfectado = equipoAfectado;
		}

		@Override
		public String toString() {
			return "EventoPartido [tipoEvento=" + tipoEvento + ", minuto=" + minuto + ", equipoAfectado="
					+ equipoAfectado + "]";
		}
	    
	    
	    
}
