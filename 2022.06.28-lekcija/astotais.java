import java.util.Scanner;

public class astotais {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");

        double num=reader.nextDouble();

        if (num>0.0 ){
            System.out.print(num+" is POSITIVE!");
        }
        else if (num<0.0){
            System.out.print(num+" is NEGATIVE!");
        }
        else{
            System.out.print(num+" is ZERO!");
        }

    }
}