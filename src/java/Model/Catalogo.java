/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Entrar
 */
public class Catalogo {
    private ArrayList<Libro> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }
    
    public void add(Libro lib){
        this.catalogo.add(lib);
    }
    
}
