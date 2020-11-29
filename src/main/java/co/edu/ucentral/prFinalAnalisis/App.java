package co.edu.ucentral.prFinalAnalisis;

import java.util.NoSuchElementException;
import java.util.Scanner;

import co.edu.ucentral.archivo.ArchivoEscritura;
import co.edu.ucentral.archivo.ArchivoLectura;

/**
 * Hello world!
 *
 */
public class App 
{
	private final static MenuOpcion[] opcion= MenuOpcion.values();
	private static Scanner entrada;
    public static void main( String[] args )
    {
    	MenuOpcion opciones =optenerOpcion();
    	
    	while (opciones != MenuOpcion.SALIR) {
			switch (opciones) {
			case INGRESARARCHIVO:
				ingresarArchivo(opciones);
				break;
			case BUSCARPALABRA:
				buscarPalabra(opciones);
				break;
			case GUARDARRESULTADO:
				manipularArchivoSalida(opciones);
				break;
			case MENU:
				break;
			case SALIR:
				break;
			}
		opciones = optenerOpcion();
		}
    }

	private static void manipularArchivoSalida(MenuOpcion opciones) {
		ArchivoEscritura escritura = new ArchivoEscritura();
		escritura.abrirArchivo("");
		escritura.escribirArchivo();
		escritura.cerrarArchivo();
		optenerOpcion();
	}

	private static void buscarPalabra(MenuOpcion opciones) {
		entrada = new Scanner(System.in);
		System.out.println("Ingrese la palabra que decea buscar en el archivo");
    	System.out.print("$");
    	String palabra = entrada.nextLine();
    	System.out.printf("%nla palabra que desea buscar es la %s%n", palabra);
    	resultadosBusquda(palabra);
    	
    	optenerOpcion();
		
	}

	private static void resultadosBusquda(String palabra) {
		System.out.println("el resultado del abusqueda es :");
		
	}

	private static void ingresarArchivo(MenuOpcion opcion) {
		String nombreArchivo;
    	entrada = new Scanner(System.in);
    	System.out.println("Ingrese la ruta del archivo");
    	System.out.print("$");
    	nombreArchivo =entrada.nextLine();
    	manipulacionArchivo(nombreArchivo);
		optenerOpcion();
	}

	private static MenuOpcion optenerOpcion() {
		entrada = new Scanner(System.in);
		int opciones=5;
		System.out.printf("Ingrese la Opcion del menu%n%s%n%s%n%s%n%s%n%s%n",
				"1 - Ingresar El archivo",
				"2 - Buscar Palabra",
				"3 - Guardar Resultado",
				"4 - MENU",
				"5 - Salir");
		try {
			do {
				System.out.printf("%n?");
				opciones=entrada.nextInt();
			} while ((opciones < 1)||(opciones > 5));
		} catch (NoSuchElementException e) {
			System.err.println("Error ingresando la entrada ");
		}
		return opcion[opciones -1];
	}

	private static void manipulacionArchivo(String nombreArchivo) {
		ArchivoLectura lectura = new ArchivoLectura();
		lectura.openArchiv(nombreArchivo);
		lectura.cerrarArchivo();
	}
}
