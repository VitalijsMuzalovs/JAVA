// straumēšabu...lasīšanu no faila
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class awt {


    public static void main(String[] args) {
        String fileName = "text.txt";
        try(Stream<String> stream=Files.lines(Paths.get(fileName))){
            stream.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
