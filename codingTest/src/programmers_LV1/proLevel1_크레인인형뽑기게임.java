package programmers_LV1;

import java.util.ArrayList;
import java.util.Stack;

public class proLevel1_크레인인형뽑기게임 {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		solution(board, moves);
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				//moves[i] 는 인형 뽑을 열을 나타냄 -> moves[i] - 1 이 그 열의 인덱스값
				//for j 를 돌려 가장 위에 있는(0이 아닌) 인형을 뽑음
				if (board[j][moves[i] - 1] != 0) {
					//list(바구니) 비어있으면 인형 담기 
					if (list.isEmpty()) {
						list.add(board[j][moves[i] - 1]);
						
					//list(바구니) 비어있지 않고
					} else {
						//list의 마지막(바구니의 맨 위) 인형과 같은지 비교해서
						//같다면 list(바구니)에서 인형 삭제하고
						//삭제된 인형 개수(answer)에 +2
						if (list.get(list.size() - 1) == board[j][moves[i] - 1]) {
							list.remove(list.size() - 1);
							answer += 2;
						//다르다면 list(바구니)에 추가
						} else {
							list.add(board[j][moves[i] - 1]);
						}
					}
					
					//뽑은 인형은 0으로 설정하고 (빈 공간)
					//break문 -> 다음 인형 뽑기 진행
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
        
        System.out.println(answer);
        return answer;
    }
	
	
	//Stack 이용한 풀이
	/*
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					
					// 스택이 비어있는경우 -> 해당 인형 넣기
					if(s.isEmpty())
						s.push(board[j][moves[i]-1]);
					
					// 스택이 비어있지 않는경우 -> 인형이 동일한지 아닌지 비교
					else {
						// 인형이 동일하면 제거 후 사라진 인형개수 +2
						if(s.peek() == board[j][moves[i]-1]) {
							s.pop();
							answer += 2;
						}
						// 인형이 동일하지 않으면 스택에 인형 넣기
						else {
							s.push(board[j][moves[i]-1]);
						}
					}
					// 해당 작업 끝난 후에는 인형을 빼냈으므로 0으로 만든다.(인형이 없다는 표시)
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	*/
}
