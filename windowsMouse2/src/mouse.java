import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class mouse extends JFrame {
    public mouse() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextArea textArea = new JTextArea();
        textArea.setText("Uzklikšini!");
        textArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.NOBUTTON) {
                    textArea.setText("nav trāpīts uz pogas");
                } else if ((e.getButton() == MouseEvent.BUTTON1)) {
                    textArea.setText("uz pogas viens klikšķis");
                } else if ((e.getButton() == MouseEvent.BUTTON2)) {
                    textArea.setText("uz pogas divi klikšķi");
                } else if ((e.getButton() == MouseEvent.BUTTON3)) {
                    textArea.setText("uz pogas trīs klikšķi");
                }
                System.out.println("klikšķu skaits: " + e.getClickCount());
                System.out.println("Klikšķa pozicija (x,y) " + e.getX() + "," + getY());
            }
        });
        getContentPane().add(textArea);
    }

    public static void main(String[] args) {
        new mouse().setVisible(true);
    }
}

