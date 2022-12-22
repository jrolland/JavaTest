import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.text.MessageFormat;


public class main {





    public static void main(String[] args){


        JFrame monEcran = new JFrame();
        Panel pan=new Panel();

        monEcran.setVisible(true);
        monEcran.setSize(1550,200);
        monEcran.setTitle("Jeu de l'oie");

        int place1;
        int place2;



        int de1= 1 + (int)(Math.random() * ((6 - 1) + 1));
        int de2= 1 + (int)(Math.random() * ((6 - 1) + 1));
        place1=de1+de2;
        place2=7;

        Rectangles mesRectangles=new Rectangles();
        mesRectangles.posJ1=place1;
        mesRectangles.posJ2=place2;


        monEcran.setContentPane(mesRectangles);

        System.out.println("De1 "+de1);
        System.out.println("De2 "+de2);

        StringBuilder monTableau;
        String monCarreau;
        monTableau = new StringBuilder();
        for (int i = 1; i < 64; i++){
            monCarreau=" "+i;
            if (monCarreau.length()==2) {
                monCarreau=" "+monCarreau;
            }
            monTableau.append(monCarreau);
        }
        System.out.println(monTableau);
        StringBuilder monJoueur1;
        StringBuilder monJoueur2;
        monJoueur1 = new StringBuilder();
        monJoueur2 = new StringBuilder();
        for (int i = 1; i < place1; i++){
            monJoueur1.append("   ");
        }

        System.out.println(monJoueur1+"  X");

        for (int i = 1; i < place2; i++){
            monJoueur2.append("   ");
        }

        System.out.println(monJoueur2+"  Y");
    }
}

