package co.edu.ucentral.archivo;

import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ArchivoEscritura {
	
	private static Formatter salida;
	
	
	public void abrirArchivo(String archivo) {
		try {
			salida =new  Formatter(archivo+"\\Archivosalida.txt");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void escribirArchivo() {
	
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ", 
				"Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");
		while (input.hasNext()) // loop until end-of-file indicator
		{
			try {
				salida.format("%d %s %s %.2f%n", input.nextInt(),
						input.next(), input.next(), input.nextDouble());

			} catch (FormatterClosedException formatterClosedException) {
				// TODO: handle exception
				System.err.println("Error writing to file. Terminating.");
				break;
			}catch (NoSuchElementException elementException) {
				// TODO: handle exception
				System.err.println("Invalid input. Please try again.");
				input.nextLine();

			}
		}
		System.out.print("? ");

	}


	public void cerrarArchivo() {
		if(salida!= null)
			salida.close();
	}
}
