/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Carrito;
import Model.Catalogo;
import Control.FrontCommand;
import Model.Producto;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Entrar
 */
public class AddToCart extends FrontCommand{

    @Override
    public void process() {
        
        HttpSession session = request.getSession(true);

        Carrito cart = (Carrito) session.getAttribute("cart");

        if(cart == null){
            cart = new Carrito();
        }
            
        if(request.getParameter("book") != null){   
            cart.add((Producto) Catalogo.get(request.getParameter("book")));
            session.setAttribute("cart", cart);  
        }
        
        try {
            request.setAttribute("added", true);
            forward("/mainPage.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(AddToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AddToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
