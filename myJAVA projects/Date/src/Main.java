import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static   void main (String[] args)
    {
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY hh:mm");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
