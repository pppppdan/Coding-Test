package programmers;

import java.util.HashMap;

public class proLevel2_1��_ĳ�� {
	// LRU(Least Recently Used)
	// ���� �������� �������� ���� �������� ��ü�ϴ� ���
	
	// Cache Hit : CPU �� �����ϰ��� �ϴ� �޸𸮰� ĳ�ÿ� �����ϰ� ���� ���
	// Cache Miss : CPU �� �����ϰ��� �ϴ� �޸𸮰� ĳ�ÿ� �������� ���� ���

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
