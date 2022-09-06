import java.util.Scanner;

public class septitais {
    public static void main(String[] args ){
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert character: ");
        char simbols=reader.next().charAt(0);

        if(simbols=='a' || simbols=='u'  || simbols=='e' || simbols=='o'  || simbols=='o')
            System.out.print("Līdzskans");
        else
            System.out.print("Patskans");
        
    }
}