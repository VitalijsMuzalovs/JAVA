import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        int day = 21;
        int month = 3;
        int year = 1984;

        Calendar myBDate = Calendar.getInstance();
        Calendar nowDate = Calendar.getInstance();

        DateFormat dayFormat = new SimpleDateFormat("E" );
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy" );
//        Date myDate = new Date();
//        System.out.println(dateFormat.format(myDate));

        myBDate.set(year,month-1,day);

        System.out.println(myBDate.getTime());
        System.out.println(nowDate.getTime());

        int age = nowDate.get(Calendar.YEAR) - myBDate.get(Calendar.YEAR);
        int i = 0;

        while (i <= age)
        {
            System.out.println(i + ": " + dateFormat.format(myBDate.getTime()) + " - " + dayFormat.format(myBDate.getTime()));
            myBDate.add(Calendar.YEAR,1);
            i++;
        }
    }

}
