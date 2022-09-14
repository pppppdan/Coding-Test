package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ���հ���_���δٸ��κй��ڿ��ǰ��� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		HashMap<String, Integer> map = new HashMap<>();
		int len = 1;
		
		while (!map.containsKey(str)) {
			for (int i = 0; i <= str.length() - len; i++) { 
				map.put(str.substring(i, i + len), 0);	
			}
			
			len++;
		}
		
		System.out.println(map.size());
		
		br.close();
	}

}
