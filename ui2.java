import javax.swing.JFrame;

public class ui2 extends JFrame {

    public ui2(){
        setTitle("Window title!");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        ui2 tas=new ui2();
    }

}
