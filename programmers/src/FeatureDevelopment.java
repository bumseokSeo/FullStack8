
public class FeatureDevelopment {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int[] arr1 = {95, 90, 99, 99, 80, 99};
		int[] arr2 = {1, 1,1,1,1,1};
		
		
		int[] answer = solution(arr1,arr2);
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
	public static int[] solution(int[] progresses, int[] speeds){
		int[] tmp = new int[100];
		int length=progresses.length;
		int num=0;
		int num2=0;
		for(int i=0;i<100;i++) {
			
			for(int j=0;j<length;j++) {
				progresses[j]=progresses[j]+speeds[j];
			}
			if(num2<length) {
				if(progresses[num2]>=100) {
					tmp[num]++;
					num2++;
					while(true) {
						if(num2>=length) {
							break;
						}
						if(progresses[num2]>=100) {
							tmp[num]++;
							num2++;
							continue;
						}
						break;
					}
					num++;
				}
			}
		}
		
		int[] answer = new int[num];
		for(int i=0;i<num;i++) {
			answer[i]=tmp[i];
		}
        return answer;
    }

}
