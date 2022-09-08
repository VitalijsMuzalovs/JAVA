// ja nav faila,tad izveidot failu
import java.io.File;
import java.io.IOException;


public class fileCreate {
    public static void main(String[] args) {
        try {
            File aka=new File("newFile.txt");
            if (aka.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File is allready EXISTS!");
            }
            }
        catch (IOException e) {
            System.out.println("Error creating file!");
            e.printStackTrace();
        }
    }
}
