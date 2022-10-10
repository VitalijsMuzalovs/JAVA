import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class tz {
    public static void main(String[] args) {
        tz tm=new tz();
        tm.testZoneDaceTime();
    }

    public void testZoneDaceTime(){
        ZonedDateTime date1=ZonedDateTime.parse(???);
        System.out.println(date1);

        ZoneId esoss=ZoneId.of("Europe/Riga");
    }

}
