package examenprog2trimestre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void palabrasMasLargasQue(String nombre, int l) {
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			int contador = 0;
			int contadorigual = 0;
			int contadormaslarga = 0;
			while(f.hasNextLine()){
				String parrafo = f.nextLine();
				String reemplazo = parrafo.replaceAll(",","").replaceAll("\\.", "")
						.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\"", "")
						.replaceAll(":", "");
				String[] linea = reemplazo.split(" ");
				for(int i = 0; i < linea.length; i++) {
					if(linea[i].length() >= l) {
						contador++;
						if(linea[i].length() == l) {
							contadorigual++;
						} else {
							contadormaslarga++;
						}
					}

				}
			}
			System.out.println("\nLas palabras que coinciden o sobrepasan esa la longitud son: " + contador);
			System.out.println("Iguales a la longitud: " + contadorigual);
			System.out.println("Mas largas que la longitud: " + contadormaslarga);
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		String nombreFichero = entrada.nextLine();
		System.out.print("Dame la longitud, para buscar palabras que coincidan con esa longitud: ");
		int longitud = entrada.nextInt();
		palabrasMasLargasQue(nombreFichero, longitud);
		entrada.close();
	}
}
