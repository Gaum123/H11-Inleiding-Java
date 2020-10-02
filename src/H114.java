import java.awt.*;
import java.applet.*;


public class H114 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int hoogte = 0;
        int breedte = 0;
        int x = 120;
        int y = 120;

        for(teller = 0; teller <= 5; teller++) {
            hoogte += 10;
            breedte += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, breedte, hoogte);
        }
    }
}