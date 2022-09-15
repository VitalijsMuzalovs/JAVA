import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String line = "Sveiki!";
        stream.write(line.getBytes(StandardCharsets.UTF_8));
        String beigas= new String(stream.toByteArray());
        System.out.println(beigas);
    }
}
