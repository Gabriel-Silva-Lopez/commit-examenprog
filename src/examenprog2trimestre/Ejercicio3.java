package examenprog2trimestre;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static void informacionVideojuegos(String nombre) {
		File file = new File(nombre);
		try {
			ArrayList<String> l = new ArrayList<String>();
			Scanner f = new Scanner(file);
			while(f.hasNextLine()){
				String linea = f.nextLine();
				String[] lSep = linea.split(",");
				String pegado = "";
				boolean empiezo = false;
				for(int i = 0; i < lSep.length; i++) {
					if(empiezo) {
						if(!lSep[i].equals("") && Character.toString(lSep[i].charAt(lSep[i].length() - 1)).
								equalsIgnoreCase("\"") &&
								Character.toString(lSep[i+1].charAt(0)).equalsIgnoreCase("\"")) {
							
						}
					} else if(!lSep[i].equals("") && !Character.toString(lSep[i].charAt(lSep[i].length() - 1)).
								equalsIgnoreCase("\"") &&
								Character.toString(lSep[i+2].charAt(0)).equalsIgnoreCase("\"")) {
						} else {
							l.add(lSep[i]);
							
						}
					}
					System.out.println(lSep[i]);
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
