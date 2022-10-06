//check box
import java.awt.*;
import java.awt.event.*;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;

public class chk{
    chk(){
        Frame f=new Frame("TEST");
        final Label lb=new Label();

        lb.setText("AAAAAAAAAAAA");
        lb.setSize(350,100);
        lb.setAlignment(Label.CENTER);


        Checkbox chkBox=new Checkbox("Selection 1");
        chkBox.setBounds(100,100,100,30);

        Checkbox chkBox2=new Checkbox("Selection 2");
        chkBox2.setBounds(100,150,100,30);


        f.add(chkBox);f.add(chkBox2);f.add(lb);

        chkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("checked Selection 1");
            }
        });

        chkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lb.setText("checked Selection 2");
            }
        });

        f.setSize(350,350);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new chk();
    }
}
