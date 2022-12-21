import java.awt.Graphics;
import javax.swing.*;

public class DrawMyRect extends JPanel {
    public int x;
    public int y;
    public int longu;
    public int larg;
    public DrawMyRect setx(int i){
        x=i;
        return this;}
    public DrawMyRect sety(int i){
        y=i;
        return this;}
    public DrawMyRect setlongu(int i){
        longu=i;
        return this;}
    public DrawMyRect setlarg(int i){
        larg=i;
        return this;}



    public void paint(Graphics g) {

        g.drawRect(x, y, longu, larg);
    }
}

