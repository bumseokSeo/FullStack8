

public class NewId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String new_id="...!@BaT#*..y.abcdefghijklm";
		
		
		String answer = solution(new_id);
		System.out.println(answer);
	}
	public static String solution(String new_id) {
	    
		String answer="";
		answer=new_id.toLowerCase();
		//-_.~!@#$%^&*()=+[{]}:?,<>/
		answer=answer.replaceAll("[^a-z0-9-_.]","");
		
		while(true) {
			if(answer.contains("..")) {
				answer=answer.replace("..", ".");
				continue;
			}
			break;
		}
		

		if(answer.startsWith(".")) {
			answer=answer.substring(1);
		}
		if(answer.endsWith(".")) {
			answer=answer.substring(0,answer.length()-1);
		}
		if(answer.isEmpty()) {
			answer="a";
		}
		if(answer.length()>=16) {
			answer=answer.substring(0,15);
		}
		if(answer.endsWith(".")) {
			answer=answer.substring(0,answer.length()-1);
		}
		
		for(int i=0; i<3; i++) {
			if(answer.length()<=2) {
				char c = answer.charAt(answer.length()-1);
				String str = String.valueOf(c);
				answer=answer.concat(str);
			}
		}
		while(true) {
			if(answer.length()<=2) {
				char c = answer.charAt(answer.length()-1);
				String str = String.valueOf(c);
				answer=answer.concat(str);
				continue;
			}
			break;
		}
		return answer;

	 }
	

}
