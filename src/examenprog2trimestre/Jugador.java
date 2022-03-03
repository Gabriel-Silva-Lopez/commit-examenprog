package examenprog2trimestre;

public class Jugador {
	
	private String nombre;
	private int dorsal;
	private int potenciadisparo;
	private int calidadporteria;
	private int vidas;
	private boolean portero;
	
	public Jugador(String nombre, int dorsal, int potenciadisparo, int calidadporteria, int vidas, boolean portero) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.potenciadisparo = potenciadisparo;
		this.calidadporteria = calidadporteria;
		this.vidas = vidas;
		this.portero = portero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getPotenciadisparo() {
		return potenciadisparo;
	}

	public void setPotenciadisparo(int potenciadisparo) {
		this.potenciadisparo = potenciadisparo;
	}

	public int getCalidadporteria() {
		return calidadporteria;
	}

	public void setCalidadporteria(int calidadporteria) {
		this.calidadporteria = calidadporteria;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public boolean getPortero() {
		return portero;
	}

	public void setPortero(boolean portero) {
		this.portero = portero;
	}
	
}
