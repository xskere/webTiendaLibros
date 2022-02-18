package Control;

import Model.Carrito;
import Control.FrontCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

public class GoToCheckout extends FrontCommand{

    @Override
    public void process() {
        HttpSession session = request.getSession(true);
        
        Carrito cart = (Carrito) session.getAttribute("cart");

        if(cart == null){
            cart = new Carrito();
        }
        
        if(cart.getCarrito().isEmpty()){
            try {
                forward("/unknown.jsp");
            } catch (ServletException ex) {
                Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        cart.emptyCarrito();
        
        session.setAttribute("cart", cart);
        
        try {
            forward("/buyPage.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
