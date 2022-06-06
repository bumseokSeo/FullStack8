import java.util.*;
/*
(카카오)크레인 인형뽑기 게임
게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 
크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 
크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Claw_machine_game {

    public static void main(String[] args) {
        int answer = 0;
        int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
                { 3, 5, 1, 3, 1 } };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

        answer = solution(board, moves);

        System.out.println("터진 인형의 개수: "+answer);

    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[(j)][moves[i] - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[(j)][moves[i] - 1]);
                        board[(j)][moves[i] - 1] = 0;
                        break;
                    } else if (stack.peek() == board[(j)][moves[i] - 1]) {
                        board[(j)][moves[i] - 1] = 0;
                        stack.pop();
                        answer += 2;
                        break;
                    }
                    stack.push(board[(j)][moves[i] - 1]);
                    board[(j)][moves[i] - 1] = 0;
                    break;
                }

            }

        }
        return answer;
    }

}

