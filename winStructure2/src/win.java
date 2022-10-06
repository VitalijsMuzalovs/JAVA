import javax.swing.*;
import java.awt.event.*;

public class win implements ActionListener {
    JMenu menuFile,menuEdit,menuHelp,submenu;
    JMenuItem itemEdit1,itemEdit2,itemEdit3,item4,item5;
    JTextArea ta;
    win() {
        JFrame f = new JFrame("Window title");
        JMenuBar mb = new JMenuBar();
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        menuHelp = new JMenu("Help");
//        submenu = new JMenu("Sub menu");
        itemEdit1 = new JMenuItem("Cut");
        itemEdit2 = new JMenuItem("Copy");
        itemEdit3 = new JMenuItem("Paste");

        itemEdit1.addActionListener(this);
        itemEdit2.addActionListener(this);
        itemEdit3.addActionListener(this);


        menuEdit.add(itemEdit1);
        menuEdit.add(itemEdit2);
        menuEdit.add(itemEdit3);

        ta = new JTextArea();
        ta.setBounds(50, 50, 200, 150);
        ta.setText("Text");

        mb.add(menuFile);
        mb.add(menuEdit);
        mb.add(menuHelp);
        f.setJMenuBar(mb);
        f.add(ta);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        }

    public void actionPerformed (ActionEvent e){
        if (e.getSource() == itemEdit1) ta.setText("aaaaa");
        if (e.getSource() == itemEdit2) ta.setText("bbbbb");
        if (e.getSource() == itemEdit3) ta.setText("ccccc");
    }


    public static void main(String[] args) {
        new win();
    }
}
