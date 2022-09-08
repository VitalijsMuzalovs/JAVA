// create/show window
// abstract windows toolkit

import java.awt.*;
import javax.swing.*;

public class ui {
    private static void createWindow(){
        // create window
        JFrame bumba = new JFrame("Window title!");
        bumba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textJLabel=new JLabel("Label text",SwingConstants.CENTER);
        textJLabel.setPreferredSize(new Dimension(300,100));
        bumba.getContentPane().add(textJLabel,BorderLayout.CENTER);
        
        // show window
        bumba.setLocationRelativeTo(null);
        bumba.pack();
        bumba.setVisible(true);
    }

    public static void main(String[] args){
        createWindow();
    }
}
