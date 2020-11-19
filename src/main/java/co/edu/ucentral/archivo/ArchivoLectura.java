package co.edu.ucentral.archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

public class ArchivoLectura {

	private static File file;
	private static BufferedReader bf;
	private static FileReader is;

	public void openArchiv() {
		try {
			file = new File("C:\\Users\\Adolfo\\Documents\\LISTA PALABRAS.csv");
			is = new FileReader(file);
			bf = new BufferedReader(is);
			
		} catch (IOException e) {
			System.err.println("Error al abrir el archivo");
			System.exit(1);
		}
	}

	public void leerArchivo() {

		try {
			bf.lines().forEach(linea -> {
				System.out.println(linea);
			});

		} catch (NoSuchElementException e) {
			System.err.println("Fila no formada");
		} catch (IllegalStateException e) {
			System.err.println("Error al leer el archivo");
		}

	}

	public void cerrarArchivo() {
		if (bf != null) {
			try {
				bf.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
