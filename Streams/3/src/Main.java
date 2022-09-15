import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream stream = new ByteArrayInputStream("Sveiki!".getBytes());
        StringBuilder str = new StringBuilder();
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(stream));

        while ((line=br.readLine()) != null){
            str.append(line);
        }
        br.close();
        System.out.println(str);
    }
}
