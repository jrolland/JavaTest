import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import javax.swing.*;
public class Rectangles extends JPanel{

        private static int gap=2, width=20, offset=2,
                deltaX=gap+width+offset;
        private Rectangle
                //blueSquare = new Rectangle(gap+offset, gap+offset, width, width),
                redSquare = new Rectangle(gap, 10, width, 5*width);

        private AlphaComposite makeComposite(float alpha) {
            int type = AlphaComposite.SRC_OVER;
            return(AlphaComposite.getInstance(type, alpha));
        }

        private void drawSquares(Graphics2D g2d, float alpha) {
            Composite originalComposite = g2d.getComposite();
            g2d.setPaint(Color.blue);
            //g2d.fill(blueSquare);
            g2d.setComposite(makeComposite(alpha));
            g2d.setPaint(Color.red);
            g2d.fill(redSquare);
            g2d.setComposite(originalComposite);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D)g;
            for(int i=0; i<63; i++) {
                drawSquares(g2d, 0.2F+(i*0.01F));
                g2d.setColor(Color.blue);
                g2d.drawString(toString().valueOf(i+1),4,50);
                g2d.translate(deltaX, 0);

            }
        }
}
