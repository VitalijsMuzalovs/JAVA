import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert number amount: ");

        int num1;
        int num2;
        int num3;


        System.out.print("Insert number: ");
        num1 = reader.nextInt();

        System.out.print("Insert number: ");
        num2 = reader.nextInt();

        System.out.print("Insert number: ");
        num3 = reader.nextInt();

        if(num1!=0.0){
            double d = (num2*num2)-(4*num1*num3);
            if(d==0.0){
                System.out.println("Divas vienadas saknes");
                double r= -num2/(2*num1);
                System.out.println("Saknes ir "+ r + " un " + r);
            }else if(d>0.0){
                System.out.println("Divas dazadas saknes");
                double r1 = (-num2+(Math.sqrt(num2)))/(2*num1);
                double r2 = (-num2-(Math.sqrt(num2)))/(2*num1);
                System.out.println("Pirma sakne "+ r1);
                System.out.println("Otra sakne "+ r2);
            }else{
                System.out.println("Imaginaras saknes");
                double rp = -num2/(2*num1);
                double ip = Math.sqrt(-d)/(2*num1);
                System.out.println("Sakne ir " + rp + " + i"+ ip);
                System.out.println("Sakne ir " + rp + " - i"+ ip);
            }

        }else{
            System.out.println("Nav kvadratvienadojums");
        }

    }
}
