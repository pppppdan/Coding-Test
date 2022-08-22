package programmers_LV1;

public class proLevel1_약수의개수와덧셈 {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;

		// int left = 24;
		// int right = 27;

		solution(left, right);

	}

	public static int solution(int left, int right) {
		// 좋은 풀이
		int answer = 0;
		int cnt = 0;

		for (int i = left; i <= right; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			answer += (cnt % 2 == 0) ? i : -i;
			cnt = 0;
		}

		return answer;

		/*
		 * 내 풀이 
		 * 
		 * int answer = 0;
		 * 
		 * HashMap<Integer, Integer> hm = new HashMap<>(); 
		 * ArrayList<Integer> al = new ArrayList<>();
		 * 
		 * for (int i = left; i <= right; i++) { 
		 * 	for (int j = 1; j <= i; j++) { 
		 * 		if (i % j == 0) { 
		 * 			al.add(j); 
		 * 		} 
		 * 	} 
		 * 	hm.put(i, al.size()); al.clear(); 
		 * }
		 * 
		 * //System.out.println(hm); //{16=5, 17=2, 13=2, 14=4, 15=4}
		 * 
		 * for (Integer i : hm.keySet()) { 
		 * 	answer += (hm.get(i) % 2 == 1 ? -1 : 1) * i;
		 * }
		 * 
		 * //System.out.println(answer);
		 * 
		 * return answer;
		 */

	}

}
