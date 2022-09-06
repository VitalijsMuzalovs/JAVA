import java.util.Scanner;

public class devitais {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num=reader.nextInt();
        boolean flag=false;

        // for (int i=2; i<=num/2; ++i){
        //     if (num%i==0){
        //         flag=true;
        //         break;
        //     }
        // }

        int i=2;

        while (i<=num/2){
            if (num%i==0){
            flag=true;
            break;
            }
            ++i;
        }
        
        if (!flag){
            System.out.print(num+" is PRIME!");
        }
        else{
            System.out.print(num+" is NOT PRIME!");
        }

    }
}