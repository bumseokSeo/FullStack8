
public class AddNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes= {4,7,12};
		boolean[] signs = {true,false,true};
		
		int answer = solution(absolutes, signs);
		
		System.out.println(answer);
	}
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer=0;
		
		for(int i=0;i<absolutes.length;i++) {
			if(signs[i]==false) {
				absolutes[i]=(absolutes[i])*(-1);
			}
			answer+=absolutes[i];
		}
		return answer;
	}

}
