public class viens {
    public static void main(String[] args) {
        double n1=-4.5, n2=3.9, n3=2.5;

        if (n1>n2 && n1>n3)
            System.out.println("Biggest is: "+n1) ;
        else if(n2>n1 && n2>n3)
            System.out.println("Biggest is: "+n2);
        else
            System.out.println("Biggest is: "+n3);
    }
}
