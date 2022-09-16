import java.awt.*;
import java.awt.event.*;

public class logs {
    logs(){
        Frame f =new Frame();
        Label l=new Label();
        Button b = new Button("Button");
        TextField t=new TextField();
        final List list1=new List(4,false);
        final List list2=new List(4,false);
        final Label label=new Label();


        l.setBounds(20,50,150,30);
        l.setText("Aaaa");

        b.setBounds(220,50,80,30);
//        b.setLabel("Button");

        t.setBounds(20,100,180,30);

        label.setAlignment(Label.CENTER);
        label.setText("Label");
        label.setSize(100,30);

        list1.setBounds(20,150,80,100);
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        list2.setBounds(120,150,80,100);
        list2.add("100");
        list2.add("200");
        list2.add("300");
        list2.add("400");

        f.add(l);
        f.add(b);
        f.add(t);
        f.add(label);
        f.add(list1);
        f.add(list2);

        f.setSize(350,300);
        f.setTitle("Title");
        f.setLayout(null);
        f.setVisible(true);

        // run events
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "New text: " + list1.getItem(list1.getSelectedIndex());
                data+= ", @";
                for (String frame: list2.getSelectedItems()){
                    data+=frame+" ";
                     }
                l.setText(data);
            }
        });


        // close window
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        logs win = new logs();
    }
}
