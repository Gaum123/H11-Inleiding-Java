import java.applet.*;
import java.awt.*;

public class H113 extends Applet {

    public void paint(Graphics g) {

        int teller;
        int y = 20;

        for(teller = 1; teller <= 1000;) {
            teller += teller;
            g.drawString("" + teller, 40, y);
            y += 20;
        }

    }

}