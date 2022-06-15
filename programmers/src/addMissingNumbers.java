
public class addMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,4,6,7,8,0};
		
		
		int answer = solution(numbers);
		
		System.out.println(answer);
		
	}
	public static int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        
        for(int i=0;i<numbers.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		if(numbers[i]==arr[j]) {
        			arr[j]=0;
        		}
        	}
        }
        
        for(int j=0;j<arr.length;j++) {
        	answer+=arr[j];
        }
        
        return answer;
    }

}
