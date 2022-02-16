/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Catalogo;
import Model.FrontCommand;
import Model.Producto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Entrar
 */
public class addToCart extends FrontCommand{

    @Override
    public void process() {
        
        HttpSession session = request.getSession(true);

        ArrayList<Producto> cart = (ArrayList<Producto>) session.getAttribute("cart");

        if(cart == null){
            cart = new ArrayList<>();
        }
            
        if(request.getParameter("book") != null){   
            cart.add((Producto) Catalogo.get(request.getParameter("book")));
            session.setAttribute("cart", cart);  
        }
        
        try {
            request.setAttribute("added", true);
            forward("/mainPage.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(addToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(addToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
