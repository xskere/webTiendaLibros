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
    private static ArrayList<Producto> catalogo;

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }
    
    public static Producto get(String isbn){
        for (Producto libro : catalogo) {
            if(libro.getIsbn().equals(isbn))
                return libro;
        }
        return null;
    }
    
    public void add(Producto lib){
        Catalogo.catalogo.add(lib);
    }

    public static ArrayList<Producto> buildCatalog() {
        ArrayList<Producto> cat = new ArrayList<>();
        
        cat.add(new Producto("1", "testBook1", "urlEsta1", 23));
        cat.add(new Producto("2", "testBook2", "urlEsta2", 24));
        cat.add(new Producto("3", "testBook3", "urlEsta3", 25));
        Catalogo.catalogo = cat;
        return cat;
        
    }
    
}
