package View;

import Model.FrontCommand;
import Model.Producto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

public class buy extends FrontCommand{

    @Override
    public void process() {
        HttpSession session = request.getSession(true);
        ArrayList<Producto> cart = new ArrayList<>();
        session.setAttribute("cart", cart);
        
        try {
            forward("/buyPage.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(goToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(goToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
