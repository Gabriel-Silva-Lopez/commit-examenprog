package examenprog2trimestre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void informacionVideojuegos(String nombre) {
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()){
				ArrayList<String> plataformas = new ArrayList<String>();
				String linea = f.nextLine();
				String[] separador = linea.split(",");
				boolean empiezo = false;
				if(empiezo) {
					for(int i = 0; i < linea.length(); i++) {
						if(separador[i].contains("\"")) {
							separador[i] = separador[i] + separador[i+1];
							System.out.println(separador[i]);
						}
					}				
				} else {
						empiezo = true;
					}
				}

			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero: ");
		String nombreFichero = entrada.nextLine();
		informacionVideojuegos(nombreFichero);
		entrada.close();
	}
}
