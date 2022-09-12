import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class fileWrite {
    public static void main(String[] args) 
    throws IOException
    {
        String name="info.txt";

        try(FileWriter fw=new FileWriter(new File(name)))
        {
            fw.write("some added text....");
            fw.append("appended text...");
        }


    }
}
