package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class proLevel1_실패율 {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		solution(N, stages);
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int arrive = 0; //스테이지 도달한 유저 수
        int fail = 0; //스테이지 도달했지만 실패한 유저 수
        double failureLate = 0; //실패율
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int idx = 0;
        
        //실패율 구해서 Map에 넣기
        for (int i = 1; i <= N; i++) { //스테이지 번호
        	for (int j = 0; j < stages.length; j++) { //유저가 멈춰있는 스테이지 번호
        		if (stages[j] >= i) arrive++;
				if (stages[j] == i) fail++;
			}
			
        	//스테이지에 도달한 유저 없는 경우, 실패율 0
			if (arrive == 0) {
				failureLate = 0;
			//실패율 계산 (스테이지 도달했지만 실패한 유저 수 / 스테이지 도달한 유저 수)
			//실패율을 비교해서 내림차순으로 정렬해야 하기 때문에 실패율은 double로 선언
			//따라서 계산할 때 double로 형변환 필요
			} else {
				failureLate = (double)fail / arrive;
			}
			
			//스테이지 번호(key), 실패율(value) Map에 넣기
			//실패율은 중복 가능하기 때문에 스테이지 번호를 key값으로 설정
			map.put(i, failureLate);
			
			//다음 스테이지의 실패율 계산하기 위해 0으로 초기화
			arrive = 0;
			fail = 0;
		}
        
        
        //Map의 value로 내림차순 정렬 - Comparator 이용 ***
        List<Entry<Integer, Double>> entryList 
        	= new LinkedList<Entry<Integer, Double>>(map.entrySet());
        
        entryList.sort(new Comparator<Entry<Integer, Double>>() {
        	@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				return o2.getValue().compareTo(o1.getValue()); //내림차순
				//return o1.getValue().compareTo(o2.getValue()); //오름차순
			}
		});
        
        //내림차순으로 정렬한 entryList의 key값(스테이지 번호)을 answer에 넣기 
        for(Entry<Integer, Double> key : entryList) {
			System.out.println(key.getKey() + ":" + key.getValue());
			answer[idx] = key.getKey();
			idx++;
		}
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}
