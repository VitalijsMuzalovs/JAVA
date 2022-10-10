import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.scene.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.*;

class sub extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e){
        if((e.getModifiers()& InputEvent.BUTTON1_MASK)!=0){
            System.out.println("Kreisais klikšķis: "+(e.getPoint()));
        }
    }

    public class sub(){

    }


    public static void main(String[] argv) throws Exception{
        JTextArea text=new JTextArea();
        text.addMouseMotionListener(new CheckMouse());
        JFrame f=new JFrame();
        f.add(text);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
