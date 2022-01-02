import java.util.*;

public class Game {
    public static void main(String[] args) {
        int a = -1;//1번선수 -1로 시작
        int b = -1;//2번선수 -1로 시작
        String choice1 = "";
        String choice2 = "";
                
        /*

        1 = 가위
        2= 바위
        3 =보

        */
        Random rand = new Random(); //랜덤클래스를 사용할 준비
        a = rand.nextInt(3) + 1; //1번선수 결정
        b = rand.nextInt(3) + 1; //2번선수 결정

        Map<String, String> map1 =new HashMap<>();
        Map<String, String> map2 =new HashMap<>();

        if(a == 1){
            choice1 = "가위";
        }
        if(a == 2){
            choice1 = "바위";
        }
        if(a == 3){
            choice1 = "보";
        } // 숫자에 따라 가위 바위 보 지정

        if(b == 1){
            choice2 = "가위";
        }
        if(b == 2){
            choice2 = "바위";
        }
        if(b == 3){
            choice2 = "보";
        } // 숫자에 따라 가위 바위 보 지정


        map1.put("1번 선수", choice1);
        map2.put("2번 선수", choice2);

        System.out.println(map1);
        System.out.println(map2);

        if(a == 1 && b == 2){
            System.out.println("2번 선수 승리");
        }
        else if(a == 1 && b == 3){
            System.out.println("1번 선수 승리");
        }
        else if(a == 2 && b == 1){
            System.out.println("1번 선수 승리");
        }
        else if(a == 2 && b == 3){
            System.out.println("2번 선수 승리");
        }
        else if(a == 3 && b == 1){
            System.out.println("2번 선수 승리");
        }
        else if(a == 3 && b == 2){
            System.out.println("1번 선수 승리");
        }
        else{
            System.out.println("비겼습니다.");
        }
    }
    
}
