import java.util.Scanner;

public class ceturtais2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insert number: ");

        int num=reader.nextInt();
        int sum=0;

        for (int i=1;i<=num;++i){
            sum+=i;
        }

        System.out.println("Summa:"+sum);
    }
}
