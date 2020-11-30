/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucentral.archivo.metodos;

/**
 *
 * @author mrpeanutbutter
 */
public class RadixSort {
    
    private static Integer[] Vector=null;
    
    public String ImpArreglo(int[] array)
    {
        String result = "[";
        int j=0;
        String pvec= "[";
        while(j < array.length)
        {
            pvec += array[j]+",";
            j++;
        }
        pvec += "]\n";
        System.out.println(pvec);
        return result;
    }
    
    public Integer[] Ordenaradix(Integer[] array) {
        Vector = array;    
        double mayor = 0;
        for (int i = 1; i < Vector.length; i++) {
          if (Vector[i] > mayor) {
            mayor = Vector[i];
          }
        }
        int posición = 1;// desde unidades
        while (mayor / posición > 0) {
          ordenacontando(posición);
          posición = posición * 10;
        }
        
        return Vector;
    }

    public void ordenacontando(Integer posición){
        int tamaño = Vector.length;
        Integer[] intercambio = new Integer[tamaño];
        Integer[] cuántosenlaposición = new Integer[10];
        for(int i = 0; i < tamaño; i++){
            cuántosenlaposición[(Vector[i]/posición)%10]++;
        }

        for(int i = 1; i < 10; i++){
            cuántosenlaposición[i] = cuántosenlaposición[i] + cuántosenlaposición[i-1];
        }

       int indice=0;
       for(int i = tamaño-1; i >=0; i--){
          indice=(Vector[i]/posición)%10;
          intercambio[cuántosenlaposición[indice] - 1] = Vector[i];
          cuántosenlaposición[indice]--;
       }
       Vector=intercambio;

    }
    
    
}
