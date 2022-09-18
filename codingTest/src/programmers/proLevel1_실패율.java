package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class proLevel1_������ {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		solution(N, stages);
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int arrive = 0; //�������� ������ ���� ��
        int fail = 0; //�������� ���������� ������ ���� ��
        double failureLate = 0; //������
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int idx = 0;
        
        //������ ���ؼ� Map�� �ֱ�
        for (int i = 1; i <= N; i++) { //�������� ��ȣ
        	for (int j = 0; j < stages.length; j++) { //������ �����ִ� �������� ��ȣ
        		if (stages[j] >= i) arrive++;
				if (stages[j] == i) fail++;
			}
			
        	//���������� ������ ���� ���� ���, ������ 0
			if (arrive == 0) {
				failureLate = 0;
			//������ ��� (�������� ���������� ������ ���� �� / �������� ������ ���� ��)
			//�������� ���ؼ� ������������ �����ؾ� �ϱ� ������ �������� double�� ����
			//���� ����� �� double�� ����ȯ �ʿ�
			} else {
				failureLate = (double)fail / arrive;
			}
			
			//�������� ��ȣ(key), ������(value) Map�� �ֱ�
			//�������� �ߺ� �����ϱ� ������ �������� ��ȣ�� key������ ����
			map.put(i, failureLate);
			
			//���� ���������� ������ ����ϱ� ���� 0���� �ʱ�ȭ
			arrive = 0;
			fail = 0;
		}
        
        
        //Map�� value�� �������� ���� - Comparator �̿� ***
        List<Entry<Integer, Double>> entryList 
        	= new LinkedList<Entry<Integer, Double>>(map.entrySet());
        
        entryList.sort(new Comparator<Entry<Integer, Double>>() {
        	@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				return o2.getValue().compareTo(o1.getValue()); //��������
				//return o1.getValue().compareTo(o2.getValue()); //��������
			}
		});
        
        //������������ ������ entryList�� key��(�������� ��ȣ)�� answer�� �ֱ� 
        for(Entry<Integer, Double> key : entryList) {
			System.out.println(key.getKey() + ":" + key.getValue());
			answer[idx] = key.getKey();
			idx++;
		}
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}
