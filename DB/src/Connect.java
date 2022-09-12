package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Connect{
    private final String url = "jdbc:postgresql://abul.db.elephantsql.com:5432/aphfgqzl";
    private final String user = "aphfgqzl";
    private final String password = "E-XRiqulSIwntxQurDLibzk8EAeyalBZ";

    public Connection connect(String sqlTxt) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            Connection db = DriverManager.getConnection(url, user, password);
            Statement st = db.createStatement();
//            ResultSet rs = st.executeQuery("SELECT * FROM orders WHERE ordNr LIKE 'A15' ");
            ResultSet rs = st.executeQuery(sqlTxt);
//            while (rs.next()) {
//                System.out.print("Column 1 returned ");
//                System.out.println(rs.getString(2));
//                System.out.print("Column 2 returned ");
//                System.out.println(rs.getString(3));
//            }
//            rs.close();
//            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}

class AddAccount extends JFrame implements ActionListener{
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
    static JLabel lbDummy;
    static JLabel lbDummy2;

    public static void addComponent(JPanel p, JComponent comp, int x, int y, int width, int height,int topmargin,int lmargin,int bmargin,int rmargin) {
        GridBagConstraints constr = new GridBagConstraints();
        constr.gridx = x;
        constr.gridy = y;
        constr.gridheight = height;
        constr.gridwidth = width;
        constr.weightx = 1;
        constr.weighty = 1;
        constr.insets = new Insets(topmargin, lmargin, bmargin, rmargin);
        constr.anchor = GridBagConstraints.WEST;
        constr.fill = GridBagConstraints.BOTH;
        p.add(comp, constr);
    }

    AddAccount(){
    }

    public static void main (String[] args){
        // frame
        f=new JFrame("Account window!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // labels
        lbTitle=new JLabel("Create a free account",SwingConstants.CENTER);
        lbTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lbName=new JLabel("Name:",SwingConstants.LEFT);
        lbEmail=new JLabel("E-mail:",SwingConstants.LEFT);
        lbPass=new JLabel("Password",SwingConstants.LEFT);
        lbAddress=new JLabel("Address",SwingConstants.LEFT);
        lbMobile=new JLabel("Mobile:",SwingConstants.LEFT);

        lbDummy=new JLabel("",SwingConstants.LEFT);
        lbDummy2=new JLabel("",SwingConstants.LEFT);

        // txt fields
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

        // button
        b=new JButton("Create account");
        AddAccount te=new AddAccount();
        b.addActionListener(te);

        // top panel
        JPanel pTop=new JPanel();
        pTop.setPreferredSize(new Dimension(500, 100));

        // center panel
        JPanel p=new JPanel();
        p.setLayout(new GridBagLayout());

        //bottom panel (not used)
        JPanel pBottom=new JPanel();
        pTop.add(lbTitle);
        pTop.setLayout(new GridLayout(1,1));


        f.add(pTop, "North");
        f.add(p, "Center");
        f.add(pBottom, "South");

        addComponent(p, lbDummy, 0, 0, 1, 1,1,50,1,1);
        addComponent(p, lbDummy2, 4, 0, 1, 1,1,1,1,50);
        addComponent(p, lbName, 1, 0, 1, 1,1,1,1,1);
        addComponent(p, txtName, 2, 0, 1, 1,1,1,1,1);
        addComponent(p, lbEmail, 1, 1, 1, 1,1,1,1,1);
        addComponent(p, txtEmail, 2, 1, 1, 1,1,1,1,1);
        addComponent(p, lbPass, 1, 2, 1, 1,1,1,1,1);
        addComponent(p, txtPass, 2, 2, 1, 1,1,1,1,1);
        addComponent(p, lbAddress, 1, 3, 1, 1,1,1,1,1);
        addComponent(p, txtAddress, 2, 3, 1, 1,1,1,1,1);
        addComponent(p, lbMobile, 1, 4, 1, 1,1,1,1,1);
        addComponent(p, txtMobile, 2, 4, 1, 1,1,80,1,80);
        addComponent(p, b, 2, 5, 1, 1,30,1,1,200);


        f.setSize(500,350);
        f.setResizable(false);
        f.add(p);
        f.setVisible(true);
        // f.show();
    }

    public void actionPerformed(ActionEvent e){
        Connect app = new Connect();
        String myName = txtName.getText();
        String myEmail = txtEmail.getText();
        String myPass = txtPass.getText();
        String myAddress = txtAddress.getText();
        String myMobile = txtMobile.getText();
//        String mySql = "INSERT INTO  orders (ordNr,Item_1,Item_2,Item_3,Item_4,Costs,Tips,Tax,SubTotal,Total) " +
        String mySql = "INSERT INTO  orders (ordNr,Item_1,Item_2,Item_3,Item_4) " +
                " VALUES ('"
                +myName+"','"
                +myEmail+"','"
                +myPass+ "','"
                +myAddress+"','"
                +myMobile+"')";
//        System.out.println(mySql);
        app.connect(mySql);

    }
}