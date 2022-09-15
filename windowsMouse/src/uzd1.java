import java.awt.event.*;
import java.awt.*;

public class uzd1 implements MouseMotionListener, MouseListener{
    private Frame f;
    private TextField tf;

    public uzd1(){
        f = new Frame("Title");
        tf = new TextField(30);

    }

    public void launchFrame(){
    Label lb = new Label("Klikšķini un kustini peli");
    f.add(lb,BorderLayout.NORTH);
    f.add(tf,BorderLayout.SOUTH);
    f.addMouseMotionListener(this);
    f.addMouseListener(this);
    f.setSize(500,300);
    f.setVisible(true);

}

public void mouseDragged(MouseEvent e){
        String xy = "Peles vilkšana: X=" + e.getX() + " Y=" + e.getY();
        tf.setText(xy);
}

    public void mouseMoved(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        uzd1 two = new uzd1();
        two.launchFrame();
    }
}
