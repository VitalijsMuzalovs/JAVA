//mouse hover

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class uzd5 extends JFrame implements KeyListener{
    private JButton button;
    private JTextField txt;
    private JLabel lb;


    public uzd5(){
        setTitle("Mouse over");
//        setLayout(new FlowLayout());
        setLayout(null);

        button=new JButton("uz pogas");
        button.setOpaque(true);
        add(button);

        txt=new JTextField();
        txt.setBounds(10,150,100,30);
        add(txt);
        txt.addKeyListener(this);

        lb=new JLabel("Label");
        lb.setBounds(10,180,100,30);
        add(lb);

        //jāliek klausīties peles darbību
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt){
                button.setBackground(Color.BLUE);
            }
            public void mouseExited(MouseEvent evt){
                button.setBackground(null);
            }
        });

        setSize(400,400);
        setVisible(true);

    }

    public void KeyPressed(KeyEvent e){
        lb.setText("nospiest taustiņš");
    }

    public void KeyTyped(KeyEvent e){
        lb.setText("tiek rakstīts");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e){
        lb.setText("released");
    }

    public static void main(String[] args) {
        new uzd5();
    }
}
