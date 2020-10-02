import java.awt.*;
import java.applet.*;


    public class H118Ovals extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            int teller;
            int hoogte = 0;
            int breedte = 0;

            for (teller = 0; teller <= 100; teller++) {
                hoogte += 10;
                breedte += 10;
                g.drawOval(20, 20, breedte, hoogte);
            }
        }
    }