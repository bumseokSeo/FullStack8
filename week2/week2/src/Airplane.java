/*
과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
main에서 객체를 생서후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)
과제5) 출발지와 도착지를 멤버변수로 만들고, 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
출발날짜와 도착날짜를 getter로 만들고, 02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화)
국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산
국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르
과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는 국제선에 따라서
Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)
*/
import java.text.*;

import java.util.*;

public abstract class Airplane {
    private String air_line = "도착지 미정";
    private boolean isDomestic;
    private Calendar start = Calendar.getInstance();
    private Calendar arrival = Calendar.getInstance();

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public Airplane() {

    }

    abstract String flight(); // 추상메소드

    public String get_arrival() {
        return arrival.get(Calendar.MONTH) + "-" + arrival.get(Calendar.DATE) + "-"
                + arrival.get(Calendar.YEAR);
    }

    public String get_start() {
        return start.get(Calendar.MONTH) + "-" + start.get(Calendar.DATE) + "-"
                + start.get(Calendar.YEAR);
    }

    public void set_start(int year, int month, int date1) {
        start.set(year, month, date1);
    }

    public void set_arrival(int year, int month, int date1) {
        arrival.set(year, month, date1);
    }

    public String getAir_line() {
        return air_line;
    }

    public void setAir_line(String air_line) {
        this.air_line = air_line;
    }

    @Override
    public String toString() {
        return "start = " + start.get(Calendar.YEAR) + "년 " + start.get(Calendar.MONTH) + "월 "
                + start.get(Calendar.DATE) + "일" + "\n" + "arrival =" + arrival.get(Calendar.YEAR) + "년 "
                + arrival.get(Calendar.MONTH) + "월 "
                + arrival.get(Calendar.DATE) + "일  " + air_line;
    }

}

class Airplane_son extends Airplane {

    public Airplane_son() {

    }

    @Override
    String flight() {
        if (getAir_line() == "김포" || getAir_line() == "인천" || getAir_line() == "김해" || getAir_line() == "제주"
                || getAir_line() == "울산") {
            setDomestic(true);
            return "국내선입니다.";
        } else {
            setDomestic(false);
            return "국제선입니다.";
        }
    }

}

class Test3 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane() {

            @Override
            String flight() {
                // TODO Auto-generated method stub
                return null;
            }

        };

        airplane.set_start(2022, 2, 1); // 출발날짜 지정
        airplane.set_arrival(2022, 2, 2); // 도착날짜 지정
        airplane.setAir_line("김포");

        System.out.println(airplane.get_start());
        System.out.println(airplane.get_arrival());

        System.out.println("airplane\n" + airplane);
        System.out.println("***********************************************************");

        Airplane_son airplane_son = new Airplane_son();
        airplane_son.set_start(2022, 2, 5); // 출발날짜 지정
        airplane_son.set_arrival(2022, 2, 6); // 도착날짜 지정
        airplane_son.setAir_line("인천");

        System.out.println(airplane_son.get_start());
        System.out.println(airplane_son.get_arrival());
        System.out.println(airplane_son.flight());

        System.out.println("airplane_son\n" + airplane_son);

    }

}
