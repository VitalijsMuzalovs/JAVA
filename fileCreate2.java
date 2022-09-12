// Java programma virknes izveidošanai no faila satura
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;



public class fileCreate2 {
    public static void main(String[] args) {
        String cels=System.getProperty("user.dir")+"\\newFile.txt";
        Charset enc=Charset.defaultCharset();
        byte[] paka=Files.readAllBytes(Paths.get(cels));
        String lines=new String(paka,enc);
        System.out.println(lines);
        // List<String> lines=Files.readAllLines(Paths.get(cels),enc);
        // System.out.println(lines);
    }
}
