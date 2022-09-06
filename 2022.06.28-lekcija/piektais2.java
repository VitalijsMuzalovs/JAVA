import java.util.Scanner;

public class piektais2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert number: ");

        int num=reader.nextInt();
        long sum=1;

        for (int i=1;i<=num;++i){
            sum*=i;
        }

        System.out.println("Faktorials: "+sum);
    }
}