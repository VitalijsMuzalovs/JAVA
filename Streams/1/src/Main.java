import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args)
    {
        String name = "Ābcdefg";
        System.out.println("Simbolu virkne ir: " + name);

        try {
            InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
            System.out.println("Straume: "+ stream);

            System.out.println("Pieejamie baiti sākumā: " + stream.available());
            stream.read();
            stream.read();
            stream.read();
            stream.read();
            System.out.println("Pieejamie baiti pa vīdu: " + stream.available());
            stream.read();
            stream.read();
            stream.read();
            stream.read();
            System.out.println("Pieejamie baiti beigās: " + stream.available());

        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
