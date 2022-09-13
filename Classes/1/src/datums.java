import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class datums {

    public static String clone_date(Date dt){
        String myDate = dt.clone().toString();
        return myDate;
    }

    public static void main(String[] args) throws ParseException {
        String dt = "15/04/2022";
        Date myDate=new SimpleDateFormat("dd/MM/yyyy").parse(dt);
        String val = clone_date(myDate);
        System.out.println(val);
    }
}
