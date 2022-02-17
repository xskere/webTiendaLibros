package Model;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> carrito;
    
    public Carrito(){
        this.carrito = new ArrayList<>();
    }
    
    public ArrayList<Producto> getCarrito() {
        return carrito;
    }
    
    public Producto get(String isbn){
        for (Producto producto : carrito) {
            if(producto.getIsbn().equals(isbn))
                return producto;
        }
        return null;
    }
    
    public void add(Producto lib){
        this.carrito.add(lib);
    }
    
    public void delete(String isbn){
        for (Producto producto : carrito) {
            if(producto.getIsbn().equals(isbn)){
                this.carrito.remove(producto);
                return;
            }
        }
    }

    public void emptyCarrito() {
        this.carrito = new ArrayList<>();
    }

}
