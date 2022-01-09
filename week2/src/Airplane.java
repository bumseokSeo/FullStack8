
import java.text.*;

import java.util.*;

public abstract class Airplane {
    private String air_line = "도착지 미정";
    private boolean isDomestic;
    

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    Calendar start = Calendar.getInstance();
    Calendar arrival = Calendar.getInstance();

    

    public Airplane() {

    }

    abstract String flight(); //추상메소드

    public String get_arrival() {
        return  arrival.get(Calendar.MONTH) +"-" + arrival.get(Calendar.DATE)  +"-"
        + arrival.get(Calendar.YEAR) ;
    }
    public String get_start() {
        return  start.get(Calendar.MONTH) +"-" + start.get(Calendar.DATE)  +"-"
        + start.get(Calendar.YEAR) ;
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
        return "start = " + start.get(Calendar.YEAR) + "년 " + start.get(Calendar.MONTH)  + "월 "
                + start.get(Calendar.DATE) + "일" + "\n" + "arrival ="+ arrival.get(Calendar.YEAR) + "년 " + arrival.get(Calendar.MONTH)  + "월 "
                + arrival.get(Calendar.DATE) + "일  " + air_line;
    }

}
class Airplane_son extends Airplane{
    
   
    

    public Airplane_son() {
        
    }

    @Override
    String flight() {
        if(getAir_line() == "김포" ||getAir_line() == "인천" ||getAir_line() == "김해" ||getAir_line() == "제주" ||getAir_line() == "울산" ){
            setDomestic(true);
            return "국내선입니다.";
        }
        else{
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
        

        airplane.set_start(2022,2, 1); //출발날짜 지정
        airplane.set_arrival(2022,2, 2); //도착날짜 지정
        airplane.setAir_line("김포");

        System.out.println(airplane.get_start());
        System.out.println(airplane.get_arrival());

        System.out.println("airplane\n" + airplane);
        System.out.println("***********************************************************");





        Airplane_son airplane_son = new Airplane_son();
        airplane_son.set_start(2022,2, 5); //출발날짜 지정
        airplane_son.set_arrival(2022,2, 6); //도착날짜 지정
        airplane_son.setAir_line("인천");

        System.out.println(airplane_son.get_start());
        System.out.println(airplane_son.get_arrival());
        System.out.println(airplane_son.flight());

        System.out.println("airplane\n" + airplane_son);



        
        
    }

}
