import java.util.Scanner;

public class switch_case {
    public static void main(String[] args ){
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert character: ");
        char simbols=reader.next().charAt(0);

        switch (simbols){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print("Līdzskans");
                break;
            default:
            System.out.print("Patskans");
        }
        
    }
}