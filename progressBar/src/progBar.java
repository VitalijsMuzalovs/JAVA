import javax.swing.*;

public class progBar extends JFrame {
    JProgressBar progress;
    progBar(){
        progress = new JProgressBar(0,0,1000);
        progress.setBounds(20,30,150,20);
        progress.setValue(0);
        progress.setStringPainted(true);
        add(progress);

        setSize(400,400);
        setLayout(null);
    }

    public void loop(){
        int i =0;
        while(i<=1000){
            progress.setValue(i);
            i=i+10;
            try{
                Thread.sleep(120);
            }
            catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        progBar frame=new progBar();
        frame.setVisible(true);
        frame.loop();
    }
}
