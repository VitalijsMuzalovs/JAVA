//1.logam uzlikt bildi
//2. uz bildes peles uzvedību kontrolēt

import javax.swing.*;

public class mice {
    mice(){
        JFrame f=new JFrame("Title");
        ImageIcon icon = new ImageIcon("map.jpg");


        f.add(new JLabel(icon));
        f.pack();
        f.setSize(500,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new mice();
    }
}
