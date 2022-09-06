import java.util.Scanner;

public class sestais {
    public static void main(String[] args ){
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert number: ");
        int skaitlis=reader.nextInt();

        int atl = skaitlis%2;
        if(atl == 0)
            System.out.println("OK! "+skaitlis+" is EVEN!") ;
        else
            System.out.println("FAIL! "+skaitlis+" is ODD!") ; 
    }
}