import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class main {
    private static int num=25;




    public static void main(String[] args){
        Graphics g = new Graphics() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };
        JFrame monEcran = new JFrame();
        monEcran.setVisible(true);
        monEcran.setSize(500,200);
        monEcran.setTitle("Jeu de l'oie");
        DrawMyRect monRect= new DrawMyRect();
        monRect.x=100;
        monRect.y=20;
        monRect.longu=100;
        monRect.larg=100;
        monEcran.add(monRect);
        int de1= 1 + (int)(Math.random() * ((6 - 1) + 1));
        int de2= 1 + (int)(Math.random() * ((6 - 1) + 1));
        int place1=de1+de2;
        int place2=7;
        long monLong=1278;
        float monFloat=123.56f;
        double monDouble=122343444;
        System.out.println("De1 "+de1);
        System.out.println("De2 "+de2);

        String monTableau;
        String monCarreau;
        monTableau="";
        for (int i = 1; i < 63; i++){
            monCarreau=" "+i;
            if (monCarreau.length()==2) {
                monCarreau=" "+monCarreau;
            }
            monTableau=monTableau+monCarreau;
        }
        System.out.println(monTableau);
        String monJoueur1;
        String monJoueur2;
        monJoueur1="";
        monJoueur2="";
        for (int i = 1; i < place1; i++){
            monJoueur1=monJoueur1+"   ";
        }

        System.out.println(monJoueur1+"  X");

        for (int i = 1; i < place2; i++){
            monJoueur2=monJoueur2+"   ";
        }

        System.out.println(monJoueur2+"  Y");
    }
}

