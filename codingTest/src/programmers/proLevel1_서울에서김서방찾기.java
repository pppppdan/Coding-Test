package programmers;

public class proLevel1_���￡���輭��ã�� {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		
		solution(seoul);
	}
	
	/*
	 * String �Һ� 
	 * 	-> ���ڿ� ���� �� ������ ���޸𸮿� �ν��Ͻ� ����
	 * 	-> ���޸𸮿� Garbage ����ؼ� ���� -> ���޸� ���� ���� �߻� ����
	 * 
	 * 	- ���� �� ���ڿ� �����ؾ� �� ��� ���� ���� ����
	 * 	- �Һ� -> ��Ƽ������ ȯ�濡�� ����
	 * 
	 * StringBuffer, StringBuilder ���� 
	 * 	-> ���� ��ü���� ���ڿ� ���� ����
	 * 
	 * 	- StringBuffer : ����ȭ ���� -> ��Ƽ������ ȯ�濡�� ����
	 * 	- StringBulider : ����ȭ ���� X / ���Ͼ����忡�� StringBuffer���� ���� ����
	 */
	
	public static String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("�輭���� ");
        
        for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				sb.append(i);
				break;
			}
		}
        
        sb.append("�� �ִ�");
        
        return sb.toString();
    }

}
