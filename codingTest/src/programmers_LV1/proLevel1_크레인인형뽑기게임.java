package programmers_LV1;

import java.util.ArrayList;
import java.util.Stack;

public class proLevel1_ũ���������̱���� {

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
				//moves[i] �� ���� ���� ���� ��Ÿ�� -> moves[i] - 1 �� �� ���� �ε�����
				//for j �� ���� ���� ���� �ִ�(0�� �ƴ�) ������ ����
				if (board[j][moves[i] - 1] != 0) {
					//list(�ٱ���) ��������� ���� ��� 
					if (list.isEmpty()) {
						list.add(board[j][moves[i] - 1]);
						
					//list(�ٱ���) ������� �ʰ�
					} else {
						//list�� ������(�ٱ����� �� ��) ������ ������ ���ؼ�
						//���ٸ� list(�ٱ���)���� ���� �����ϰ�
						//������ ���� ����(answer)�� +2
						if (list.get(list.size() - 1) == board[j][moves[i] - 1]) {
							list.remove(list.size() - 1);
							answer += 2;
						//�ٸ��ٸ� list(�ٱ���)�� �߰�
						} else {
							list.add(board[j][moves[i] - 1]);
						}
					}
					
					//���� ������ 0���� �����ϰ� (�� ����)
					//break�� -> ���� ���� �̱� ����
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
        
        System.out.println(answer);
        return answer;
    }
	
	
	//Stack �̿��� Ǯ��
	/*
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					
					// ������ ����ִ°�� -> �ش� ���� �ֱ�
					if(s.isEmpty())
						s.push(board[j][moves[i]-1]);
					
					// ������ ������� �ʴ°�� -> ������ �������� �ƴ��� ��
					else {
						// ������ �����ϸ� ���� �� ����� �������� +2
						if(s.peek() == board[j][moves[i]-1]) {
							s.pop();
							answer += 2;
						}
						// ������ �������� ������ ���ÿ� ���� �ֱ�
						else {
							s.push(board[j][moves[i]-1]);
						}
					}
					// �ش� �۾� ���� �Ŀ��� ������ �������Ƿ� 0���� �����.(������ ���ٴ� ǥ��)
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	*/
}
