// Java programma virknes izveidošanai no faila satura
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;



public class myFile2 {
    public static void main(String[] args) {
        String cels=System.getProperty("user.dir")+"\\newFile.txt";
        Charset enc=Charset.defaultCharset();
        List<String> lines=Files.readAllLines(Paths.get(cels), enc);
        System.out.println(lines);
    }
}
