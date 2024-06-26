package tpPoo;

public class Jugador extends Persona {
    private String posicion;
    private int numeroCamiseta;

    // Constructor
    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        super(nombre, edad);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Getters y Setters
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

	@Override
	public String toString() {
		return "Jugador [posicion=" + posicion + ", numero de camiseta=" + numeroCamiseta + super.toString() + "]";
	}

    
}