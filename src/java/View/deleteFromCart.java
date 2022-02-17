package View;

import Model.Carrito;
import Model.FrontCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

public class deleteFromCart extends FrontCommand{

    @Override
    public void process() {
        HttpSession session = request.getSession(true);

        Carrito cart = (Carrito) session.getAttribute("cart");

        if(cart == null){
            cart = new Carrito();
        }
            
        if(request.getParameter("book") != null){  
            cart.delete(request.getParameter("book"));
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
