
import java.util.*;

public class Scoville {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1};
		int k=3;
		int answer = solution(arr1,k);
		
		System.out.println(answer);
	}
	public static int solution(int[] scoville, int K){
		PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++)
            q.add(scoville[i]);

        int answer = 0;
        while(q.size() > 1 && q.peek() < K){
            int first = q.poll();
            int second = q.poll();

            int sum = first + (second * 2);
            q.add(sum);
            answer++;
            if(q.size() <= 1 && q.peek() < K) {
            	answer=-1;
            	break;
            }
        }        
        return answer;
    }

}
