
import java.util.Iterator;
import java.util.LinkedHashSet;



public class ReportAndKick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 2;
        String[] arr1 = {"muzi", "frodo", "apeach", "neo","key"};
        String[] arr2 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","muzi frodo","neo muzi","muzi apeach","neo apeach","neo frodo","key muzi"};
        int[] answer = new int[arr1.length];
		
		
		answer = solution(arr1,arr2,n);
		for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
		
	}
	
	
	
	
	 public static int[] solution(String[] id_list, String[] report, int k) {
	    
		 int[] answer = new int[id_list.length];//정답배열
		 
		 int[] intreport = new int[id_list.length];//유저별 신고당한 횟수
	        
		 LinkedHashSet<String> set = new LinkedHashSet<String>();
	        
	     for(int i=0;i<report.length;i++) {
	    	 set.add(report[i]);
	     }
	     Iterator<String> arr1 = set.iterator();
	     String[] myreport = new String[set.size()];//신고목록에서 중복제거
	     
	        
	     for(int i=0;i<set.size();i++) {
	    	 myreport[i]=arr1.next();
	     }
	     
	     String[] report1 = new String[myreport.length];//신고자
	     String[] report2 = new String[myreport.length];//신고 당한자

	     
	     for (int i = 0; i < myreport.length; i++) {
	    	 String s[] = myreport[i].split(" ");
	    	 
	    	 report1[i]=s[0];
	    	 report2[i]=s[1];
	    	 
	     }
	     /*
	     System.out.println("***************");
	     for (int i = 0; i < report1.length; i++) {
	            System.out.println(report1[i]);
	     }
	     System.out.println("***********");
	     for (int i = 0; i < report2.length; i++) {
	            System.out.println(report2[i]);
	     }
	     */
	     for (int i = 0; i < report.length; i++) {
	            System.out.println(report[i]);
	     }
	     System.out.println("***********");
	     for (int i = 0; i < myreport.length; i++) {
	            System.out.println(myreport[i]);
	     }
	    
	     
		 
		 //신고당한 횟수
	     for(int i = 0; i < id_list.length; i++) {
	    	 for(int j = 0; j < myreport.length; j++) {
	    		 if(myreport[j].indexOf(id_list[i])>0  ) {
	    			 intreport[i]=intreport[i]+1;
	    		 }
	    	 }
	     }
	     System.out.println("********");
	     //제제대상 추출(BanList[])
	     int y=0;
	     String[] BanList = new String[id_list.length];
	     for(int i=0; i < BanList.length; i++) {
	    	 
	    	 if(intreport[i]>=k) {
	    		 BanList[y]=id_list[i];
	    		 System.out.println(BanList[y]);
	    		 y++;
	    	 } 
	     }
	     
	     
	     //신고 처리 결과 발송 이메일 추출
	     for(int i=0; i < id_list.length; i++) {
	    	 for(int j=0; j < report1.length; j++) {
	    		 if(report1[j].equals(id_list[i])) {
	    			 for(int x=0;x<BanList.length;x++) {
	    				 if(report2[j].equals(BanList[x])) {
	    					 answer[i]=answer[i]+1;
	    				 }
	    			 }
	    			 
	    		 }
	    	 }
	     }

	     return intreport;
	 }
	

}
