package Control;

import Control.FrontCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class GoToMainPage extends FrontCommand{

    @Override
    public void process() {
        
        try {
            forward("/mainPage.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GoToCart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
