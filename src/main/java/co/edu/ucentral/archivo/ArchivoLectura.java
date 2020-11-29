package co.edu.ucentral.archivo;

import co.edu.ucentral.archivo.metodos.RadixSort;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArchivoLectura {

	private static File file;
	private static BufferedReader bf;
	private static FileReader is;
        
        List<String> listaCvc = new ArrayList<String>();
        ArrayBase arrayBase = new ArrayBase();
        List<Fila> array = new ArrayList<Fila>();
        Fila fila = new Fila();
        
        
        public void openArchiv(String archivo) {
		try {
			file = new File(archivo);
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
                            listaCvc.add(linea);
                            Fila nuevaFila = new Fila();
                            nuevaFila.setFila(fila.convierteLineatoAscii(linea));
                            array.add(nuevaFila);
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

	public void tempArrayVer()
        {
            for(int i = 0 ; i < array.size(); i++)
            {
                for(Fila fila : array)
                {
                    System.out.print(fila + "\n");
                }
            }
        }
}
