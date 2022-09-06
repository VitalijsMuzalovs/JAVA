import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert number amount: ");

        int i=0;
        int amount = reader.nextInt();
        int sum = 0;

        for (i = 0; i < amount; i++)
        {
            System.out.print("Insert number: ");
            int num = reader.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum:"+sum);
        float avg = sum/i;
        System.out.println("Avg:"+ avg);
    }
}
