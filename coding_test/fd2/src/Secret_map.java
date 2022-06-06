/*
원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.
*/
public class Secret_map {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        String[] answer = new String[n];

        answer = solution(n, arr1, arr2);
        for (int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
        
    }

    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr11 = new String[n];
        String[] arr22 = new String[n];

        // 2진수로 바꾼 arr11배열 생성
        for (int i = 0; i < n; i++) {
            String s1 = "";
            for (int j = 0; j < n; j++) {
                if (arr1[i] % 2 == 0) {
                    s1 = s1.concat("0");
                } else {
                    s1 = s1.concat("1");
                }
                arr1[i] = arr1[i] / 2;
            }
            StringBuffer sb = new StringBuffer(s1);
            String reversedStr = sb.reverse().toString();
            arr11[i] = reversedStr;
        }
        // 2진수로 바꾼 arr22배열 생성
        for (int i = 0; i < n; i++) {
            String s1 = "";
            for (int j = 0; j < n; j++) {
                if (arr2[i] % 2 == 0) {
                    s1 = s1.concat("0");
                } else {
                    s1 = s1.concat("1");
                }
                arr2[i] = arr2[i] / 2;
            }
            StringBuffer sb = new StringBuffer(s1);
            String reversedStr = sb.reverse().toString();
            arr22[i] = reversedStr;

        }
        for (int i = 0; i < n; i++) {
            String s2 = "";
            for (int j = 0; j < n; j++) {
                if (arr11[i].charAt(j) == '1' || arr22[i].charAt(j) == '1') {// 둘중 하나라도 1이면 1->#
                    s2 = s2.concat("#");
                } else {
                    s2 = s2.concat(" ");
                }

            }
            answer[i] = s2.toString();

        }
        return answer;
    }
    
}
