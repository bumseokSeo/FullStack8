import java.util.*;
/*
(카카오) 실패율 구하기
전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
*/

public class Failure_rate {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double [] fail = new double [N];
        int arr_cnt = stages.length;
        
        //실패율을 구해서fail배열에 입력
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == (i+1)){
                    count++;
                }
                
            }
            
            if(arr_cnt == 0){
                fail[i] = (double)0;
            }
            else{
                fail[i] = (double)count/arr_cnt;
                arr_cnt = arr_cnt-count;
            }
            
        }

        Map<Integer, Double> map = new HashMap<Integer, Double>();
       
        for(int i =0; i < N; i++){
            map.put(i+1, fail[i]);
        }

        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        int number = 0;
        for(Integer key : keySetList) {
            
            answer[number] = key;
            number++;
		}

        return answer;
    }
    public static void main(String[] args){
        int n = 4;
        int[] stages = {4,4,4,4,4};
        
        int[] answer;
        
        answer=solution(n,stages);
        
        for(int i = 0; i < n; i++){
            System.out.println(answer[i]);
        }
        
    }
}



