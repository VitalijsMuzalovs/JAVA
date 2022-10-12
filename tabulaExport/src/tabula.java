// izveidojam tabulu
// izveidoto tabulu ar pogas palidzību eksportēsim

import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class JTableTOExcel extends JFrame{
    String[] columns=new String[]{
    "ID",
    "Vards",
    "Adrese",
    "dd-mm-yyyy",
    };


    // datu aizpildīšana 2D
    Object[][] data = new Object[][]{
            {1,"Daiga","Lepāja",11-10-2022},
            {2,"Vitālijs","Aizpute",1-5-2020},
            {3,"Alex","Rīga",21-10-2010},
            {4,"Laura","Lepāja",11-10-2022},
            {5,"Andrejs","Ventspils",20-03-2022},
            {6,"Inga","Valka",1-5-2020},
            {7,"Linda","Daugavpils",21-10-2010},
            {8,"Andis","Grobiņa",11-10-2022},
    };

    JTable tb=new JTable(data,columns);
    JPanel panel=new JPanel(new BorderLayout());
    JButton bt=new JButton("Export to excel");

    public JTableTOExcel(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Table to excel");

        panel.add(bt,BorderLayout.SOUTH);
        panel.add(new JScrollPane(tb),BorderLayout.NORTH);
        add(panel);
        setVisible(true);

        // button event
        bt.addActionListener(new MyListener());
    }

    public void export (JTable tb,File file){
        try {
            TableModel m = tb.getModel();
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < m.getColumnCount(); i++) {
                fw.write(m.getColumnName(i) + "\t");
            }
            fw.write("\n");
            for (int k = 0; k<m.getRowCount(); k++) {
                for (int l = 0; l<m.getColumnCount(); l++) {
                    fw.write(m.getValueAt(k, l).toString() + "\t");
                }
                fw.write("\n");
            }
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==bt){
                JFileChooser fChooser=new JFileChooser();
                int option=fChooser.showSaveDialog(JTableTOExcel.this);

                if(option == JFileChooser.APPROVE_OPTION){
                    String name=fChooser.getSelectedFile().getName();
                    String path=fChooser.getSelectedFile().getParentFile().getPath();
                    String file=path + "\\"+name+".xls";
                    export(tb,new File(file));
                }
            }
        }
    }

    public static void main(String[] args) {
        new JTableTOExcel();
    }
}
