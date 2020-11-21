package co.edu.ucentral.prFinalAnalisis;

import co.edu.ucentral.archivo.ArchivoEscritura;
import co.edu.ucentral.archivo.ArchivoLectura;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArchivoLectura lectura = new ArchivoLectura();
    	lectura.openArchiv("");
    	lectura.leerArchivo();
    	lectura.cerrarArchivo();
    	ArchivoEscritura escritura= new ArchivoEscritura();
    	escritura.abrirArchivo("");
    	escritura.escribirArchivo();
    	escritura.cerrarArchivo();
        System.out.println( "Hello World!" );
    }
}
