/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.json.JsonValue;

/**
 *
 * @author Entrar
 */
public class Catalogo {
    private static ArrayList<Producto> catalogo;
    
    public Catalogo(String url){
        try {
            buildCatalog(url);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Catalogo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ArrayList<Producto> getCatalogo() {
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

    private void buildCatalog(String url) throws FileNotFoundException {
        ArrayList<Producto> cat = new ArrayList<>();
        JsonReader reader;
        reader = Json.createReader(new FileReader(url));
        JsonArray jsoarr = reader.readArray();
        for (JsonValue jsonValue : jsoarr) {
            String title = ((JsonObject) jsonValue).getString("title");
            String isbn = ((JsonObject) jsonValue).getString("isbn");
            String thumbnailUrl = ((JsonObject) jsonValue).getString("thumbnailUrl");
            int pageCount = ((JsonObject) jsonValue).getInt("pageCount");
            cat.add(new Producto(isbn, title, thumbnailUrl, pageCount));
        }
        Catalogo.catalogo = cat;
        
    }
    
    
}
