import java.text.*;
import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        Date today = new Date(); // 현재 date객체
        Calendar cal = Calendar.getInstance(); // 내일의 정보는 날짜 임의 지정을 위해 calendar사용
        cal.roll(Calendar.DATE, 1); // 1일을 더한다

        Date tomorrow = new Date(cal.getTimeInMillis()); // cal ->date

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");

        ArrayList arr = new ArrayList<>();

        arr.add(date.format(today));
        arr.add(date.format(tomorrow));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        ////////////////////////////////////////////////////////////////
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();

        int ran1 = (int) (Math.random() * 365);
        int ran2 = (int) (Math.random() * 365);
        int ran3 = (int) (Math.random() * 365);

        int num1 = (int) (Math.random() * 2);// + - 정하기용 0이면+ / 1이면-
        if (num1 == 0) {
            cal1.add(Calendar.DATE, ran1);
        } else {
            cal1.add(Calendar.DATE, -ran1);
        }

        int num2 = (int) (Math.random() * 2);// + - 정하기용 0이면+ / 1이면-
        if (num2 == 0) {
            cal2.add(Calendar.DATE, ran2);
        } else {
            cal2.add(Calendar.DATE, -ran2);
        }

        int num3 = (int) (Math.random() * 2);// + - 정하기용 0이면+ / 1이면-
        if (num3 == 0) {
            cal3.add(Calendar.DATE, ran3);
        } else {
            cal3.add(Calendar.DATE, -ran3);
        }

        Date date1 = new Date(cal1.getTimeInMillis());
        Date date2 = new Date(cal2.getTimeInMillis());
        Date date3 = new Date(cal3.getTimeInMillis());

        ArrayList arr2 = new ArrayList<>();

        if (ran1 <= ran2 && ran1 <= ran3) {
            arr2.add(date.format(date1));
            if (ran2 <= ran3) {
                arr2.add(date.format(date2));
                arr2.add(date.format(date3));
            } else {
                arr2.add(date.format(date3));
                arr2.add(date.format(date2));
            }
        } else if (ran2 <= ran1 && ran2 <= ran3) {
            arr2.add(date.format(date2));
            if (ran1 <= ran3) {
                arr2.add(date.format(date1));
                arr2.add(date.format(date3));
            } else {
                arr2.add(date.format(date3));
                arr2.add(date.format(date1));
            }
        } else {
            arr2.add(date.format(date3));
            if (ran1 <= ran2) {
                arr2.add(date.format(date1));
                arr2.add(date.format(date2));
            } else {
                arr2.add(date.format(date2));
                arr2.add(date.format(date1));
            }
        }

        System.out.println(" 현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.");

        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }

    }
}
