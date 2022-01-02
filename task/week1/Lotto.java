import java.util.*;
public class Lotto {
    public static void main(String[] args) {

		int num = 6;
		int start = 1;
		int end = 45;

		int[] value = new int[num]; //랜덤값을 저장할 배열
		boolean f = false; //중복을 확인할 flag
		int randvalue; //중복을 확인할 변수

		Random rand = new Random(); //랜덤클래스를 사용할 준비
		try {
			for(int i=0; i<num; i++) {
				f = false;
				randvalue = rand.nextInt(end-start+1) + (start); //start~end사이의 값 생성
				for(int j=0; j<i; j++) {
					if(randvalue == value[j]) {
						f = true;
						break; //만약 생성된 값이 이미 배열에 들어있을 경우 f= true 즉 중복임 
					}
					
				}
				if(f) {
					i--; //f가 ture면 for문을 다시 돌려라
				}
				else {
					value[i]=randvalue; //중복이 아니면 value배열에 랜덤값 대입
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		System.out.print("로또번호 추천 -> ");
		try {
			//출력문
			for (int i=0; i<num; i++) {
				System.out.print(value[i]);
				if(i != num-1) {
					System.out.print(", ");
				}
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		

        }
    }

