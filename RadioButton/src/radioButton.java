import javax.swing.*;
import java.awt.event.*;

class BUMBA extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JButton b;

    BUMBA() {
        rb1 = new JRadioButton("Sieviete");
        rb1.setBounds(50, 100, 100, 30);
        rb2 = new JRadioButton("Vīrietis");
        rb2.setBounds(100, 100, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        b = new JButton("Rezultāts");
        b.setBounds(100, 150, 80, 30);

        b.addActionListener(this);
        add(rb1);add(rb2);add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You choosed 'Female'");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You choosed 'Male'");
        }
    }

    public static void main(String[] args) {
        new BUMBA();
    }
}