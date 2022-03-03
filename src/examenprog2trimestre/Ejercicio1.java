package examenprog2trimestre;

import java.util.Scanner;


public class Ejercicio1 {
	public static Jugador[] crearJugador(int jugadores) {
		Jugador[] j = new Jugador[jugadores];
		int portero1 = (int) (Math.random()*j.length-1);
		j[portero1].setPortero(true);
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
			j[i].setVidas(2);
		}
		return j;
	}
	
	public static String nomJuga() {
		String nombre = "";
		String[] jugasNom = new String[] {"Pedro","Luis","Jose","Raul","Diego", "Carlos",
				"Mario","Pablo","Gabriel","Javier", "Erik", "Oliver", "Paul", "Daniel"};
		for(int i = 0; i < 1; i++) {
			 nombre  =  nombre + jugasNom[(int) (Math.random()*jugasNom.length)];
		}
		return nombre;
	}
	
	public static int habilidaDisparo() {
		int d = (int) (Math.random()*10);
		return d;
	}
	
	public static int habilidadPortero() {
		int p = (int) (Math.random()*10);
		return p;
	}
	
	public static int
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la cantidad de jugadores que deseas: ");
		int jugadores = entrada.nextInt();
		crearJugador(jugadores);
		entrada.close();
	}

}
