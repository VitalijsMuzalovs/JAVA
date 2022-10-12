import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class puzzle extends JFrame implements ActionListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    puzzle(){
        b1=new Button("1");
        b1.setBounds(50,100,40,40);
        b2=new Button("2");
        b2.setBounds(100,100,40,40);
        b3=new Button("3");
        b3.setBounds(150,100,40,40);
        b4=new Button("4");
        b4.setBounds(50,150,40,40);
        b5=new Button("5");
        b5.setBounds(100,150,40,40);
        b6=new Button("6");
        b6.setBounds(150,150,40,40);
        b7=new Button("7");
        b7.setBounds(50,200,40,40);
        b8=new Button("8");
        b8.setBounds(100,200,40,40);
        b9=new Button("");
        b9.setBounds(150,200,40,40);

        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);

        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
}

public static void main(String[] args) {
    new puzzle();
}
