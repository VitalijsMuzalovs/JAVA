public class otrs {
    public static void main(String[] args) {
        double a=2.3,b=4,c=5.6;
        double sakne1,sakne2;
        double d=b*b-4*a*c;

        if(d>0){
            sakne1=(-b+Math.sqrt(d))/(2*a);
            sakne2=(-b-Math.sqrt(d))/(2*a);
            System.out.format("sakne1=%.2f ans sakne2=%.2f ",sakne1,sakne2);
        }
        else if(d==0){
            sakne2=b/(2*a);
            System.out.format("sakne2=%.2f ",sakne2);
        }
        else{
            double real=-b/(2*a);
            double imagi=Math.sqrt(-d)/(2*a);
            System.out.format("sakne1=%.2f+%.2fi",real,imagi);
            System.out.format("\nsakne2=%.2f-%.2fi",real,imagi);
        }
    }
}
