

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1 = {0,0,0,0,0,10};
        int[] arr2 = {1,2,3,4,5,6};
        int[] answer = new int[2];
		
		
		answer = solution(arr1,arr2);
		for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
	}
	public static int[] solution(int[] lottos, int[] win_nums) {
	    
		 int[] answer = new int[2];//정답배열
		 int zeronum=0;//0갯수
		 int correctnum=0;//정답갯수
		 for(int i = 0; i < 6; i++) {
			 if(lottos[i]==0)
			 zeronum++;
		 }
		 
		 
		 
		 //로또번호 확인 함수
		 for(int i = 0; i < 6; i++) {
			 for(int j = 0; j < 6; j++) {
				 if(lottos[i]==win_nums[j]) {
					 correctnum++;
				 }
			 }
		 }
		 //정답갯수=최저등수
		 answer[1]=rank(correctnum);
		 
		 //최고등수=최저등수-0갯수
		 answer[0]=rank(correctnum)-zeronum;
		 if(zeronum==6) {
			 answer[0]=1;
		 }
	     return answer;
	 }
	public static int rank(int a) {
		if(a==6) {
			return 1;
		}else if(a==5) {
			return 2;
		}else if(a==4) {
			return 3;
		}else if(a==3) {
			return 4;
		}else if(a==2) {
			return 5;
		}else {
			return 6;
		}
		
		
		}

}
