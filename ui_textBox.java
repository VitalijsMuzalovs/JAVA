import java.awt.event.*;
import javax.swing.*;

class text extends JFrame implements ActionListener{
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;

    text(){
    }

    public static void main (String[] args){
        f=new JFrame("Window title!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l=new JLabel("Empty text");
        b=new JButton("Press");
        text te=new text();

        // b.addActionListener(te);
        b.addActionListener(te);
        t=new JTextField(16);
        JPanel p=new JPanel();


        p.add(t);
        p.add(b);
        p.add(l);
        f.setSize(400,300);
        f.add(p);
        f.show();
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        // if (s.equals("submit")){
            l.setText(t.getText());
            t.setText("   ");
        // }
        
    }
}