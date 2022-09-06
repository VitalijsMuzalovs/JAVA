import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=0;
        while(i<3){
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number: ");
            i++;
        }
    }
}

// if ((a+b)>c && (a+c)>b && (b+c)>a)
//      {
//      double pus = (a+b+c)/2.0;
//      double laukums = Math.sqrt(pus*(pus-a)*(pus-b)*(pus-c));
//      System.out.println("Laukums:" + laukums);
//        }
//      else{
//          System.out.println("Tas nav trīsstūris");
//      }