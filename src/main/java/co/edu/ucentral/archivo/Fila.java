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
    private String strlinea;
    private double dblinea;
    private int hash;

    public Fila(List<Integer> fila, String strlinea,double dblinea, int hash) {
        this.fila = fila;
        this.strlinea = strlinea;
        this.dblinea = dblinea;
        this.hash = hash;
    }

    public Fila() {
    }
    

    public List<Integer> getFila() {
        return fila;
    }

    public void setFila(List<Integer> fila) {
        this.fila = fila;
    }

    public String getStrlinea() {
        return strlinea;
    }

    public void setStrlinea(String strlinea) {
        this.strlinea = strlinea;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public double getDblinea() {
        return dblinea;
    }

    public void setDblinea(double dblinea) {
        this.dblinea = dblinea;
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
