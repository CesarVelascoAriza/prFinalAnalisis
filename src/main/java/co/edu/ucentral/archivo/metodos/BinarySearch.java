/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucentral.archivo.metodos;

import java.util.Arrays;

/**
 *
 * @author mrpeanutbutter
 */
public class BinarySearch {
    
    private static void log(String result) {
            System.out.println(result);
    }

    public boolean binarySearch(int[] numbers, int numberToSearch) {

            int size = numbers.length; // Número de elementos
            int middle = size / 2; // Mitad del array

            // System.out.println("Size: " + size);
            // System.out.println("Middle: " + middle);
            // System.out.println("Array: " + Arrays.toString(numbers));

            if (numbers[middle] == numberToSearch)
                    return true;
            else if (size == 1)
                    return false;
            else if (numbers[middle] > numberToSearch)
                    return binarySearch(Arrays.copyOfRange(numbers, 0, middle), numberToSearch);
            else
                    return binarySearch(Arrays.copyOfRange(numbers, middle + 1, size), numberToSearch);

    }
    
    public int buscar( int [] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio+fin) / 2;
            if ( arreglo[pos] == dato )
              return pos;
            else if ( arreglo[pos] < dato ) {
         inicio = pos+1;
            } else {
         fin = pos-1;
            }
        }
        return -1;
    }
}