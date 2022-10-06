
import javax.swing.*;
import java.awt.*;

public class win {
    JMenu menu,submenu;
    JMenuItem item1,item2,item3,item4,item5;
    win(){
        JFrame f = new JFrame("Window title");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub menu");
        item1=new JMenuItem("Selection 1");
        item2=new JMenuItem("Selection 2");
        item3=new JMenuItem("Selection 3");
        item4=new JMenuItem("Selection 4");
        item5=new JMenuItem("Selection 5");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(submenu);

        submenu.add(item4);
        submenu.add(item5);

        mb.add(menu);
        f.setJMenuBar(mb);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new win();
    }
}
