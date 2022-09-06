import java.util.Scanner;

public class palindroms {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter text: ");

        String str=reader.nextLine(), opposite="";
        int garums=str.length();
        
        for (int i=(garums-1);i>=0;--i){
            opposite=opposite+str.charAt(i);
        }

        if (str.toLowerCase().equals(opposite.toLowerCase()) ){
            System.out.println(str+" is POLINDROME!");
        }
        else{
            System.out.println(str+" is NOT polindrome!");
        }

        //System.out.println(str+" "+opposite);

    }
}
