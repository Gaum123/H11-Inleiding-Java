import java.applet.*;
import java.awt.*;

public class H114 extends Applet {

    public void paint(Graphics g) {

        int teller;
        int y = 20;

        for(teller = 3; teller <= 30 ; teller++); {
            teller += teller;
            g.drawString("" + teller, 40, y);
            y += 20;
        }

    }

}