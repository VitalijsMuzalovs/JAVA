import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class fileRead {
    public static void main(String[] args) {
        try {
            File info=new File("info.txt");
            Scanner reader=new Scanner(info);
            while (reader.hasNextLine()){
                String data=reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error reading file!");
            e.printStackTrace();
        }
    }
}
