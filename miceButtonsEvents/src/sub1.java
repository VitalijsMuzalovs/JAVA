import java.awt.event.*;
import javax.swing.*;

class CheckMouse extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
        if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            System.out.println("Kreisais klikšķis: " + (e.getPoint()));
        }
    }
}


        public class sub1 {

            public static void main(String[] argv) throws Exception {
                JTextArea text = new JTextArea();
                text.addMouseListener(new CheckMouse());
                JFrame f = new JFrame();
                f.add(text);
                f.setSize(500, 500);
                f.setVisible(true);
            }
        }



