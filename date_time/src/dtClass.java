import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class dtClass {
    public static void main(String[] args) {
        dtClass obj=new dtClass();
        obj.testLocateDateTime();
    }

    public void testLocateDateTime(){
        LocalDateTime cur=LocalDateTime.now();
        System.out.println(cur);
        System.out.println("Today is: "+cur.getDayOfMonth()+".th of "+cur.getMonth() +" "+cur.getYear());
        System.out.println("Today is: "+cur.toLocalDate());
        System.out.println(cur.toLocalTime());

        System.out.println(LocalDate.of(2005,10,8));
        System.out.println(LocalTime.of(21,11,0));
    }
}
