import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert number:");

        int num = reader.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Pār skaitlis");
        } else
        {
            System.out.println("Nepārs skaitlis");
        }
    }
}
}