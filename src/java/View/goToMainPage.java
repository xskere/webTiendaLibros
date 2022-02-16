package View;

import Model.FrontCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class goToMainPage extends FrontCommand{

    @Override
    public void process() {
        
        try {
            forward("/mainPage.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(goToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(goToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}