import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        int [] skaitlis=new int [] {1,2,3,4,5,6,7,8,9,0};
//        System.out.println("Array legth: " + skaitlis.length);
//
//        String [] str_array=new String[] {"abc","def","opq","drl"};
//        System.out.println("Array legth: " + str_array.length);

        System.out.println("Enter array amount:");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int[] skaitlis = new int[num];
        int summa = 0;

        for (int n = 0; n < num; n++) {
            System.out.println("Ievadi skaitli: ");
            int x = Integer.parseInt(sc.nextLine());
            skaitlis[n] = x;
        }

        int a=0;
        int mx=0;

        for (int i = 0; i < skaitlis.length; i++) {
            if(skaitlis[i]%2==0) a++;
            if(i>0) {
                if (skaitlis[i]>skaitlis[i-1]){
                    mx=skaitlis[i];
                }else{
                    mx=skaitlis[i-1];
                }
            }
            summa = summa + skaitlis[i];
        }

        System.out.println("Summa: " + summa);
        System.out.println("Even number amount: " + a);
        System.out.println("Max: " + mx);

    }
}
