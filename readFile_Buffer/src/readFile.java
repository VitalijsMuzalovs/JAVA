import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class readFile {
    public static void main(String[] args) {
        String fileName = "text.txt";
        List<String> list = new ArrayList<>();

        try(BufferReader br=Files.newBufferReader(Paths.get(fileName))){
            list=br.lines().collect(collector.toList());
        }catch(IOexception e){
            e.printStackTrace();
        }
    }
}
