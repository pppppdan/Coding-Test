package programmers_LV1;


public class proLevel1_1차_다트게임 {

	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		
		solution(dartResult);
	}
	
	public static int solution(String dartResult) {
		String[] result = dartResult.split("");
		String num = "";
		int n = 0;
		int idx = 0;
		int[] score = new int[3];
		
		for (int i = 0; i < result.length; i++) {
			if (result[i].matches("[0-9]")) {
				num += result[i];
			} else if (result[i].matches("[S|D|T]")) {
				n = Integer.parseInt(num);
				
				switch (result[i]) {
				case "S":
					score[idx] = n;
					break;
				case "D":
					score[idx] = (int) Math.pow(n, 2);
					break;
				case "T":
					score[idx] = (int) Math.pow(n, 3);
					break;
				}
				
				num = "";
				idx++;
			} else {
				if (result[i].equals("*")) {
					score[idx - 1] *= 2;
                    
					if (idx - 2 >= 0) {
						score[idx - 2] *= 2;
					}
				} else { //#
					score[idx - 1] *= (-1);
				}
			}
		}
		
		return score[0] + score[1] + score[2];
    }

}
