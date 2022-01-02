import java.util.*;
import java.text.*;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat data = new SimpleDateFormat("YYYY/MM/DD");

        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");

        System.out.println("현재 날짜는 " + data.format(today));
        System.out.println("현재 시간은 " + time.format(today));
    }
    
}
