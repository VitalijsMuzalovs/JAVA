import java.util.Scanner;

public class sestais2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert Fibo number: ");

        int num=reader.nextInt();
        int f = 0, f0 = 0, f1 = 1, i=0;
        while (i<=num){
            f=f0 + f1;
            f0 = f1;
            f1 = f;
            i++;
            System.out.println(f1);
        }
    }
}
