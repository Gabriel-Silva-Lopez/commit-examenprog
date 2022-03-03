package examenprog2trimestre;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la cantidad de jugadores que deseas: ");
		int jugadores = entrada.nextInt();
		System.out.print("Dame la longitud, para buscar palabras que coincidan con esa longitud: ");
		int longitud = entrada.nextInt();
		entrada.close();
	}

}
