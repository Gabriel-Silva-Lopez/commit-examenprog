package examenprog2trimestre;

public class Jugador {
	
	private String nombre;
	private int dorsal;
	private int potenciadisparo;
	private int calidadporteria;
	private int vidas;
	
	public Jugador(String nombre, int dorsal, int potenciadisparo, int calidadporteria, int vidas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.potenciadisparo = potenciadisparo;
		this.calidadporteria = calidadporteria;
		this.vidas = vidas;
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
	
}
