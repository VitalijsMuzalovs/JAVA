import java.awt.event.*;
import javax.swing.*;

class text extends JFrame implements ActionListener{
    static JTextField txtName;
    static JTextField txtEmail;
    static JTextField txtPass;
    static JTextField txtAddress;
    static JTextField txtMobile;
    static JFrame f;
    static JButton b;
    static JLabel lbTitle;
    static JLabel lbName;
    static JLabel lbEmail;
    static JLabel lbPass;
    static JLabel lbAddress;
    static JLabel lbMobile;

    // text(){
    // }

    public static void main (String[] args){
        f=new JFrame("Account window!");

        lbTitle=new JLabel("Create a free account");

        lbName=new JLabel("Name:");
        lbEmail=new JLabel("E-mail:");
        lbPass=new JLabel("Password");
        lbAddress=new JLabel("Address");
        lbMobile=new JLabel("Mobile:");

        txtName=new JTextField(16);
        txtEmail=new JTextField(16);
        txtPass=new JTextField(16);
        txtAddress=new JTextField(16);
        txtMobile=new JTextField(16);


        b=new JButton("Create account");
        text te=new text();

        b.addActionListener(te);
        
        JPanel p=new JPanel();

        p.add(lbTitle);
        p.add(lbName);
        p.add(lbEmail);
        p.add(lbPass);
        p.add(lbAddress);
        p.add(lbMobile);

        p.add(txtName);
        p.add(txtEmail);
        p.add(txtPass);
        p.add(txtAddress);
        p.add(txtMobile);
        
        f.setSize(500,450);
        f.add(p);
        f.show();
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        // if (s.equals("submit")){
            lbTitle.setText(txtName.getText());
            txtName.setText("   ");
        // }
        
    }
}