//canvas
import java.awt.*;

public class canvas {
    public canvas(){
        Frame f=new Frame("Canvas training");
        f.add(new MyCanvas());

        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new canvas();
    }
}

class MyCanvas extends Canvas{
    public MyCanvas(){
        setBackground(Color.GRAY);
        setSize(400,400);
    }
    public void paint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRoundRect(100,100,200,175,175,150);
        g.setColor(Color.BLACK);
        g.fillRect(120,150,50,30);
        g.setColor(Color.BLACK);
        g.fillRect(230,150,50,30);
        g.setColor(Color.GRAY);
        g.fillOval(150,210,100,20);
    }
}
