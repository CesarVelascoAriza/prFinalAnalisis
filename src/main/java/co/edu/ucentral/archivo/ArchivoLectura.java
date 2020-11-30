package co.edu.ucentral.archivo;

import co.edu.ucentral.archivo.metodos.RadixSort;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
        RadixSort rs = new RadixSort();
        
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

	public List<Fila> leerArchivo() {
            
            try {
                    
                    bf.lines().forEach(linea -> {
                            System.out.println(linea);
                            listaCvc.add(linea);
                            List<Integer> filaAscii = new ArrayList<>();
                            filaAscii = fila.convierteLineatoAscii(linea);
                            Fila nuevaFila = new Fila(
                                    filaAscii, linea, 0, 0
                            );
                            array.add(nuevaFila);
                    });
                    
            } catch (NoSuchElementException e) {
                    System.err.println("Fila no formada");
                    array = null;
            } catch (IllegalStateException e) {
                    System.err.println("Error al leer el archivo");
                    array = null;
            }
            return array;
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

    public void ordenamiento(List<Fila> fila) {
        array = fila ;
        int mayor = 0;
        Integer [] listArray = null;
        
        for(Fila row : array)
        {
            int cant = row.getFila().size();
            mayor = cant > mayor ? cant : mayor;
        }
        System.out.print(mayor + "\n");
        
         for (Fila row : array)
         {
             int cant = row.getFila().size();
             int eleva = mayor - cant;
             String strVal = "";
             for (int i=0; i < row.getFila().size(); i++)
             {
                 strVal += row.getFila().get(i).toString();
             }
             double numero = Double.parseDouble(strVal);
             double iguala = Math.pow(10,eleva);
             double dbLinea = numero*iguala;
             row.setDblinea(dbLinea);
             System.out.println(dbLinea+"\n");
        }
        
         int i=0;
        for (Fila row: array)
        {
            listArray[i]= (int) row.getDblinea();
            i++;
        }
        rs.Ordenaradix(listArray);
        
    }
}
