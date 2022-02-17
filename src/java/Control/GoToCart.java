package Control;

import Model.Carrito;
import Control.FrontCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

public class GoToCart extends FrontCommand{

    @Override
    public void process() {
        HttpSession session = request.getSession(true);


        Carrito cart = (Carrito) session.getAttribute("cart");

        if(cart == null){
            cart = new Carrito();
        }
        
        session.setAttribute("cart", cart);
        
        try {
            forward("/cart.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
