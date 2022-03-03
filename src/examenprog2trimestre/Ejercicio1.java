package examenprog2trimestre;

import java.util.Scanner;

public class Ejercicio1 {
	
	/**
	 * Pre:  ---
	 * Post: Metodo Para crear a los jugadores con sus campos
	 */
	public static Jugador[] crearJugador(int jugadores) {
		Jugador[] j = new Jugador[jugadores];
		int portero1 = (int) (Math.random()*j.length);
		int disparador1 = 0;
		while(disparador1 == portero1) {
			disparador1 = (int) (Math.random()*j.length);
		}
		j[portero1].setPortero(true);
		j[disparador1].setPortero(true);
		for(int i = 0; i < j.length;i++) {
			String nombrejuga = nomJuga();
			j[i].setNombre(nombrejuga);
			j[i].setDorsal(i);
			int potenciadispa = habilidaDisparo();
			int habildadporte = habilidadPortero();
			j[i].setPotenciadisparo(potenciadispa);
			j[i].setCalidadporteria(habildadporte);
			if(j[i].getPortero() != true) {
				j[i].setPortero(false);
			}
			if(j[i].getDisparador() != true) {
				j[i].setDisparador(false);
			}
			j[i].setVidas(2);
		}
		return j;
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo que le que concede un nombre a un jugador
	 */
	
	public static String nomJuga() {
		String nombre = "";
		String[] jugasNom = new String[] {"Pedro","Luis","Jose","Raul","Diego", "Carlos",
				"Mario","Pablo","Gabriel","Javier", "Erik", "Oliver", "Paul", "Daniel"};
		for(int i = 0; i < 1; i++) {
			 nombre  =  nombre + jugasNom[(int) (Math.random()*jugasNom.length)];
		}
		return nombre;
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo que genera la habilidad del jugador para ejercer de disparador
	 */
	public static int habilidaDisparo() {
		int d = (int) (Math.random()*10);
		return d;
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo que genera la habilidad del jugador para ejercer de portero
	 */
	public static int habilidadPortero() {
		int p = (int) (Math.random()*10);
		return p;
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo que muestra el menu por pantalla 
	 */
	public static void menu() {
		 System.out.println("\n======================================================");
		 System.out.println("||                   MENU EL RAPIDO                ||");
		 System.out.println("||                                                 ||");
		 System.out.println("||  1. Jugar al rapido                             ||");
		 System.out.println("||  2. salir                                       ||");
		 System.out.println("=====================================================\n");
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo que compara a los jugadores y sus habilidades para restar sus vidas o
	 * mantenerlas
	 */
	public static void comparador(Jugador[] ju) {
		int jugadorataca = 0;
		int jugadordefiende = 0;
		for(int i = 0; i < ju.length; i++) {
			if(ju[i].getDisparador() == true) {
				jugadorataca = ju[i].getDorsal();
			}
			if(ju[i].getPortero() == true) {
				jugadordefiende = ju[i].getDorsal();
			}
		}
		int nuevodisparador = (int) (Math.random()*ju.length-1);
		if(ju[jugadorataca].getPotenciadisparo() >= ju[jugadordefiende].getCalidadporteria() &&
				ju[jugadordefiende].getVidas() > 0) {
			ju[jugadordefiende].setVidas(ju[jugadordefiende].getVidas()-1);
			ju[jugadorataca].setPortero(true);
			ju[jugadorataca].setDisparador(false);
			ju[jugadordefiende].setPortero(false);
			while(jugadorataca == ju[nuevodisparador].getDorsal() && ju[nuevodisparador].getVidas() > 0) {
				nuevodisparador = (int) (Math.random()*ju.length-1);
			}
			if(ju[nuevodisparador] != ju[jugadorataca]) {
				ju[nuevodisparador].setDisparador(true);
			}
		}
		else if(ju[jugadorataca].getPotenciadisparo() < ju[jugadordefiende].getCalidadporteria() &&
				ju[jugadordefiende].getVidas() > 0) {
			while(jugadorataca == ju[nuevodisparador].getDorsal() && ju[nuevodisparador].getVidas() > 0) {
				nuevodisparador = (int) (Math.random()*ju.length-1);
			}
			if(ju[nuevodisparador] != ju[jugadorataca]) {
				ju[nuevodisparador].setDisparador(true);
			}
		}
	}
	
	/**
	 * Pre:  ---
	 * Post: Metodo main en el que se le pide al usuario si desea ver o salir el juego rapido
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean bucle = true;
		while(bucle==true) {
			menu();
			int operacion;
			if(entrada.hasNextInt()) {
				operacion = entrada.nextInt();
				if(operacion == 1) {
					System.out.print("Dame la cantidad de jugadores que deseas: ");
					int jugadores = entrada.nextInt();
					Jugador[] j = crearJugador(jugadores);
					int contador = 0;
					for (int i = 0; i > j.length; i++) {
						if(j[i].getVidas() > 0) {
							contador++;
						}
						while(contador>2) {
							comparador(j);
						}
					}
				} else if(operacion==2) {
					bucle = false;
					entrada.close();
					break;
				} else {
					System.out.print("Dame un numero valido: ");
				}
			}
		}

	}

}
