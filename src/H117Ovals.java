import java.awt.*;
import java.applet.*;


public class H117Ovals extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int hoogte = 0;
        int breedte = 0;
        int x = 300;
        int y = 300;

        for (teller = 0; teller <= 50; teller++) {
            hoogte += 10;
            breedte += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, breedte, hoogte);
        }
    }
}