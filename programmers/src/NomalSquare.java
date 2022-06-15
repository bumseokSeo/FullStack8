
public class NomalSquare {

	public static void main(String[] args) {
		int w = 5;
		int h = 5;
		
		
		long answer = solution(w,h);
		
		System.out.println(answer);

	}
	public static long solution(long w, long h) {
		
        long answer = 0;//가로 1칸당 선택된 정사각형의 갯수
        
		for(int i=1;i<=w;i++) {
			long a=0;
			long b=0;
			
			a=((i-1)*h)/w;
			
			b=(i*h)/w;
			if((i*h)%w!=0) {
				b=b+1;
			}
			System.out.println("a="+a);
			System.out.println("b="+b);
			answer+=(b-a);
		}
		
        
        
        
        return w*h-answer;
    }
	
	
	

	

}
