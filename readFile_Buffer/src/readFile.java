import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class readFile {
    public static void main(String[] args) {
        String fileName = "text.txt";
        List<String> list = new ArrayList<>();

        try(BufferedReader br=Files.newBufferedReader(Paths.get(fileName))){
            list=br.lines().collect(Collectors.toList());
        }catch(IOException e){
            e.printStackTrace();
        }
        list.forEach(System.out::println);
    }
}
