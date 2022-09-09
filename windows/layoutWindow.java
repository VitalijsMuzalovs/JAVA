import java.awt.event.*;
import java.awt.*;
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

    public static void addComponent(JPanel p, JComponent comp, int x, int y, int width, int height,int topmargin,int lmargin,int bmargin,int rmargin) {
        GridBagConstraints constr = new GridBagConstraints();
        constr.gridx = x;
        constr.gridy = y;
        constr.gridheight = height;
        constr.gridwidth = width;
        constr.weightx = 0.5;
        constr.weighty = 0.5;
        constr.insets = new Insets(topmargin, lmargin, bmargin, rmargin);
        constr.anchor = GridBagConstraints.CENTER;
        constr.fill = GridBagConstraints.BOTH;
        p.add(comp, constr);
    }

    text(){
    }

    public static void main (String[] args){
        f=new JFrame("Account window!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbTitle=new JLabel("Create a free account",SwingConstants.CENTER);

        lbName=new JLabel("Name:",SwingConstants.LEFT);
        lbEmail=new JLabel("E-mail:",SwingConstants.LEFT);
        lbPass=new JLabel("Password",SwingConstants.LEFT);
        lbAddress=new JLabel("Address",SwingConstants.LEFT);
        lbMobile=new JLabel("Mobile:",SwingConstants.LEFT);

        txtName=new JTextField(16);
        txtName.setHorizontalAlignment(JTextField.LEFT);
        txtEmail=new JTextField(16);
        txtEmail.setHorizontalAlignment(JTextField.LEFT);
        txtPass=new JTextField(16);
        txtPass.setHorizontalAlignment(JTextField.LEFT);
        txtAddress=new JTextField(16);
        txtAddress.setHorizontalAlignment(JTextField.LEFT);
        txtMobile=new JTextField(16);
        txtMobile.setHorizontalAlignment(JTextField.LEFT);


        b=new JButton("Create account");
        text te=new text();

        b.addActionListener(te);
        
        
        JPanel pTop=new JPanel();
        pTop.setPreferredSize(new Dimension(100, 100));

        JPanel p=new JPanel();
        p.setLayout(new GridBagLayout()); 
        // p.setLocation(50, 50);
        // p.setSize(1, 1);
        
        
        JPanel pBottom=new JPanel();
        pTop.add(lbTitle);
        pTop.setLayout(new GridLayout(1,1));
        lbTitle.setFont(new Font("Arial", Font.BOLD, 24));


        GridBagConstraints c = new GridBagConstraints();

        f.add(pTop, "North");
        f.add(p, "Center");
        f.add(pBottom, "South");
        
        addComponent(p, lbName, 0, 0, 1, 1,1,1,1,1);
        addComponent(p, txtName, 1, 0, 1, 1,1,1,1,1);
        addComponent(p, lbEmail, 0, 1, 1, 1,1,1,1,1);
        addComponent(p, txtEmail, 1, 1, 1, 1,1,1,1,1);
        addComponent(p, lbPass, 0, 2, 1, 1,1,1,1,1);
        addComponent(p, txtPass, 1, 2, 1, 1,1,1,1,1);
        addComponent(p, lbAddress, 0, 3, 1, 1,1,1,1,1);
        addComponent(p, txtAddress, 1, 3, 1, 1,1,1,1,1);
        addComponent(p, lbMobile, 0, 4, 1, 1,1,1,1,1);
        addComponent(p, txtMobile, 1, 4, 1, 1,1,120,1,120);
        addComponent(p, b, 1, 5, 1, 1,30,1,1,300);



        // pBottom.add(b);
        
        f.setSize(500,350);
        f.setResizable(false);
        f.add(p);
        f.setVisible(true);
        // f.show();
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        // if (s.equals("submit")){
            lbTitle.setText(txtName.getText());
            txtName.setText("   ");
        // }
        
    }
}