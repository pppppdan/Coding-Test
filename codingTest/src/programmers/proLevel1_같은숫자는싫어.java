package programmers;

import java.util.LinkedList;
import java.util.List;

public class proLevel1_같은숫자는싫어 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		solution(arr);
	}
	
	
	/*
	 * ArrayList 데이터 검색에 유리
	 * LinkedList 데이터 추가/삭제에 유리
	 */
	public static int[] solution(int[] arr) {
        List<Integer> list = new LinkedList<>();
        list.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
        	if (arr[i - 1] != arr[i]) {
        		list.add(arr[i]);
			}
		}
        
        int[] answer = new int[list.size()];
        int idx = 0;
        
        for (Integer integer : list) {
			answer[idx] = integer;
			idx++;
		}

        return answer;
    }

}
