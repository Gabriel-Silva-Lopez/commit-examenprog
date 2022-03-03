package examenprog2trimestre;

import java.util.Scanner;

public class Ejercicio1 {
	public static Jugador[] crearJugador(int jugadores) {
		Jugador[] j = new Jugador[jugadores];
		int portero1 = (int) (Math.random()*j.length-1);
		int disparador1 = 0;
		while(disparador1 == portero1) {
			disparador1 = (int) (Math.random()*j.length-1);
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
	
	public static void menu() {
		 System.out.println("\n======================================================");
		 System.out.println("||                   MENU EL RAPIDO                ||");
		 System.out.println("||                                                 ||");
		 System.out.println("||  1. Jugar al rapido                             ||");
		 System.out.println("||  2. salir                                       ||");
		 System.out.println("=====================================================\n");
	}
	
	public static void comparador(Jugador[] ju) {
		for(int i = 0; i < ju.length; i++) {
			if(ju[i].getDisparador() == true) {
				
			}
		}
	}
	
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
				} else if(operacion==2) {
					bucle = false;
					entrada.close();
					break;
				} else {
					System.out.print("Dame un numero valido: ");
					entrada.next();
				}
			}
		}

	}

}
