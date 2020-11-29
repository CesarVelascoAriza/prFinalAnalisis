/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucentral.archivo;

import java.util.List;

/**
 *
 * @author mrpeanutbutter
 */
public class ArrayBase {
    private List<Fila> archivolista;

    public ArrayBase(List<Fila> archivolista) {
        this.archivolista = archivolista;
    }

    public ArrayBase() {
    }
    
    
    
    public List<Fila> getArchivolista() {
        return archivolista;
    }

    public void setArchivolista(List<Fila> archivolista) {
        this.archivolista = archivolista;
    }

    
    
    
}
