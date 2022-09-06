// noteikt vai skaitlis ir Armstronga skaitlis
// 153=1*1*1+5*5*5+3*3*3
import java.util.Scanner;

public class desmitais {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");

        String num=reader.nextLine();
        
        int len = num.length(),sum=0;
        
        for (int i=0; i<=len-1;i++){
            sum+=Math.pow(Character.getNumericValue(num.charAt(i)),3);
        }

        int myNum = Integer.parseInt(num);
        if (myNum==sum){
            System.out.print(num+" ir Armstronga skaitlis!");
            System.out.print("\n"+num+" = "+sum);
        }
        else{
            System.out.print(num+" nav Armstronga skaitlis!");
            System.out.print("\n"+num+" <> "+sum);
        }

    }
}
