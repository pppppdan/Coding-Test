package programmers;

import java.util.HashMap;

public class proLevel2_1차_캐시 {
	// LRU(Least Recently Used)
	// 가장 오랫동안 참조되지 않은 페이지를 교체하는 방식
	
	// Cache Hit : CPU 가 참조하고자 하는 메모리가 캐시에 존재하고 있을 경우
	// Cache Miss : CPU 가 참조하고자 하는 메모리가 캐시에 존재하지 않을 경우

	public static void main(String[] args) {
		int cacheSize = 3;
		//String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		
		System.out.println(solution(cacheSize, cities));
	}
	
	public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
			return cities.length * 5;
		}
        
        HashMap<String, Integer> map = new HashMap<>();
        int num = 1;
        
        for (String s : cities) {
        	s = s.toLowerCase();
        	
			if (!map.containsKey(s)) {
				map.put(s, num++);
			}
		}
        
        int[] lru = new int[cacheSize];
        int time = 0, idx;
        boolean check;
        
        for (String s : cities) {
        	check = false;
        	idx = 0;
        	s = s.toLowerCase();
        	
			for (int i = 0; i < lru.length; i++) {
				if (lru[i] == map.get(s)) {
					check = true;
					idx = i;
					break;
				}
			}
			
			while (idx + 1 < cacheSize) {
				if (lru[idx + 1] != 0) {
					lru[idx] = lru[idx + 1];
				}
				
				idx++;
			}
			
			lru[idx] = map.get(s);
			
			if (check) { // Cache Hit
				time += 1;
			} else { // Cache Miss
				time += 5;
			}
		}
        
        return time;
    }

}
