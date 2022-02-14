/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Entrar
 */
public class Libro {
    private final String isbn;
    private final String title;
    private final int pageCount;
    private final Date publishedDate;
    private final String thumbnail;
    private final double price;
    
    public Libro(String isbn, String title, Date date,
            String url, int pageCount){
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.publishedDate = date;
        this.thumbnail = url;
        this.price = Math.random() * (57 - 9) + 9;
    }   
    
     public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public double getPrice() {
        return price;
    }
    
    
}
