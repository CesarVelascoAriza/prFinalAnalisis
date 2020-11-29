package co.edu.ucentral.prFinalAnalisis;

import co.edu.ucentral.archivo.ArchivoEscritura;
import co.edu.ucentral.archivo.ArchivoLectura;
import co.edu.ucentral.archivo.metodos.BinarySearch;
import co.edu.ucentral.archivo.metodos.RadixSort;
import java.util.ArrayList;
import java.util.List;

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
       
        lectura.openArchiv("/home/mrpeanutbutter/Documentos/U/2020-2/Analisis_de_Algoritmos/TrabajoFinal/ListaPalabras.csv");
    	lectura.leerArchivo();
        lectura.tempArrayVer();
    	lectura.cerrarArchivo();
    	ArchivoEscritura escritura= new ArchivoEscritura();
    	escritura.abrirArchivo("/home/mrpeanutbutter/Documentos/U/2020-2/Analisis_de_Algoritmos/TrabajoFinal/Resultado.csv");
    	escritura.escribirArchivo();
    	escritura.cerrarArchivo();
        System.out.println( "Hello World!" );
    }
}
