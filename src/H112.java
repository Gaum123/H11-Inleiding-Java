import java.awt.*;
import java.applet.*;


public class H112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 20;

        for(teller = 20; teller >= 10; teller--) {
            y += 20;
            g.drawString("" + teller, 100, y );
        }
    }
}