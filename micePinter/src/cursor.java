import javax.swing.*;
import java.awt.*;

class cursor extends JFrame{
    public cursor(){
        showApp();
    }

    private void showApp(){
        setTitle("Title");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JButton("Press"));

        try{
            setCursor(Toolkit
                .getDefaultToolkit()
                .createCustomCursor(new ImageIcon("image.png").getImage(),new Point(0,0),"myCursor")
            );

        }catch(Exception e){}

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cursor();
            }
        });
    }
}


