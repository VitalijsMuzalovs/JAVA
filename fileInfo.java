// ja nav faila,tad izveidot failu
import java.io.File;

public class fileInfo {
    public static void main(String[] args) {

        File aka = new  File("info.txt");
        if (aka.exists()){
            System.out.println("File name: "+aka.getName());
            System.out.println("File path: "+aka.getAbsolutePath());
            System.out.println("Can write file: "+aka.canWrite());
            System.out.println("Can read file: "+aka.canRead());
            System.out.println("File size: "+aka.length());
        }else{
            System.out.println("File is NOT EXISTS!");
        }
    }
}
