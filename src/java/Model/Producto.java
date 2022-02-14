/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author Entrar
 */
public class Producto {
    private final String isbn;
    private final String title;
    private final int pageCount;
    private final String thumbnail;
    private final double price;
    
    public Producto(String isbn, String title,
            String url, int pageCount){
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.thumbnail = url;
        this.price = Math.random() * (57 - 9) + 9;
    }   
    
     public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return this.title;
    }
    
    
}
