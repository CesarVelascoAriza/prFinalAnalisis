/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucentral.archivo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mrpeanutbutter
 */
public class Fila {
    private List<Integer> fila;

    public Fila(List<Integer> fila) {
        this.fila = fila;
    }

    public Fila() {
    }
    

    public List<Integer> getFila() {
        return fila;
    }

    public void setFila(List<Integer> fila) {
        this.fila = fila;
    }
    
    public List<Integer> convierteLineatoAscii(String linea) {
        char caracter;
        List<Integer> arrayFila = new ArrayList<Integer>();
        for(int i=0;i < linea.length(); i++)
        {
            caracter = linea.charAt(i);
            int a = (int)caracter;
            arrayFila.add(a);
        }
        fila = arrayFila;
        return fila;
    }
}
