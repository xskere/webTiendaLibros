/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

/**
 *
 * @author Entrar
 */
public class Catalogo {
    private static ArrayList<Producto> catalogo;
    
    public Catalogo(String url){
       
            buildCatalog(url);
        
        
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

    private void buildCatalog(String url){
        ArrayList<Producto> cat = new ArrayList<>();
        try {
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
           
        } catch (FileNotFoundException ex) {
            cat.add(new Producto("1933988673", "Unlocking Android","https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson.jpg", 416));
            cat.add(new Producto("1935182722", "Android in Action, Second Edition","https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson2.jpg", 592));
            cat.add(new Producto("1617290084", "Specification by Example","https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/adzic.jpg", 0));
            cat.add(new Producto("1933988746", "Flex 3 in Action","https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ahmed.jpg", 576));
            cat.add(new Producto("1935182420", "Flex 4 in Action","https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ahmed2.jpg", 600));
        }
        Catalogo.catalogo = cat;
        
    }
    
    
}
