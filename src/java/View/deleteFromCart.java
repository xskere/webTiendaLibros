package View;

import Model.FrontCommand;
import Model.Producto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

public class deleteFromCart extends FrontCommand{

    @Override
    public void process() {
        HttpSession session = request.getSession(true);

        ArrayList<Producto> cart = (ArrayList<Producto>) session.getAttribute("cart");

        if(cart == null){
            cart = new ArrayList<>();
        }
            
        if(request.getParameter("book") != null){  
            for (Producto producto : cart) {
                if(producto.getIsbn().equals(request.getParameter("book"))){
                    cart.remove(producto);
                    break;
                }
            }
            session.setAttribute("cart", cart);  
        }
        
        try {
            forward("/cart.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(deleteFromCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(deleteFromCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
