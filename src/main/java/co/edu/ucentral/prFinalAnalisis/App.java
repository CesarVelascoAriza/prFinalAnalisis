package co.edu.ucentral.prFinalAnalisis;

import co.edu.ucentral.archivo.ArchivoEscritura;
import co.edu.ucentral.archivo.ArchivoLectura;
import co.edu.ucentral.archivo.metodos.BinarySearch;
import co.edu.ucentral.archivo.metodos.RadixSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArchivoLectura lectura = new ArchivoLectura();
        RadixSort rs = new RadixSort();
        BinarySearch bs = new BinarySearch();
        
        //RadixSort, BinarySearch, HashModule
       
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
