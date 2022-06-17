public class country124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		String answer = solution(n);
		System.out.println(answer);
	}

	public static String solution(int n) {
        int na = 0;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            na = n%3;  
            n = n/3; 
            if(na==0){
                n = n-1;
                na = 4;
            }
            sb.insert(0, na);
        }
        return sb.toString();
    }
}
