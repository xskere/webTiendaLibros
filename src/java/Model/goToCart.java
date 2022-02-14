package Model;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class goToCart extends FrontCommand{

    @Override
    public void process() {
        
        try {
            forward("/cart.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(goToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(goToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
