
public class DotProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-1,0,1};
		int[] b= {1,0,-1};
		
		int answer = solution(a,b);
		
		System.out.println(answer);
	}
	public static int solution(int[] a, int[] b) {
		int answer=0;
		
		for(int i=0;i<a.length;i++) {
			answer+=(a[i]*b[i]);
		}
		return answer;
	}

}
