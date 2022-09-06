// atrast rakstzīmju biežumu virknē
import java.util.Scanner;

public class jun2{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter text: ");
        String txt=reader.nextLine();

        //txt="Ziema ziemu ciena un aicina.";
        char ch='i';
        int freq=0;

        for (int i=0; i<txt.length();i++){
            if (txt.charAt(i)==ch){
                ++freq;
            }
        }
        System.out.println("Biežums ir "+ch+"="+freq);
    }
}